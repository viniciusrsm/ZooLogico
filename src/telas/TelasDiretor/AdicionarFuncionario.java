/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas.TelasDiretor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import zoologico.Animal;
import zoologico.Biologo;
import zoologico.Funcionario;
import zoologico.GerenciadorArquivos;
import zoologico.Recinto;
import zoologico.Veterinario;

// Tela para criar um novo funcionário ou editar um já existente caso seja selecionada a função de editar na tabela de análise

/**
 *
 * @author gugas
 */
public class AdicionarFuncionario extends javax.swing.JFrame {
    GerenciadorArquivos arquivo;
    /**
     * Creates new form AdicionarFuncionario
     */
    
    boolean editor = false;
    Funcionario funcionarioEscolhido;
    //ArrayList<Animal> animaisEscolhidos = new ArrayList<Animal>();
    //ArrayList<Recinto> recintosEscolhidos = new ArrayList<Recinto>();
    ArrayList<String> idAnimaisEscolhidos = new ArrayList<String>();
    ArrayList<String> idRecintosEscolhidos = new ArrayList<String>();
    
    public AdicionarFuncionario() {
        initComponents();
        btnAddResponsabilidade.setEnabled(false);
        
        setLocationRelativeTo(null);
        
        btnAtualizarResp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarRespAnimais();
                carregarRespRecintos();
            }
            
        });
    }
    
    public AdicionarFuncionario(GerenciadorArquivos arquivo) {
        this.arquivo = arquivo;
        
        initComponents();
        btnAddResponsabilidade.setEnabled(false);
        
        setLocationRelativeTo(null);
        
        btnAtualizarResp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregarRespAnimais();
                carregarRespRecintos();
            }
            
        });
    }
    
    public AdicionarFuncionario(GerenciadorArquivos arquivo, int indexLista) {
        this.arquivo = arquivo;
        
        initComponents();
        btnAddResponsabilidade.setEnabled(false);
        
        funcionarioEscolhido = arquivo.getFuncionarios().get(indexLista);
        editor = true;

        setLocationRelativeTo(null);
        
        txtNome.setText(funcionarioEscolhido.getNome());
        txtCpf.setText(funcionarioEscolhido.getCpf());
        txtCr.setText(funcionarioEscolhido.getCr());
        txtSexo.setText(funcionarioEscolhido.getSexo());
        txtDataNascimento.setText(funcionarioEscolhido.getDataNascimento());
        txtSenha.setText(funcionarioEscolhido.getSenha());
        
        if (funcionarioEscolhido instanceof Biologo biologo) {
            jrbBiologo.setSelected(true);
            this.idRecintosEscolhidos = biologo.getIdRecintosResponsavel();
            System.out.println(this.idRecintosEscolhidos);
            carregarRespRecintos();
        } else {
            jrbVeterinario.setSelected(true);
            Veterinario vet = (Veterinario) funcionarioEscolhido;
            this.idAnimaisEscolhidos = vet.getIdAnimaisResponsavel();
            carregarRespAnimais();
        }
        
        btnAddResponsabilidade.setEnabled(true);
        jrbBiologo.setEnabled(false);
        jrbVeterinario.setEnabled(false);
        
        txtNome.setForeground(new Color(0, 0, 0));
        txtCpf.setForeground(new Color(0, 0, 0));
        txtCr.setForeground(new Color(0, 0, 0));
        txtSexo.setForeground(new Color(0, 0, 0));
        txtSenha.setForeground(new Color(0, 0, 0));
        txtDataNascimento.setForeground(new Color(0, 0, 0));
        
        
        
        btnAtualizarResp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                idAnimaisEscolhidos.clear();
                if (jrbBiologo.isSelected()) carregarRespRecintos();
                else carregarRespAnimais();
                
                System.out.println("igasdwfgadgwvgwvcd");
            }
            
        });
    }
    
    public void carregarRespAnimais(){
        DefaultTableModel modelo =  new DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Espécie", "Nome"
            }
        );
        
            ArrayList<Animal> animais = GerenciadorArquivos.getAnimais();
            for(int i=0;i < animais.size(); i++) {
                if (idAnimaisEscolhidos.contains(animais.get(i).getAnimalId())) {
                    Object linha[] = new Object[]{animais.get(i).getEspecie(),
                        animais.get(i).getNome()};
                    modelo.addRow(linha);
                }
            }
        
            tblResponsabilidades.setModel(modelo);
        
        
    }
    
    
    public void carregarRespRecintos(){
        DefaultTableModel modelo = new DefaultTableModel(
            new Object [][] {
                
            },
            new String [] {
                "Tipo de recinto", "Família"
            }
        );
        
        
            ArrayList<Recinto> recintos = GerenciadorArquivos.getRecintos();
            for(int i=0;i < recintos.size(); i++) {
                if (idRecintosEscolhidos.contains(recintos.get(i).getRecintoId())) {
                    Object linha[] = new Object[]{recintos.get(i).toString(),
                        recintos.get(i).getFamilia()};
                    modelo.addRow(linha);
                }
            }
        
            tblResponsabilidades.setModel(modelo);
        }
        
        
        
        //tblResponsabilidades.setModel(modelo);
        
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnAtualizarResp = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtCpf = new javax.swing.JTextField();
        txtDataNascimento = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        lblCargo = new javax.swing.JLabel();
        jrbVeterinario = new javax.swing.JRadioButton();
        jrbBiologo = new javax.swing.JRadioButton();
        txtCr = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnConfFuncionario = new javax.swing.JButton();
        btnCancFuncionario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResponsabilidades = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAddResponsabilidade = new javax.swing.JButton();

        btnAtualizarResp.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtNome.setForeground(new java.awt.Color(153, 153, 153));
        txtNome.setText("Nome");
        txtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeFocusLost(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtCpf.setForeground(new java.awt.Color(153, 153, 153));
        txtCpf.setText("CPF");
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCpfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost(evt);
            }
        });

        txtDataNascimento.setForeground(new java.awt.Color(153, 153, 153));
        txtDataNascimento.setText("Data de nascimento");
        txtDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataNascimentoFocusLost(evt);
            }
        });
        txtDataNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataNascimentoActionPerformed(evt);
            }
        });

        txtSexo.setForeground(new java.awt.Color(153, 153, 153));
        txtSexo.setText("Sexo");
        txtSexo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSexoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSexoFocusLost(evt);
            }
        });

        txtSenha.setForeground(new java.awt.Color(153, 153, 153));
        txtSenha.setText("Senha");
        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });

        lblCargo.setText("Cargo:");

        buttonGroup1.add(jrbVeterinario);
        jrbVeterinario.setText("Veterinário");
        jrbVeterinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbVeterinarioActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrbBiologo);
        jrbBiologo.setText("Biólogo");
        jrbBiologo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbBiologoActionPerformed(evt);
            }
        });

        txtCr.setForeground(new java.awt.Color(153, 153, 153));
        txtCr.setText("CR");
        txtCr.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCrFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCrFocusLost(evt);
            }
        });

        btnConfFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1904674_accept_approved_check_checked_confirm_icon.png"))); // NOI18N
        btnConfFuncionario.setText("CONFIRMAR");
        btnConfFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfFuncionarioActionPerformed(evt);
            }
        });

        btnCancFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1904654_cancel_close_cross_delete_reject_icon.png"))); // NOI18N
        btnCancFuncionario.setText("CANCELAR");
        btnCancFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancFuncionarioActionPerformed(evt);
            }
        });

        tblResponsabilidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblResponsabilidades);

        jLabel1.setText("Responsabilidades:");

        btnAddResponsabilidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/add.png"))); // NOI18N
        btnAddResponsabilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddResponsabilidadeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(btnConfFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCancFuncionario)
                                .addGap(55, 55, 55))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnAddResponsabilidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(txtSexo))
                                .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(jrbVeterinario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jrbBiologo, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(32, 32, 32)))
                            .addComponent(jLabel1)
                            .addComponent(txtCr, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbVeterinario)
                    .addComponent(jrbBiologo))
                .addGap(18, 18, 18)
                .addComponent(txtCr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddResponsabilidade)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfFuncionario))
                    .addComponent(btnCancFuncionario))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDataNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataNascimentoActionPerformed

    private void jrbBiologoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbBiologoActionPerformed
        btnAddResponsabilidade.setEnabled(true);
        idAnimaisEscolhidos.clear();
        carregarRespRecintos();
    }//GEN-LAST:event_jrbBiologoActionPerformed

    private void jrbVeterinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbVeterinarioActionPerformed
        btnAddResponsabilidade.setEnabled(true);
        idRecintosEscolhidos.clear();
        carregarRespAnimais();
    }//GEN-LAST:event_jrbVeterinarioActionPerformed

    private void txtNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusGained
        if(txtNome.getText().equals("Nome")) {
            txtNome.setText("");
            txtNome.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtNomeFocusGained

    private void txtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNomeFocusLost
        if(txtNome.getText().equals("")) {
            txtNome.setText("Nome");
            txtNome.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtNomeFocusLost

    private void txtCpfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusGained
        if(txtCpf.getText().equals("CPF")) {
            txtCpf.setText("");
            txtCpf.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCpfFocusGained

    private void txtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCpfFocusLost
        if(txtCpf.getText().equals("")) {
            txtCpf.setText("CPF");
            txtCpf.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCpfFocusLost

    private void txtDataNascimentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusGained
        if(txtDataNascimento.getText().equals("Data de nascimento")) {
            txtDataNascimento.setText("");
            txtDataNascimento.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtDataNascimentoFocusGained

    private void txtDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataNascimentoFocusLost
        if(txtDataNascimento.getText().equals("")) {
            txtDataNascimento.setText("Data de nascimento");
            txtDataNascimento.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtDataNascimentoFocusLost

    private void txtSexoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSexoFocusGained
        if(txtSexo.getText().equals("Sexo")) {
            txtSexo.setText("");
            txtSexo.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSexoFocusGained

    private void txtSexoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSexoFocusLost
        if(txtSexo.getText().equals("")) {
            txtSexo.setText("Sexo");
            txtSexo.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSexoFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        if(txtSenha.getText().equals("Senha")) {
            txtSenha.setText("");
            txtSenha.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        if(txtSenha.getText().equals("")) {
            txtSenha.setText("Senha");
            txtSenha.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void txtCrFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCrFocusGained
        if(txtCr.getText().equals("CR")) {
            txtCr.setText("");
            txtCr.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCrFocusGained

    private void txtCrFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCrFocusLost
        if(txtCr.getText().equals("")) {
            txtCr.setText("CR");
            txtCr.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtCrFocusLost

    private void btnAddResponsabilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddResponsabilidadeActionPerformed
        
        if (jrbVeterinario.isSelected()) {
            idAnimaisEscolhidos.clear();
            new EscolheAnimal(idAnimaisEscolhidos, btnAtualizarResp).setVisible(true);
            
        } else {
            idRecintosEscolhidos.clear();
            new EscolheRecinto(idRecintosEscolhidos, btnAtualizarResp).setVisible(true);
        }
    }//GEN-LAST:event_btnAddResponsabilidadeActionPerformed

    private void btnCancFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancFuncionarioActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancFuncionarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void btnConfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfFuncionarioActionPerformed
        if (txtCpf.getText().equals("CPF") || txtNome.getText().equals("Nome") || txtDataNascimento.getText().equals("Data de nascimento") || 
                txtSenha.getText().equals("Senha") || txtSexo.getText().equals("Sexo") || txtCr.getText().equals("CR")) 
            {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Campos não preenchidos", JOptionPane.PLAIN_MESSAGE);
        } else {
            boolean cpfExiste = false;
            for (int i=0; i < GerenciadorArquivos.getFuncionarios().size(); i++) {
                System.out.println("mano 2222222222");
                if (txtCpf.getText().equals(GerenciadorArquivos.getFuncionarios().get(i).getCpf()) && !editor) {
                    System.out.println("mano sladasudawh");
                    JOptionPane.showMessageDialog(null, "Este CPF já está cadastrado", "CPF já cadastrado", JOptionPane.PLAIN_MESSAGE);
                    cpfExiste = true;
                    break;
                }
            }
            
            System.out.println(cpfExiste);
            
            if (!cpfExiste || editor) {
                if (editor) {
                funcionarioEscolhido.setNome(txtNome.getText());
                funcionarioEscolhido.setCpf(txtCpf.getText());
                funcionarioEscolhido.setDataNascimento(txtDataNascimento.getText());
                funcionarioEscolhido.setSenha(txtSenha.getText());
                funcionarioEscolhido.setSexo(txtSexo.getText());
                funcionarioEscolhido.setCr(txtCr.getText());
                if (funcionarioEscolhido instanceof Biologo biologo) {
                    biologo.setIdRecintosResponsavel(idRecintosEscolhidos);
                } else if (funcionarioEscolhido instanceof Veterinario veterinario) {
                    veterinario.setIdAnimaisResponsavel(idAnimaisEscolhidos);
                }
            
                } else {
                    //Recinto recinto = null;
                    if (jrbBiologo.isSelected()) {
                        
                        Biologo biologoCriado = new Biologo(txtCr.getText(), idRecintosEscolhidos, txtNome.getText(), txtCpf.getText(), txtDataNascimento.getText(), txtSexo.getText(), txtSenha.getText());

                        arquivo.adicionarObjeto(1, biologoCriado);
                    } else {
                        
                        Veterinario vetCriado = new Veterinario(txtCr.getText(), idAnimaisEscolhidos, txtNome.getText(), txtCpf.getText(), txtDataNascimento.getText(), txtSexo.getText(), txtSenha.getText());

                        arquivo.adicionarObjeto(1, vetCriado);
                    }
                }
                dispose();
            }
            
            
        }
    }//GEN-LAST:event_btnConfFuncionarioActionPerformed

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
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdicionarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdicionarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddResponsabilidade;
    private javax.swing.JButton btnAtualizarResp;
    private javax.swing.JButton btnCancFuncionario;
    private javax.swing.JButton btnConfFuncionario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton jrbBiologo;
    private javax.swing.JRadioButton jrbVeterinario;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblResponsabilidades;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtCr;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtSexo;
    // End of variables declaration//GEN-END:variables
}
