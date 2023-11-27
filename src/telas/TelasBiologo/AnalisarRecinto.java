/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.TelasBiologo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import zoologico.Biologo;
import zoologico.GerenciadorArquivos;
import zoologico.Recinto;
import zoologico.RecintoAnfibio;
import zoologico.RecintoAve;
import zoologico.RecintoMamifero;
import zoologico.RecintoPeixe;
import zoologico.RecintoRepteis;

// Tela para analisar os recintos designados para um biólogo específico ou todos os recintos no caso do diretor, podendo serem feitas edições e remoções

/**
 *
 * @author Vinicius
 */
public class AnalisarRecinto extends javax.swing.JFrame {
    GerenciadorArquivos arquivo;
    ArrayList<Integer> recintosFiltrados = new ArrayList<Integer>();
    ArrayList<Integer> recintosResponsavel = new ArrayList<Integer>();
    boolean filtrado;
    Biologo biologoEscolhido = null;
    /**
     * Creates new form EditarRecinto
     */
    public AnalisarRecinto() {
        initComponents();
        
        jrTipo.setSelected(true);
        txtFamiliaRecinto.setEnabled(false);
        
        setLocationRelativeTo(null);
        
        carregarTabelaRecintos();
    }
    
    public AnalisarRecinto(GerenciadorArquivos arquivo) {
        initComponents();
        
        jrTipo.setSelected(true);
        txtFamiliaRecinto.setEnabled(false);
        
        carregarTabelaRecintos();
        
        setLocationRelativeTo(null);
        
        this.arquivo = arquivo;
    }
    
    public AnalisarRecinto(GerenciadorArquivos arquivo, Biologo biologoEscolhido) {
        initComponents();
        
        jrTipo.setSelected(true);
        txtFamiliaRecinto.setEnabled(false);
        this.biologoEscolhido = biologoEscolhido;
        
        carregarTabelaRecintos();
        
        setLocationRelativeTo(null);
        
        this.arquivo = arquivo;
    }
    
    public void carregarTabelaRecintos(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Tipo de recinto", "Família", "Vegetação"}, 0);
                
        if (biologoEscolhido != null) {
            ArrayList <String> idRecintos = biologoEscolhido.getIdRecintosResponsavel();
            for(int i=0;i < GerenciadorArquivos.getRecintos().size(); i++) {
                System.out.println(idRecintos);
                if (idRecintos.contains(GerenciadorArquivos.getRecintos().get(i).getRecintoId())) {
                    recintosResponsavel.add(i);
                    Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                        GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                        GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                    modelo.addRow(linha);
                }
            }
        } else {
            for(int i=0;i < GerenciadorArquivos.getRecintos().size(); i++) {
                Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                    GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                    GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                modelo.addRow(linha);
            }
        }
        tblRecintos.setModel(modelo);
    }
    
    public void carregarTabelaPesRecintos(String comparar, boolean flag){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Tipo de recinto", "Família", "Vegetação"}, 0);
        
        for(int i=0;i < GerenciadorArquivos.getRecintos().size(); i++) {
            if (biologoEscolhido != null) {
                if(flag == true){
                    if(GerenciadorArquivos.getRecintos().get(i).toString().toLowerCase().startsWith(comparar)){
                        recintosFiltrados.add(i);
                        Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                                            GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                                            GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                        modelo.addRow(linha);

                    }
                }
                else{
                    if(GerenciadorArquivos.getRecintos().get(i).getFamilia().toLowerCase().startsWith(comparar)){
                        recintosFiltrados.add(i);
                        Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                                            GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                                            GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                        modelo.addRow(linha);
                    }

                }
            } else {
                if(flag == true){
                    if(GerenciadorArquivos.getRecintos().get(i).toString().toLowerCase().startsWith(comparar)){
                        recintosFiltrados.add(i);
                        Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                                            GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                                            GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                        modelo.addRow(linha);

                    }
                } else{
                    if(GerenciadorArquivos.getRecintos().get(i).getFamilia().toLowerCase().startsWith(comparar)){
                        recintosFiltrados.add(i);
                        Object linha[] = new Object[]{GerenciadorArquivos.getRecintos().get(i).toString(),
                                            GerenciadorArquivos.getRecintos().get(i).getFamilia(),
                                            GerenciadorArquivos.getRecintos().get(i).getTipoVegetação()};
                        modelo.addRow(linha);
                    }
                }
            }
        }
        
        tblRecintos.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        btnDeletarRecinto = new javax.swing.JButton();
        btnEditarRecinto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRecintos = new javax.swing.JTable();
        txtTipoRecinto = new javax.swing.JTextField();
        txtFamiliaRecinto = new javax.swing.JTextField();
        btnPesquisarRecinto = new javax.swing.JButton();
        jrTipo = new javax.swing.JRadioButton();
        jrFamilia = new javax.swing.JRadioButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Recinto", "Espécie", "Vegetação"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnDeletarRecinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3844424_can_delete_remove_trash_icon.png"))); // NOI18N
        btnDeletarRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarRecintoActionPerformed(evt);
            }
        });

        btnEditarRecinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/lapis.png"))); // NOI18N
        btnEditarRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarRecintoActionPerformed(evt);
            }
        });

        tblRecintos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Tipo de recinto", "Família", "Vegetação"
            }
        ));
        tblRecintos.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tblRecintosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tblRecintosFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(tblRecintos);

        txtTipoRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoRecintoActionPerformed(evt);
            }
        });

        btnPesquisarRecinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/3844432-magnifier-search-zoom_110300.png"))); // NOI18N
        btnPesquisarRecinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarRecintoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrTipo);
        jrTipo.setText("Filtrar por tipo:");
        jrTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTipoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrFamilia);
        jrFamilia.setText("Filtrar por família:");
        jrFamilia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFamiliaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnEditarRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrTipo)
                            .addComponent(jrFamilia))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipoRecinto)
                            .addComponent(txtFamiliaRecinto))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTipoRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrTipo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFamiliaRecinto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrFamilia))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditarRecinto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletarRecinto, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeletarRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarRecintoActionPerformed
        
        if (tblRecintos.getSelectedRowCount() == 1) {
            int index = 0;
            System.out.println(filtrado);
            if (filtrado == false) {
                if (biologoEscolhido != null) index = recintosResponsavel.get(tblRecintos.getSelectedRow());
                else index = tblRecintos.getSelectedRow();
            } else {
                index = recintosFiltrados.get(tblRecintos.getSelectedRow());
                System.out.println(index);
            }
        
            if (index>=0 && index<GerenciadorArquivos.getRecintos().size()) {
                Recinto recinto = GerenciadorArquivos.getRecintos().get(index);
                
                for (int i = 0; i < GerenciadorArquivos.getFuncionarios().size(); i++) {
                    if (recinto.getBiologosResponsaveis().contains(GerenciadorArquivos.getFuncionarios().get(i).getCpf())) {
                        Biologo bio = (Biologo) GerenciadorArquivos.getFuncionarios().get(i);
                        bio.removerIdRecinto(recinto.getRecintoId());
                    }
                }
                
                //biologoEscolhido.removerIdRecinto(recinto.getRecintoId());
                arquivo.removerObjeto(2, recinto);
                btnPesquisarRecinto.doClick();
            }
        } else if (tblRecintos.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um recinto da tabela", "Mais de um recinto escolhido", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Escolha um recinto da tabela", "Recinto não escolhido", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnDeletarRecintoActionPerformed

    private void tblRecintosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRecintosFocusGained
        
    }//GEN-LAST:event_tblRecintosFocusGained

    private void tblRecintosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tblRecintosFocusLost
       
    }//GEN-LAST:event_tblRecintosFocusLost

    private void btnEditarRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarRecintoActionPerformed
        if (tblRecintos.getSelectedRowCount() == 1) {
            int index = 0;
            System.out.println(filtrado);
            if (filtrado == false) {
                if (biologoEscolhido != null) index = recintosResponsavel.get(tblRecintos.getSelectedRow());
                else index = tblRecintos.getSelectedRow();
            } else {
                index = recintosFiltrados.get(tblRecintos.getSelectedRow());
                System.out.println(index);
            }
            Recinto recintoEscolhido = GerenciadorArquivos.getRecintos().get(index);
            switch (recintoEscolhido.toString()) {
                case ("Ave"):
                    new RecintoAveTela(arquivo, (RecintoAve) recintoEscolhido).setVisible(true);
                    break;
                case ("Mamífero"):
                    new RecintoMamiferoTela(arquivo, (RecintoMamifero) recintoEscolhido).setVisible(true);
                    break;
                case ("Anfíbio"):
                    new RecintoAnfibioTela(arquivo, (RecintoAnfibio) recintoEscolhido).setVisible(true);
                    break;
                case ("Peixe"):
                    new RecintoPeixeTela(arquivo, (RecintoPeixe) recintoEscolhido).setVisible(true);
                    break;
                case ("Reptíl"):
                    new RecintoRepteisTela(arquivo, (RecintoRepteis) recintoEscolhido).setVisible(true);
                    break;
                default:
                    throw new AssertionError();
            }
            
        } else if (tblRecintos.getSelectedRowCount() > 1) {
            JOptionPane.showMessageDialog(null, "Escolha apenas um recinto da tabela", "Mais de um recinto escolhido", JOptionPane.PLAIN_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(null, "Escolha um recinto da tabela", "Recinto não escolhido", JOptionPane.PLAIN_MESSAGE);
        }
        
    }//GEN-LAST:event_btnEditarRecintoActionPerformed

    private void txtTipoRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoRecintoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoRecintoActionPerformed

    private void btnPesquisarRecintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarRecintoActionPerformed
        String comparar;
        boolean flag;
        if (txtFamiliaRecinto.getText().equals("") && txtTipoRecinto.getText().equals("")) filtrado = false;
        else filtrado = true;
        recintosFiltrados.clear();
        if(jrTipo.isSelected()){
            if (txtTipoRecinto.getText().equals("")) {
                carregarTabelaRecintos();
            } else {
                comparar = txtTipoRecinto.getText().toLowerCase();
                flag = true;
                carregarTabelaPesRecintos(comparar, flag);
            }
            
        }
        else {
            if (txtFamiliaRecinto.getText().equals("")) {
                carregarTabelaRecintos();
            } else {
                comparar = txtFamiliaRecinto.getText().toLowerCase();
                flag = false;
                carregarTabelaPesRecintos(comparar, flag);
            }
        }
    }//GEN-LAST:event_btnPesquisarRecintoActionPerformed

    private void jrTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTipoActionPerformed
        txtFamiliaRecinto.setEnabled(false);
        txtTipoRecinto.setEnabled(true);
    }//GEN-LAST:event_jrTipoActionPerformed

    private void jrFamiliaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFamiliaActionPerformed
        txtFamiliaRecinto.setEnabled(true);
        txtTipoRecinto.setEnabled(false);
    }//GEN-LAST:event_jrFamiliaActionPerformed

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
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnalisarRecinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalisarRecinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalisarRecinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalisarRecinto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalisarRecinto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarRecinto;
    private javax.swing.JButton btnEditarRecinto;
    private javax.swing.JButton btnPesquisarRecinto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton jrFamilia;
    private javax.swing.JRadioButton jrTipo;
    private javax.swing.JTable tblRecintos;
    private javax.swing.JTextField txtFamiliaRecinto;
    private javax.swing.JTextField txtTipoRecinto;
    // End of variables declaration//GEN-END:variables
}
