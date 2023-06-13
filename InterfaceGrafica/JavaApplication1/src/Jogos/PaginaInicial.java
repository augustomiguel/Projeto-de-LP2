/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogos;

/**
 *
 * @author aluno
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public PaginaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        INICIAR = new javax.swing.JButton();
        ARCO = new javax.swing.JButton();
        nome = new javax.swing.JTextField();
        ESPADA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        personagem = new javax.swing.JTextField();
        Arma = new javax.swing.JTextField();
        ELFO = new javax.swing.JButton();
        ANAO1 = new javax.swing.JButton();
        TROLL = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CAJADO = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        INICIAR.setBackground(new java.awt.Color(153, 255, 51));
        INICIAR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(51, 102, 0));
        INICIAR.setText("INICIAR JOGO");
        INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARActionPerformed(evt);
            }
        });

        ARCO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ARCO.setText("ARCO");
        ARCO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ARCOMousePressed(evt);
            }
        });
        ARCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARCOActionPerformed(evt);
            }
        });

        nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(51, 102, 0));
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        ESPADA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ESPADA.setText("ESPADA");
        ESPADA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ESPADAMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 0));
        jLabel3.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 0));
        jLabel4.setText("PERSONAGEM");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 102, 0));
        jLabel5.setText("ARMA");

        personagem.setForeground(new java.awt.Color(51, 102, 0));
        personagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personagemActionPerformed(evt);
            }
        });

        Arma.setForeground(new java.awt.Color(51, 102, 0));
        Arma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArmaActionPerformed(evt);
            }
        });

        ELFO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ELFO.setText("ELFO");
        ELFO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ELFOMousePressed(evt);
            }
        });
        ELFO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELFOActionPerformed(evt);
            }
        });

        ANAO1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ANAO1.setText("ANÃO");
        ANAO1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ANAO1MousePressed(evt);
            }
        });

        TROLL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TROLL.setText("TROLL");
        TROLL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TROLLMousePressed(evt);
            }
        });
        TROLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TROLLActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("JOGO DE TURNOS");
        jLabel1.setAlignmentY(0.0F);

        CAJADO.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CAJADO.setText("CAJADO");
        CAJADO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CAJADOMousePressed(evt);
            }
        });
        CAJADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJADOActionPerformed(evt);
            }
        });

        personagem.setEditable(false);
        Arma.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(personagem)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ELFO, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ANAO1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TROLL, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(158, 158, 158)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(288, 288, 288)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Arma, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(CAJADO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(ESPADA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(ARCO, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGap(108, 108, 108))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(INICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Arma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(personagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ANAO1)
                    .addComponent(ARCO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ELFO)
                    .addComponent(CAJADO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TROLL)
                    .addComponent(ESPADA))
                .addGap(33, 33, 33)
                .addComponent(INICIAR)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_INICIARActionPerformed

    private void ARCOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ARCOMousePressed
        // TODO add your handling code here:
        Arma.setText("ARCO");
    }//GEN-LAST:event_ARCOMousePressed

    private void ARCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARCOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ARCOActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void ESPADAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ESPADAMousePressed
        // TODO add your handling code here:
        Arma.setText("ESPADA");
    }//GEN-LAST:event_ESPADAMousePressed

    private void personagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personagemActionPerformed
        // TODO add your handling code here:
        personagem.setEditable(false);

    }//GEN-LAST:event_personagemActionPerformed

    private void ArmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArmaActionPerformed

    private void ELFOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ELFOMousePressed
        // TODO add your handling code here:
        personagem.setText("ELFO");
    }//GEN-LAST:event_ELFOMousePressed

    private void ELFOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELFOActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ELFOActionPerformed

    private void ANAO1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ANAO1MousePressed
        // TODO add your handling code here:
        personagem.setText("ANÃO");

    }//GEN-LAST:event_ANAO1MousePressed

    private void TROLLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TROLLMousePressed
        // TODO add your handling code here:
        personagem.setText("TROLL");
    }//GEN-LAST:event_TROLLMousePressed

    private void TROLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TROLLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TROLLActionPerformed

    private void CAJADOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAJADOMousePressed
        // TODO add your handling code here:
        Arma.setText("CAJADO");
    }//GEN-LAST:event_CAJADOMousePressed

    private void CAJADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJADOActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANAO1;
    private javax.swing.JButton ARCO;
    private javax.swing.JTextField Arma;
    private javax.swing.JButton CAJADO;
    private javax.swing.JButton ELFO;
    private javax.swing.JButton ESPADA;
    private javax.swing.JButton INICIAR;
    private javax.swing.JButton TROLL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField personagem;
    // End of variables declaration//GEN-END:variables
}