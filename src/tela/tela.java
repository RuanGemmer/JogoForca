
package tela;

import javax.swing.JOptionPane;

/**
 *
 * @author ruang at 10/15/2022
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    public tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfLetra = new javax.swing.JTextField();
        jbtTestar = new javax.swing.JButton();
        jtfLetra1 = new javax.swing.JTextField();
        jtfLetra2 = new javax.swing.JTextField();
        jtfLetra3 = new javax.swing.JTextField();
        jtfLetra4 = new javax.swing.JTextField();
        jtfLetra5 = new javax.swing.JTextField();
        jtfLetra6 = new javax.swing.JTextField();
        jtfLetra7 = new javax.swing.JTextField();
        jtfLetra8 = new javax.swing.JTextField();
        jtfLetrasTestadas = new javax.swing.JTextField();
        jlbImagemForca = new javax.swing.JLabel();
        jbtFechar = new javax.swing.JButton();
        jbtReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("JOGO DA FORCA");

        jLabel2.setText("Insira uma Letra para testar:");

        jLabel3.setText("Letras já testadas:");

        jtfLetra.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetraActionPerformed(evt);
            }
        });
        jtfLetra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfLetraKeyTyped(evt);
            }
        });

        jbtTestar.setText("TESTAR");
        jbtTestar.setToolTipText("");
        jbtTestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTestarMouseClicked(evt);
            }
        });

        jtfLetra1.setEditable(false);
        jtfLetra1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfLetra2.setEditable(false);
        jtfLetra2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jtfLetra3.setEditable(false);
        jtfLetra3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra3ActionPerformed(evt);
            }
        });

        jtfLetra4.setEditable(false);
        jtfLetra4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra4ActionPerformed(evt);
            }
        });

        jtfLetra5.setEditable(false);
        jtfLetra5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra5ActionPerformed(evt);
            }
        });

        jtfLetra6.setEditable(false);
        jtfLetra6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra6ActionPerformed(evt);
            }
        });

        jtfLetra7.setEditable(false);
        jtfLetra7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra7ActionPerformed(evt);
            }
        });

        jtfLetra8.setEditable(false);
        jtfLetra8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtfLetra8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfLetra8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetra8ActionPerformed(evt);
            }
        });

        jtfLetrasTestadas.setEditable(false);
        jtfLetrasTestadas.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfLetrasTestadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfLetrasTestadasActionPerformed(evt);
            }
        });

        jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca0.png"))); // NOI18N

        jbtFechar.setText("Fechar");
        jbtFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jbtFecharMousePressed(evt);
            }
        });

        jbtReiniciar.setText("Reiniciar");
        jbtReiniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtReiniciarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jlbImagemForca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtfLetrasTestadas)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jtfLetra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtfLetra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jtfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jbtTestar)
                                        .addGap(12, 12, 12))
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtfLetra3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfLetra4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfLetra5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfLetra6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfLetra7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfLetra8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(237, 237, 237)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtFechar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbtFechar)
                                .addComponent(jbtReiniciar)))
                        .addGap(55, 55, 55)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfLetra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtTestar))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfLetra1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfLetra8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jlbImagemForca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLetrasTestadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfLetraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetraActionPerformed

    }//GEN-LAST:event_jtfLetraActionPerformed
    StringBuffer letrasTestadas = new StringBuffer();
    int erro = 0;
    int acerto = 0;

    private void jbtTestarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTestarMouseClicked
        String teste = "";
        //PALAVRA SECRETA: PROGRAMA
        String letra1 = "P";
        String letra2 = "R";
        String letra3 = "O";
        String letra4 = "G";
        String letra5 = "R";
        String letra6 = "A";
        String letra7 = "M";
        String letra8 = "A";

        while (true) {
            teste = jtfLetra.getText().toUpperCase();
            //testa se campo letra é vazio
            if (teste.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campo não pode ser NULO", "CAMPO VAZIO", JOptionPane.WARNING_MESSAGE);
                break;
            } else {
                if (letrasTestadas.toString().isEmpty()) {
                    letrasTestadas.append(teste);
                } else {
                    letrasTestadas.append(", ").append(teste);
                }
                jtfLetrasTestadas.setText(letrasTestadas.toString());
                break;
            }
        }

        //Caso acerte as letras
        if (teste.equals(letra1)) {
            jtfLetra1.setText(teste);
        } else if (teste.equals(letra2)) {
            jtfLetra2.setText(teste);
            jtfLetra5.setText(teste);
        } else if (teste.equals(letra3)) {
            jtfLetra3.setText(teste);
        } else if (teste.equals(letra4)) {
            jtfLetra4.setText(teste);
        } else if (teste.equals(letra6)) {
            jtfLetra6.setText(teste);
            jtfLetra8.setText(teste);
        } else if (teste.equals(letra7)) {
            jtfLetra7.setText(teste);
        } //caso erre alguma letra

        if (teste.isEmpty()) {

//Caso ganhe o jogo
        } else if (teste.equals("A") || teste.equals("P") || teste.equals("R") || teste.equals("O") || teste.equals("G") || teste.equals("M")) {
            JOptionPane.showMessageDialog(null, "Letra Correta!");
            if (jtfLetra1.getText().equals("P") && 
                    jtfLetra2.getText().equals("R") &&
                    jtfLetra3.getText().equals("O") &&
                    jtfLetra4.getText().equals("G") &&
                    jtfLetra5.getText().equals("R") &&
                    jtfLetra6.getText().equals("A") &&
                    jtfLetra7.getText().equals("M") &&
                    jtfLetra8.getText().equals("A")) {
                JOptionPane.showMessageDialog(null, "VOCÊ GANHOU!");
                
                //Opção de final de jogo!
                Object[] options = {"Reiniciar Jogo",
                    "Encerrar Jogo"};
                int n = JOptionPane.showOptionDialog(null,
                        "O que deseja fazer?",
                        "FIM DE JOGO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);

                if (n == JOptionPane.YES_OPTION) {
                    jbtReiniciarMouseClicked(evt);
                }
                if (n == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Jogo Encerrado.");
                    System.exit(0);
                }
            }
        } else {
            erro++;
            if (erro == 1) {
                jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca1.png")));
                JOptionPane.showMessageDialog(null, "1 de 5 Letras Erradas", "LETRA ERRADA", JOptionPane.ERROR_MESSAGE);
            }
            if (erro == 2) {
                jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca2.png")));
                JOptionPane.showMessageDialog(null, "2 de 5 Letras Erradas", "LETRA ERRADA", JOptionPane.ERROR_MESSAGE);
            }
            if (erro == 3) {
                jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca3.png")));
                JOptionPane.showMessageDialog(null, "3 de 5 Letras Erradas", "LETRA ERRADA", JOptionPane.ERROR_MESSAGE);
            }
            if (erro == 4) {
                jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca4.png")));
                JOptionPane.showMessageDialog(null, "4 de 5 Letras Erradas. Você não pode mais errar!", "LETRA ERRADA", JOptionPane.ERROR_MESSAGE);
            }
            if (erro == 5) {
                jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca5.png")));
                JOptionPane.showMessageDialog(null, "5 de 5 Letras Erradas. Você está ENFORCADO!", "LETRA ERRADA", JOptionPane.ERROR_MESSAGE);
                JOptionPane.showMessageDialog(null, "Palavra Secreta: PROGRAMA");
                letrasTestadas.delete(0, letrasTestadas.length());

                //Opção de final de jogo!
                Object[] options = {"Reiniciar Jogo",
                    "Encerrar Jogo"};
                int n = JOptionPane.showOptionDialog(null,
                        "O que deseja fazer?",
                        "FIM DE JOGO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]);

                if (n == JOptionPane.YES_OPTION) {
                    jbtReiniciarMouseClicked(evt);
                }
                if (n == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Jogo Encerrado.");
                    System.exit(0);
                }
            }
        }

        jtfLetra.setText("");


    }//GEN-LAST:event_jbtTestarMouseClicked

    private void jtfLetra3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra3ActionPerformed

    private void jtfLetra4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra4ActionPerformed

    private void jtfLetra5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra5ActionPerformed

    private void jtfLetra6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra6ActionPerformed

    private void jtfLetra7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra7ActionPerformed

    private void jtfLetra8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetra8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfLetra8ActionPerformed

    private void jtfLetraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfLetraKeyTyped
        String teste = "";
        teste = jtfLetra.getText().toUpperCase();
        if (teste.length() > 0) {
            JOptionPane.showMessageDialog(null, "Campo não pode conter 2 dígitos", "CAMPO VAZIO", JOptionPane.WARNING_MESSAGE);
            jtfLetra.setText("");
        }

    }//GEN-LAST:event_jtfLetraKeyTyped

    private void jtfLetrasTestadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfLetrasTestadasActionPerformed


    }//GEN-LAST:event_jtfLetrasTestadasActionPerformed

    private void jbtFecharMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtFecharMousePressed
        JOptionPane.showMessageDialog(null, "Jogo Encerrado.");
        System.exit(0);
    }//GEN-LAST:event_jbtFecharMousePressed

    private void jbtReiniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtReiniciarMouseClicked
        erro = 0;
        jtfLetra.setText("");
        jtfLetra1.setText("");
        jtfLetra2.setText("");
        jtfLetra3.setText("");
        jtfLetra4.setText("");
        jtfLetra5.setText("");
        jtfLetra6.setText("");
        jtfLetra7.setText("");
        jtfLetra8.setText("");
        jlbImagemForca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tela/Forca0.png")));
        jtfLetrasTestadas.setText("");
        letrasTestadas.delete(0, letrasTestadas.length());
        JOptionPane.showMessageDialog(null, "Jogo Reiniciado!");

    }//GEN-LAST:event_jbtReiniciarMouseClicked

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbtFechar;
    private javax.swing.JButton jbtReiniciar;
    public javax.swing.JButton jbtTestar;
    private javax.swing.JLabel jlbImagemForca;
    private javax.swing.JTextField jtfLetra;
    private javax.swing.JTextField jtfLetra1;
    private javax.swing.JTextField jtfLetra2;
    private javax.swing.JTextField jtfLetra3;
    private javax.swing.JTextField jtfLetra4;
    private javax.swing.JTextField jtfLetra5;
    private javax.swing.JTextField jtfLetra6;
    private javax.swing.JTextField jtfLetra7;
    private javax.swing.JTextField jtfLetra8;
    public javax.swing.JTextField jtfLetrasTestadas;
    // End of variables declaration//GEN-END:variables

}
