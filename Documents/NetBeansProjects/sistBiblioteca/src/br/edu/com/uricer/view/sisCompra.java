/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.com.uricer.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author -Tiago
 */
public class sisCompra extends javax.swing.JFrame {
private final DefaultTableModel  dadosComp, dadosEmpr;
private final String[][] Dados = {};
private final String[] Info1 = {"ID", "Título","Autor", "Preço"};
private final String[] Info2;
int disp = 0;

    public sisCompra() {
        this.Info2 = new String[]{"ID", "Título", "Quantidade", "Preço"};
        initComponents();
        subLivro.setVisible(false);
        setExtendedState(MAXIMIZED_BOTH);
        
        Date diaAtual = new Date();
        SimpleDateFormat formata = new SimpleDateFormat("dd/MM/yyyy");
        String inf = formata.format(diaAtual);
        data.setText(inf);
        
        dadosComp = new DefaultTableModel(Dados, Info1);
        tabla.setModel(dadosComp);
        
        dadosEmpr = new  DefaultTableModel (Dados, Info2);
        Tabla2.setModel(dadosEmpr);    
        
        Tabla2.getSelectionModel().addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent lse) {
                double sub = 0;
                for(int i : Tabla2.getSelectedRows())
                    sub += Double.parseDouble((String) dadosEmpr.getValueAt(i, 2) ) * Double.parseDouble((String) dadosEmpr.getValueAt(i, 3) );
                valLivro.setText(sub+"");
            }
            
        });
    }

    public void db(){

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        compLivro = new javax.swing.JButton();
        cancLivro = new javax.swing.JButton();
        exbLivro = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        adcLivro = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla2 = new javax.swing.JTable();
        subLiv = new javax.swing.JLabel();
        calcTotal = new javax.swing.JButton();
        valLiv = new javax.swing.JLabel();
        valLivro = new javax.swing.JTextField();
        subLivro = new javax.swing.JTextField();
        data = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(198, 198, 198));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do livro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(198, 198, 198));
        jPanel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        tabla.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Autor", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);

        compLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        compLivro.setText("Comprar livro");
        compLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compLivroActionPerformed(evt);
            }
        });

        cancLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancLivro.setText("Cancelar");
        cancLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancLivroActionPerformed(evt);
            }
        });

        exbLivro.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        exbLivro.setText("Exibir livro");
        exbLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exbLivroActionPerformed(evt);
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
                        .addComponent(compLivro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exbLivro))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exbLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancLivro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7))
        );

        titulo.setFont(new java.awt.Font("Capture Smallz", 0, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Venda de livro");

        adcLivro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        adcLivro.setText("Adicionar livro");
        adcLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adcLivroActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carrinho de compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 18), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        Tabla2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Título", "Quantidade", "Preço unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla2);

        subLiv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        subLiv.setText("SubTotal do livro:");

        calcTotal.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        calcTotal.setText("Calcular total");
        calcTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTotalActionPerformed(evt);
            }
        });

        valLiv.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        valLiv.setText("Valor dos livros:");

        valLivro.setEditable(false);
        valLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valLivroActionPerformed(evt);
            }
        });

        subLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(valLiv)
                                .addGap(15, 15, 15)
                                .addComponent(valLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(subLiv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subLivro)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcTotal)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subLiv)
                            .addComponent(subLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valLiv)
                            .addComponent(valLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calcTotal)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titulo)
                                .addGap(46, 46, 46)
                                .addComponent(adcLivro)
                                .addGap(13, 13, 13)))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(data, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adcLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo))
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Detalhes dos livros");
        jPanel2.getAccessibleContext().setAccessibleName("Detalhes da compra");
        jPanel2.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compLivroActionPerformed
        int s = tabla.getSelectedRow();

        if(s==-1)
        JOptionPane.showMessageDialog(this, "Selecione o(s) livro(s) que deseja comprar.");
        else{
            int pos = busCarrinho(s);
            if( pos != -1 ) {
                String cantidad = JOptionPane.showInputDialog("Livro adquirido. Digite a quantidade que deseja comprar:");
                if(cantidad.equals("0"))
                dadosEmpr.removeRow(pos);
                else dadosEmpr.setValueAt(cantidad, pos, 2);
                return;
            }
            String quant = JOptionPane.showInputDialog("Especifique a quantidade de livros: ");
            Object fila [] = new Object[dadosEmpr.getColumnCount()];
            fila[0] = dadosComp.getValueAt(s, 0); // ID
            fila[1] = dadosComp.getValueAt(s, 1); // Título
            fila[3] = dadosComp.getValueAt(s, 3); // Preço unitario.
            fila[2] = quant;
            dadosEmpr.addRow(fila);
        }
    }//GEN-LAST:event_compLivroActionPerformed
 private int busCarrinho(int s) {
        String ISBN = (String) dadosComp.getValueAt(s, 0);
        String Titulo = (String) dadosComp.getValueAt(s, 1);
        
        for(int i=0; i< dadosEmpr.getRowCount(); ++i) {
            @SuppressWarnings("UseOfObsoleteCollectionType")
            Vector v = (Vector) dadosEmpr.getDataVector().get(i);
            if(v.get(0).equals(ISBN) && v.get(1).equals(Titulo))
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
    
    private void cancLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancLivroActionPerformed
        int s = tabla.getSelectedRow();
        if(s==-1)
        JOptionPane.showMessageDialog(this,"Por favor seleccione una fila.");
        else dadosComp.removeRow(s);
    }//GEN-LAST:event_cancLivroActionPerformed

    private void exbLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exbLivroActionPerformed
        db();
    }//GEN-LAST:event_exbLivroActionPerformed

    private void adcLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adcLivroActionPerformed
        String ID = JOptionPane.showInputDialog("Digite o ID do livro: ");
        String Titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
        String Autor = JOptionPane.showInputDialog("Digite autor do livro: ");
        String Preco = JOptionPane.showInputDialog("Digite o preço do livro: ");

        if( existeLivro(ID, Titulo) )
        JOptionPane.showMessageDialog(this, "Este livro já foi registrado.");
        else {
            JOptionPane.showMessageDialog(this, "O livro foi regitrado.");
            @SuppressWarnings("LocalVariableHidesMemberVariable")
            String Datos[] = {ID, Titulo, Autor, Preco};
            dadosComp.addRow(Datos);
        }
    }//GEN-LAST:event_adcLivroActionPerformed

    private void calcTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTotalActionPerformed
        double preco = 0;
        for(int i=0; i<dadosEmpr.getRowCount(); ++i)
        preco += Double.parseDouble((String) dadosEmpr.getValueAt(i, 2) ) * Double.parseDouble((String) dadosEmpr.getValueAt(i, 3) );
        valLivro.setText(preco+"");
    }//GEN-LAST:event_calcTotalActionPerformed

    private void subLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subLivroActionPerformed
         subLivro.setText("");
    }//GEN-LAST:event_subLivroActionPerformed

    private void valLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valLivroActionPerformed

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
            java.util.logging.Logger.getLogger(sisCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sisCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sisCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sisCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sisCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla2;
    private javax.swing.JButton adcLivro;
    private javax.swing.JButton calcTotal;
    private javax.swing.JButton cancLivro;
    private javax.swing.JButton compLivro;
    private javax.swing.JLabel data;
    private javax.swing.JButton exbLivro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel subLiv;
    private javax.swing.JTextField subLivro;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel valLiv;
    private javax.swing.JTextField valLivro;
    // End of variables declaration//GEN-END:variables
}
