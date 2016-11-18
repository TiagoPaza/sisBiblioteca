/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.view;


import br.edu.com.uricer.dao.LivrosDAO;
import br.edu.com.uricer.model.Livro;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author -Tiago
 */
public class sisEmpres extends javax.swing.JFrame {
private final DefaultTableModel  dadosComp, dadosEmpr;
private final String[][] Dados;
private final String[] Info1 = {"ID", "Título","Autor", "Estado"};
private final String[] Info2;
int disp = 0;

    public sisEmpres() {
        this.Info2 = new String[]{"Código Estudante", "ID", "Título", "Data de Entrega"};
        this.Dados = new String[][]{};
        
        initComponents();
        
        Date hoje = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(hoje);
        
        cal.add(Calendar.DAY_OF_MONTH, 7);
        hoje = cal.getTime();
        
        dadosComp = new DefaultTableModel(Dados, Info1);
        selTabela1.setModel(dadosComp);
        
        dadosEmpr = new  DefaultTableModel (Dados, Info2);
        selTabela2.setModel(dadosEmpr);    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selTabela1 = new javax.swing.JTable();
        emprLivro = new javax.swing.JButton();
        cancLivro = new javax.swing.JButton();
        exbLivros = new javax.swing.JButton();
        data = new javax.swing.JLabel();
        adcLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selTabela2 = new javax.swing.JTable();
        dataNome = new javax.swing.JLabel();
        hoje = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes dos livros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        selTabela1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        selTabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Estado", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(selTabela1);

        emprLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emprLivro.setText("Emprestar");
        emprLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprLivroActionPerformed(evt);
            }
        });

        cancLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancLivro.setText("Cancelar");
        cancLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancLivroActionPerformed(evt);
            }
        });

        exbLivros.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        exbLivros.setText("Exibir livros");
        exbLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exbLivrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cancLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emprLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exbLivros))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(224, 224, 224)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(224, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancLivro)
                        .addComponent(emprLivro))
                    .addComponent(exbLivros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(117, 117, 117)
                    .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(117, Short.MAX_VALUE)))
        );

        adcLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        adcLivro.setText("Adicionar livro");
        adcLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcLivroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de empréstimo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N

        selTabela2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        selTabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cód. Compra", "ID", "Título", "Valor unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(selTabela2);

        dataNome.setText("Data");

        hoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hojeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dataNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hoje, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataNome)
                    .addComponent(hoje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        jLabel3.setFont(new java.awt.Font("Capture Smallz", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Empréstimo de livro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(adcLivro))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(126, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(adcLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 613, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adcLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcLivroActionPerformed
        String ID = JOptionPane.showInputDialog("Digite o ID do livro: ");
        String Titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
        String Autor = JOptionPane.showInputDialog("Digite o Autor do livro: ");
        String Preco = "DISPONIVEL";

        if( existeLivro(ID, Titulo) )
        JOptionPane.showMessageDialog(this, "Este livro já foi registrado.");
        else {
            JOptionPane.showMessageDialog(this, "O livro foi regitrado.");
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Datos[] = {ID, Titulo, Autor, Preco};
            dadosComp.addRow(Datos);
        }
    }//GEN-LAST:event_adcLivroActionPerformed
 private int busCarrinho(int s) {
        String ID = (String) dadosComp.getValueAt(s, 0);
        String Titulo = (String) dadosComp.getValueAt(s, 1);
        
        for(int i=0; i< dadosEmpr.getRowCount(); ++i) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) dadosEmpr.getDataVector().get(i);
            if(v.get(0).equals(ID) && v.get(1).equals(Titulo))
                return i;
        }
        return -1;        
    }
    private boolean existeLivro(String ID, String Titulo) {
        Iterator it = dadosComp.getDataVector().iterator();
        while(it.hasNext()) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) it.next();
            if(v.get(0).equals(ID) && v.get(1).equals(Titulo))
                return true;
        }
        return false;
    }
    private void exbLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exbLivrosActionPerformed

    }//GEN-LAST:event_exbLivrosActionPerformed

    private void cancLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancLivroActionPerformed
        int s = selTabela1.getSelectedRow();
        if(s==-1)
        JOptionPane.showMessageDialog(this,"Por favor selecione una fila.");
        else dadosComp.removeRow(s);
    }//GEN-LAST:event_cancLivroActionPerformed

    private void emprLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprLivroActionPerformed
        int s = selTabela1.getSelectedRow();

        String dispond = (String) selTabela1.getValueAt(s, 3);

        if(dispond=="DISPONIVEL"){

            if(s==-1) {
                JOptionPane.showMessageDialog(this, "Selecione o(s) livro(s) que deseja comprar.");
            }
            else{
                int pos = busCarrinho(s);
                if( pos != -1 ) {
                    String cantidad = JOptionPane.showInputDialog("Livro adquirido. Digite a quantidade que deseja realizar o empréstimo: ");
                    if(cantidad.equals("0"))
                    dadosEmpr.removeRow(pos);
                    else dadosEmpr.setValueAt(cantidad, pos, 2);
                    return;
                }
                String codigo = JOptionPane.showInputDialog("Digite o código do estudante: ");
                String data = hoje.getText();
                Object fila [] = new Object[dadosEmpr.getColumnCount()];
                fila[0] = codigo;
                fila[1] = dadosComp.getValueAt(s, 0); // ID.
                fila[3] = data;
                fila[2] = dadosComp.getValueAt(s, 1);//titulo
                dadosEmpr.addRow(fila);

                // poner no disponible cuando va prestar libro
                int filasn = selTabela1.getSelectedRow();
                dadosComp.setValueAt("INDISPONIVEL", filasn,3);

            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Livro não disponível");
        }
    }//GEN-LAST:event_emprLivroActionPerformed

    private void hojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hojeActionPerformed
         hoje.setText("");
    }//GEN-LAST:event_hojeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(sisEmpres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sisEmpres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sisEmpres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sisEmpres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sisEmpres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adcLivro;
    private javax.swing.JButton cancLivro;
    private javax.swing.JLabel data;
    private javax.swing.JLabel dataNome;
    private javax.swing.JButton emprLivro;
    private javax.swing.JButton exbLivros;
    private javax.swing.JTextField hoje;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable selTabela1;
    private javax.swing.JTable selTabela2;
    // End of variables declaration//GEN-END:variables
    private Livro livro;
    private LivrosDAO livrosDAO;
    private List<Livro> Livros;
    private LivroTableModel LivroTableModel;
}