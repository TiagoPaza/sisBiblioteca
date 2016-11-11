package br.edu.com.uricer.dao;

import br.edu.com.uricer.model.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author -Tiago
 */
public class LivrosDAO {

    private Connection con;

    public LivrosDAO(Connection con) {
        this.con = con;
    }

    public Integer create(Livro livro) throws SQLException {
        String sql = "insert into Livros(titulo, autor, data) values (?, ?, ?)";
        Integer idCriado = 0;
        try (PreparedStatement stm = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stm.setString(1, livro.getTitulo());
            stm.execute();
            
            try (ResultSet resultSet = stm.getGeneratedKeys()) {
                while (resultSet.next()) {
                    idCriado = resultSet.getInt(1);
                }
            }            
            con.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar executar insercao: " + ex.getMessage());
            con.rollback();
        }
        
        return idCriado;
    }
    
    public Livro findById(Integer id) throws SQLException {
        String sql = "select * from Livros p where p.id = ?";
        Livro livro = null;
        try(PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, id);
            stm.execute();
            
            try(ResultSet resultSet = stm.getResultSet()) {
                while(resultSet.next()) {
                    livro = new Livro();
                    livro.setId(resultSet.getInt("id"));
                    livro.setTitulo(resultSet.getString("titulo"));
                    livro.setAutor(resultSet.getString("autor"));
                }
            }
        }
        
        return livro;
    }
    
    public List<Livro> findByNome(String nome) throws SQLException {
        String sql = "select * from Livros p where upper(p.nome) like ?";
        List<Livro> livros = new ArrayList<>();
        Livro livro = null;
        try(PreparedStatement stm = con.prepareStatement(sql)) {
            
            stm.setString(1, "%" + nome.toUpperCase() + "%");
            stm.execute();
            
            try(ResultSet resultSet = stm.getResultSet()) {
                while(resultSet.next()) {
                    livro = new Livro();
                    livro.setId(resultSet.getInt("id"));
                    livro.setTitulo(resultSet.getString("titulo"));
                    livro.add(livro);
                }
            }
        }
        return livros;
    }   
    
    public void update(Livro livro) throws SQLException {
        String sql = "update Livros set nome = ? where id = ?";
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setString(1, livro.getTitulo());
            stm.setInt(2, livro.getId());
            stm.executeUpdate();
            
            con.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar executar atualização: " + ex.getMessage());
            con.rollback();
        }
    }
    
    public void delete(Livro livro) throws SQLException {
        String sql = "delete from Livros where id = ?";
        
        try (PreparedStatement stm = con.prepareStatement(sql)) {
            stm.setInt(1, livro.getId());
            stm.executeUpdate();
            
            con.commit();
        } catch (Exception ex) {
            System.out.println("Erro ao tentar excluir: " + ex.getMessage());
            con.rollback();
        }
    }    
}
