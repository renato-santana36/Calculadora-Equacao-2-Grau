public class TelaEquacao extends javax.swing.JFrame {

    public TelaEquacao() {
        initComponents();
        lblLegenda.hide();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        spinValorC = new javax.swing.JSpinner();
        spinValorA = new javax.swing.JSpinner();
        spinValorB = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblValorB_Delta = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblValorA_Delta = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblValorC_Delta = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblResultadoDelta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblResultadoX1 = new javax.swing.JLabel();
        lblResultadoX2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblValorB = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblValorA = new javax.swing.JLabel();
        lblLegenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("x² +");

        btnCalcular.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        spinValorC.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spinValorC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinValorCStateChanged(evt);
            }
        });

        spinValorA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spinValorA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinValorAStateChanged(evt);
            }
        });

        spinValorB.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        spinValorB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinValorBStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("x +");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setText("= 0");

        lblValorB_Delta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblValorB_Delta.setForeground(new java.awt.Color(0, 102, 204));
        lblValorB_Delta.setText("b");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setText("²");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setText("-4");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setText("*");

        lblValorA_Delta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblValorA_Delta.setForeground(new java.awt.Color(0, 102, 204));
        lblValorA_Delta.setText("a");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setText("*");

        lblValorC_Delta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblValorC_Delta.setForeground(new java.awt.Color(0, 102, 204));
        lblValorC_Delta.setText("c");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel12.setText("Δ =");

        lblResultadoDelta.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblResultadoDelta.setText("Δ =");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 21)); // NOI18N
        jLabel5.setText("Informe a equação de 2º Grau");

        lblResultadoX1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblResultadoX1.setText("x¹ =");

        lblResultadoX2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblResultadoX2.setText("x² =");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel14.setText("x = -");

        lblValorB.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblValorB.setForeground(new java.awt.Color(255, 0, 0));
        lblValorB.setText("b");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel15.setText("± √Δ");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel16.setText("—————");

        jLabel17.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel17.setText("2 *");

        lblValorA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblValorA.setForeground(new java.awt.Color(255, 0, 0));
        lblValorA.setText("a");

        lblLegenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblLegenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLegenda.setText("Delta < 0, Impossível de resolver a equação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblValorA)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblValorB)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15))
                        .addComponent(lblResultadoDelta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblValorB_Delta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)
                        .addComponent(lblValorA_Delta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorC_Delta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResultadoX2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(lblResultadoX1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(spinValorA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1)
                        .addGap(3, 3, 3)
                        .addComponent(spinValorB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spinValorC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLegenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinValorB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinValorA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinValorC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblValorB_Delta)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(lblValorA_Delta)
                            .addComponent(jLabel10)
                            .addComponent(lblValorC_Delta)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCalcular)
                        .addGap(9, 9, 9)
                        .addComponent(lblResultadoX1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblResultadoX2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblValorB)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblValorA))
                        .addGap(39, 39, 39)
                        .addComponent(lblResultadoDelta)))
                .addGap(28, 28, 28)
                .addComponent(lblLegenda)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double spinnerValorA = Double.parseDouble(spinValorA.getValue().toString());
        double spinnerValorB = Double.parseDouble(spinValorB.getValue().toString());
        double spinnerValorC = Double.parseDouble(spinValorC.getValue().toString());
        double delta, equacaoX1, equacaoX2;
        
        //Cálculo Delta
        delta = Math.pow(spinnerValorB, 2) -4.0 * spinnerValorA * spinnerValorC;
        System.out.printf("Valor Delta: %.2f\n", delta);
        
        //Cálculo equação 2º grau X1 = (-b + √Δ) / (2 * a)
        equacaoX1 = ((-spinnerValorB + Math.sqrt(delta)) / (2 * spinnerValorA));
        System.out.printf("Valor equação 2 Grau X1: %.2f\n", equacaoX1);
        
        //Cálculo equação 2º grau X2 = (-b + √Δ) / (2 * a)
        equacaoX2 = ((-spinnerValorB - Math.sqrt(delta)) / (2 * spinnerValorA));
        System.out.printf("Valor equação 2 Grau X2: %.2f\n", equacaoX2);
        
        if(delta >= 0) {
            //Apresentação DELTA
            lblResultadoDelta.setText(String.format("Δ = %.2f", delta));

            //Apresentação RAIZ x1
            lblResultadoX1.setText(String.format("x¹ = %.2f", equacaoX1));

            //Apresentação RAIZ x2
            lblResultadoX2.setText(String.format("x² = %.2f", equacaoX2));
            
            
            lblLegenda.hide();
        } else {
            delta = 0;
            equacaoX1 = 0;
            equacaoX2 = 0;
            lblResultadoDelta.setText("Δ = ");
            lblResultadoX1.setText("x¹ = ");
            lblResultadoX2.setText("x² = ");
            
            lblLegenda.show();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void spinValorAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinValorAStateChanged
        lblValorA.setText(spinValorA.getValue().toString());
        lblValorA_Delta.setText(spinValorA.getValue().toString());
    }//GEN-LAST:event_spinValorAStateChanged

    private void spinValorBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinValorBStateChanged
        lblValorB.setText(spinValorB.getValue().toString());
        lblValorB_Delta.setText(spinValorB.getValue().toString());
    }//GEN-LAST:event_spinValorBStateChanged

    private void spinValorCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinValorCStateChanged
        lblValorC_Delta.setText(spinValorC.getValue().toString());
    }//GEN-LAST:event_spinValorCStateChanged

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
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEquacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEquacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblLegenda;
    private javax.swing.JLabel lblResultadoDelta;
    private javax.swing.JLabel lblResultadoX1;
    private javax.swing.JLabel lblResultadoX2;
    private javax.swing.JLabel lblValorA;
    private javax.swing.JLabel lblValorA_Delta;
    private javax.swing.JLabel lblValorB;
    private javax.swing.JLabel lblValorB_Delta;
    private javax.swing.JLabel lblValorC_Delta;
    private javax.swing.JSpinner spinValorA;
    private javax.swing.JSpinner spinValorB;
    private javax.swing.JSpinner spinValorC;
    // End of variables declaration//GEN-END:variables
}
