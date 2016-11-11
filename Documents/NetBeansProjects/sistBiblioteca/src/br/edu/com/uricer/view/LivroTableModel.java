/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.view;

import br.edu.com.uricer.model.Livro;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author -Tiago
 */
public class LivroTableModel extends AbstractTableModel {

    private List<Livro> livros;

    public LivroTableModel(List<Livro> livros) {
        this.livros = livros;
    }

    public void setPessoas(List<Livro> pessoas) {
        this.livros = livros;
    }

    @Override
    public int getRowCount() {
        return livros.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Livro pessoa = livros.get(rowIndex);
        switch (columnIndex) {
            case 0: return pessoa.getId();
            case 1: return pessoa.getTitulo();
            case 2: return pessoa.getAutor();
            case 3: return pessoa.getData();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Id";
            case 1: return "Titulo";
            case 2: return "Autor";
            case 3: return "Data";
            default:
                throw new AssertionError();
        }
    }

}
