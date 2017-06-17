
package com.contatos;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AgendaContatos extends javax.swing.JFrame {

    public AgendaContatos() {
        initComponents();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btNovoContato = new javax.swing.JButton();
        btListarTodos = new javax.swing.JButton();
        lbEmail = new javax.swing.JTextField();
        lbNome = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JTextField();
        lbSobrenome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbSobrenome2 = new javax.swing.JTextField();
        lbTelefone2 = new javax.swing.JTextField();
        lbEmail2 = new javax.swing.JTextField();
        lbNome2 = new javax.swing.JTextField();
        lbEmail3 = new javax.swing.JTextField();
        lbTelefone3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbSobrenome3 = new javax.swing.JTextField();
        lbNome3 = new javax.swing.JTextField();
        lbTeledone4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbSobrenome4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lbNome4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbEmail7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel4.setText("EMAIL:");

        jLabel5.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel5.setText("SOBRENOME:");

        btnCadastrar.setBackground(new java.awt.Color(115, 115, 115));
        btnCadastrar.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 102, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Aharoni", 2, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(85, 107, 47));
        jLabel1.setText("Agenda de contatos");

        jLabel6.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel6.setText("NOME:");

        jLabel7.setFont(new java.awt.Font("Aharoni", 0, 14)); // NOI18N
        jLabel7.setText(" TELEFONE:");

        btNovoContato.setBackground(new java.awt.Color(115, 115, 115));
        btNovoContato.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        btNovoContato.setForeground(new java.awt.Color(0, 102, 0));
        btNovoContato.setText("Novo contato");
        btNovoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoContatoActionPerformed(evt);
            }
        });

        btListarTodos.setBackground(new java.awt.Color(115, 115, 115));
        btListarTodos.setFont(new java.awt.Font("Aharoni", 0, 12)); // NOI18N
        btListarTodos.setForeground(new java.awt.Color(51, 102, 0));
        btListarTodos.setText("Listar todos");
        btListarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btListarTodosActionPerformed(evt);
            }
        });

        lbEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbEmailActionPerformed(evt);
            }
        });

        lbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNomeActionPerformed(evt);
            }
        });

        lbTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTelefoneActionPerformed(evt);
            }
        });

        lbSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbSobrenomeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/contatos/agenda.png"))); // NOI18N

        lbSobrenome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbSobrenome2ActionPerformed(evt);
            }
        });

        lbTelefone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTelefone2ActionPerformed(evt);
            }
        });

        lbEmail2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbEmail2ActionPerformed(evt);
            }
        });

        lbNome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNome2ActionPerformed(evt);
            }
        });

        lbEmail3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbEmail3ActionPerformed(evt);
            }
        });

        lbTelefone3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTelefone3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nome");

        lbSobrenome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbSobrenome3ActionPerformed(evt);
            }
        });

        lbNome3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNome3ActionPerformed(evt);
            }
        });

        lbTeledone4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTeledone4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Sobrenome");

        lbSobrenome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbSobrenome4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Telefone");

        lbNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNome4ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Email");

        jLabel11.setFont(new java.awt.Font("Aharoni", 2, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(85, 107, 47));
        jLabel11.setText("Lista de contatos");

        lbEmail7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbEmail7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(lbNome2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                        .addComponent(lbNome3)
                        .addComponent(lbNome4)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(lbSobrenome2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(lbSobrenome3)
                            .addComponent(lbSobrenome4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTelefone3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTelefone2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTeledone4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10))
                            .addComponent(lbEmail2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                            .addComponent(lbEmail3)
                            .addComponent(lbEmail7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbEmail)
                                    .addComponent(lbSobrenome)
                                    .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGap(68, 68, 68))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btListarTodos, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSobrenome2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSobrenome3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTelefone3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbSobrenome4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTeledone4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEmail2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(lbEmail3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbEmail7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

//        String nome = lbNome.getText();
//        lbTelefone.setText(nome);
        
        try {
            File arq = new File("arquivo.txt");
            FileWriter escritor = new FileWriter(arq, true);
            escritor.append("\nnome: " + lbNome.getText());
            escritor.append("\nSobrenome: " +lbSobrenome.getText());
            escritor.append("\nTelefone: " + lbTelefone.getText());
            escritor.append("\nEmail: " + lbEmail.getText());
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btNovoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoContatoActionPerformed
       lbNome.setText("");
       lbSobrenome.setText("");
       lbTelefone.setText("");
       lbEmail.setText("");
       
    }//GEN-LAST:event_btNovoContatoActionPerformed

    private void btListarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btListarTodosActionPerformed
        ArrayList<String> dados = new ArrayList();
        ArrayList linhas = new ArrayList();  
        String tudo = "\n";
        int cont = 0;
        
        try {
            File arq1 = new File("arquivo.txt");
            FileReader ler = new FileReader(arq1);
            BufferedReader lerArq = new BufferedReader(ler);

            while((tudo=lerArq.readLine()) != null) {   
                   linhas.add(tudo); //grava o texto no arrayList  
                     
            }
            if(lbNome2.getText().equals("")) {
                lbNome2.setText((String) linhas.get(0));
                lbSobrenome2.setText((String) linhas.get(1));
                lbTelefone2.setText((String) linhas.get(2));
                lbEmail2.setText((String) linhas.get(3));
            }if(lbNome3.getText().equals("")) {
                lbNome3.setText((String) linhas.get(4));
                lbSobrenome3.setText((String) linhas.get(5));
                lbTelefone3.setText((String) linhas.get(6));
                lbEmail3.setText((String) linhas.get(7));
                
            }            
            
        
                
                        
                
                
                
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AgendaContatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btListarTodosActionPerformed

    private void lbEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbEmailActionPerformed

    private void lbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNomeActionPerformed

    private void lbTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTelefoneActionPerformed

    private void lbSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbSobrenomeActionPerformed
       
    }//GEN-LAST:event_lbSobrenomeActionPerformed

    private void lbSobrenome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbSobrenome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSobrenome2ActionPerformed

    private void lbTelefone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTelefone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTelefone2ActionPerformed

    private void lbEmail2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEmail2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbEmail2ActionPerformed

    private void lbNome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNome2ActionPerformed
        
    }//GEN-LAST:event_lbNome2ActionPerformed

    private void lbEmail3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEmail3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbEmail3ActionPerformed

    private void lbTelefone3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTelefone3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTelefone3ActionPerformed

    private void lbSobrenome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbSobrenome3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSobrenome3ActionPerformed

    private void lbNome3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNome3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNome3ActionPerformed

    private void lbTeledone4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTeledone4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTeledone4ActionPerformed

    private void lbSobrenome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbSobrenome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSobrenome4ActionPerformed

    private void lbNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNome4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNome4ActionPerformed

    private void lbEmail7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEmail7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbEmail7ActionPerformed

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
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendaContatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendaContatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btListarTodos;
    private javax.swing.JButton btNovoContato;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lbEmail;
    private javax.swing.JTextField lbEmail2;
    private javax.swing.JTextField lbEmail3;
    private javax.swing.JTextField lbEmail7;
    private javax.swing.JTextField lbNome;
    private javax.swing.JTextField lbNome2;
    private javax.swing.JTextField lbNome3;
    private javax.swing.JTextField lbNome4;
    private javax.swing.JTextField lbSobrenome;
    private javax.swing.JTextField lbSobrenome2;
    private javax.swing.JTextField lbSobrenome3;
    private javax.swing.JTextField lbSobrenome4;
    private javax.swing.JTextField lbTeledone4;
    private javax.swing.JTextField lbTelefone;
    private javax.swing.JTextField lbTelefone2;
    private javax.swing.JTextField lbTelefone3;
    // End of variables declaration//GEN-END:variables
}
