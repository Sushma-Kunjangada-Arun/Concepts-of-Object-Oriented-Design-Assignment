/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculator;

/**
 *
 * @author sushmaka
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
            
    public Calculator() {
        initComponents();
        setSize(311, 415);
        setResizable(false);
        getContentPane().setBackground(new java.awt.Color(204,204,204));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtResult = new javax.swing.JTextField();
        jbtnPM = new javax.swing.JButton();
        jbtnBS = new javax.swing.JButton();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnSub = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnMult = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();
        jbtnDiv = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEquals = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtxtResult.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jtxtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        getContentPane().add(jtxtResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 13, 270, 50));

        jbtnPM.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 153, 0));
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 60, 50));

        jbtnBS.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(255, 51, 0));
        jbtnBS.setText("←");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnBS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 60, 50));

        jbtnCE.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 153, 0));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnCE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 60, 50));

        jbtnC.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 153, 0));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 60, 50));

        jbtnPlus.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(255, 153, 0));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 60, 50));

        jbtnDigit7.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 60, 50));

        jbtnDigit8.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 60, 50));

        jbtnDigit9.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 60, 50));

        jbtnSub.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnSub.setForeground(new java.awt.Color(255, 153, 0));
        jbtnSub.setText("-");
        jbtnSub.setActionCommand("");
        jbtnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSubActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 60, 50));

        jbtnDigit6.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 60, 50));

        jbtnDigit5.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 60, 50));

        jbtnDigit4.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 60, 50));

        jbtnMult.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnMult.setForeground(new java.awt.Color(255, 153, 0));
        jbtnMult.setText("*");
        jbtnMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnMult, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 60, 50));

        jbtnDigit2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 60, 50));

        jbtnDigit1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 60, 50));

        jbtnDigit3.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 60, 50));

        jbtnDiv.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDiv.setForeground(new java.awt.Color(255, 153, 0));
        jbtnDiv.setText("/");
        jbtnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 60, 50));

        jbtnDot.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 60, 50));

        jbtnEquals.setBackground(new java.awt.Color(255, 153, 0));
        jbtnEquals.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnEquals.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEquals.setText("=");
        jbtnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnEquals, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 60, 50));

        jbtnDigit0.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDigit0, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void EnterNumbers(String q)
    {
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    
    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        // TODO add your handling code here:
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivActionPerformed
        // TODO add your handling code here:
        if (!jtxtResult.getText().isEmpty()) {
            NumEnter1 = Double.parseDouble(jtxtResult.getText());
            jtxtResult.setText("");
            op = "/";
        }
    }//GEN-LAST:event_jbtnDivActionPerformed

    private void jbtnMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultActionPerformed
        // TODO add your handling code here:
        if (!jtxtResult.getText().isEmpty()) {
            NumEnter1 = Double.parseDouble(jtxtResult.getText());
            jtxtResult.setText("");
            op = "*";
        }
    }//GEN-LAST:event_jbtnMultActionPerformed

    private void jbtnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSubActionPerformed
        // TODO add your handling code here:
        if (!jtxtResult.getText().isEmpty()) {
            NumEnter1 = Double.parseDouble(jtxtResult.getText());
            jtxtResult.setText("");
            op = "-";
        }
    }//GEN-LAST:event_jbtnSubActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        // TODO add your handling code here:
        if (!jtxtResult.getText().isEmpty()) {
            NumEnter1 = Double.parseDouble(jtxtResult.getText());
            jtxtResult.setText("");
            op = "+";
        }
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        // TODO add your handling code here:
        jtxtResult.setText("");
        NumEnter1 = 0;
        NumEnter2 = 0;
        Result = 0;
        op = null;
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        // TODO add your handling code here:
        jtxtResult.setText("");
        
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        // TODO add your handling code here:
        String text = jtxtResult.getText();
        if (!text.isEmpty()) {
            double nums = Double.parseDouble(text);
            nums = nums * (-1);
            jtxtResult.setText(String.valueOf(nums));
        }
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        // TODO add your handling code here:
        String backSp = null;

        if (jtxtResult.getText().length() > 0) {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() - 1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        // TODO add your handling code here:
        if (!jtxtResult.getText().contains(".")) {
            jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualsActionPerformed
        // TODO add your handling code here:
        if (op == null || jtxtResult.getText().isEmpty()) {
            return;
        }
        
        NumEnter2 = Double.parseDouble(jtxtResult.getText());

        if (op.equals("+")) {
            Result = NumEnter1 + NumEnter2;
        } else if (op.equals("-")) {
            Result = NumEnter1 - NumEnter2;
        } else if (op.equals("*")) {
            Result = NumEnter1 * NumEnter2;
        } else if (op.equals("/")) {
            Result = NumEnter1 / NumEnter2;
        }


        if (Result % 1 == 0) {
            jtxtResult.setText(String.valueOf((int) Result));
        } else {
            jtxtResult.setText(String.valueOf(Result));
        }
               
    }//GEN-LAST:event_jbtnEqualsActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDiv;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEquals;
    private javax.swing.JButton jbtnMult;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnSub;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
