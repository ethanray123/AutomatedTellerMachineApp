/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automatedtellermachineapp;

import static automatedtellermachineapp.PinEntering.ac;
import static automatedtellermachineapp.PinEntering.accessNo;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

/**
 *
 * @author Ethan
 */
public class Home extends javax.swing.JFrame {
    static int process = -1;
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        amountField.setVisible(false);
        enterProcess.setVisible(false);
        blank.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        balanceInquire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        withdrawAmount = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        depositAmount = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        endTransaction = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        display = new javax.swing.JLabel();
        amountField = new javax.swing.JTextField();
        enterProcess = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        blank = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(50, 46, 89));
        jPanel1.setMinimumSize(new java.awt.Dimension(1051, 614));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(70, 65, 105));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        balanceInquire.setToolTipText("");
        balanceInquire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                balanceInquireMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Balance Inquiry");
        jLabel1.setAlignmentX(0.5F);

        javax.swing.GroupLayout balanceInquireLayout = new javax.swing.GroupLayout(balanceInquire);
        balanceInquire.setLayout(balanceInquireLayout);
        balanceInquireLayout.setHorizontalGroup(
            balanceInquireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, balanceInquireLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addContainerGap())
        );
        balanceInquireLayout.setVerticalGroup(
            balanceInquireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(balanceInquireLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.add(balanceInquire, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 60));

        withdrawAmount.setToolTipText("");
        withdrawAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withdrawAmountMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Withdraw");
        jLabel2.setAlignmentX(0.5F);

        javax.swing.GroupLayout withdrawAmountLayout = new javax.swing.GroupLayout(withdrawAmount);
        withdrawAmount.setLayout(withdrawAmountLayout);
        withdrawAmountLayout.setHorizontalGroup(
            withdrawAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAmountLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        withdrawAmountLayout.setVerticalGroup(
            withdrawAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(withdrawAmountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(withdrawAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 200, -1));

        depositAmount.setToolTipText("");
        depositAmount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositAmountMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Deposit");
        jLabel6.setAlignmentX(0.5F);

        javax.swing.GroupLayout depositAmountLayout = new javax.swing.GroupLayout(depositAmount);
        depositAmount.setLayout(depositAmountLayout);
        depositAmountLayout.setHorizontalGroup(
            depositAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAmountLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        depositAmountLayout.setVerticalGroup(
            depositAmountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depositAmountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(depositAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 200, -1));

        endTransaction.setToolTipText("");
        endTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                endTransactionMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("End Transaction");
        jLabel4.setAlignmentX(0.5F);

        javax.swing.GroupLayout endTransactionLayout = new javax.swing.GroupLayout(endTransaction);
        endTransaction.setLayout(endTransactionLayout);
        endTransactionLayout.setHorizontalGroup(
            endTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endTransactionLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        endTransactionLayout.setVerticalGroup(
            endTransactionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endTransactionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.add(endTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 200, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 280, 613));

        display.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        display.setForeground(new java.awt.Color(255, 255, 255));
        display.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        display.setFocusable(false);
        jPanel1.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 660, 220));

        amountField.setBackground(new java.awt.Color(50, 46, 89));
        amountField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        amountField.setForeground(new java.awt.Color(255, 255, 255));
        amountField.setBorder(null);
        jPanel1.add(amountField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 370, 40));

        enterProcess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enterProcessMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Enter Amount");
        jLabel3.setAlignmentX(0.5F);

        javax.swing.GroupLayout enterProcessLayout = new javax.swing.GroupLayout(enterProcess);
        enterProcess.setLayout(enterProcessLayout);
        enterProcessLayout.setHorizontalGroup(
            enterProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterProcessLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        enterProcessLayout.setVerticalGroup(
            enterProcessLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterProcessLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(enterProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 240, 50));
        jPanel1.add(blank, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 390, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 614));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void balanceInquireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_balanceInquireMouseClicked
        display.setText("Your Balance is currently: " + ac[accessNo]);
        if(amountField.isVisible() == true && enterProcess.isVisible() == true){
            amountField.setVisible(false);
            enterProcess.setVisible(false);
            blank.setVisible(false);
        }
    }//GEN-LAST:event_balanceInquireMouseClicked

    private void withdrawAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withdrawAmountMouseClicked
        if(amountField.isVisible() == false && enterProcess.isVisible() == false){
            amountField.setVisible(true);
            enterProcess.setVisible(true);
            blank.setVisible(true);
        }
        display.setText("Enter an amount to withdraw");
        amountField.setText("");
        process = 1;
    }//GEN-LAST:event_withdrawAmountMouseClicked

    private void depositAmountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositAmountMouseClicked
        if(amountField.isVisible() == false && enterProcess.isVisible() == false){
            amountField.setVisible(true);
            enterProcess.setVisible(true);
            blank.setVisible(true);
        }
        display.setText("Enter an amount to deposit");
        amountField.setText("");
        process = 2;
    }//GEN-LAST:event_depositAmountMouseClicked

    private void enterProcessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enterProcessMouseClicked
        double amount = Double.parseDouble(amountField.getText());
        if(process == 1){
            if(amount > 0){
                double val = ac[accessNo] - amount;
                if(val < 0){
                    display.setText("Error: Insufficient Balance");
                }else{
                    ac[accessNo] = val;
                    display.setText("Amount has been withdrawn");
                    amountField.setText("");
                }
            }else{
                display.setText("Error: Entered Negative Value");
            }
        }else if(process == 2){
            if(amount > 0){
                ac[accessNo] = ac[accessNo] + amount;
                display.setText("Amount has been deposited");
                amountField.setText("");
            }else{
                display.setText("Error: Entered Negative Value");
            }
        }
    }//GEN-LAST:event_enterProcessMouseClicked

    private void endTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_endTransactionMouseClicked
        this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }//GEN-LAST:event_endTransactionMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountField;
    private javax.swing.JPanel balanceInquire;
    private javax.swing.JSeparator blank;
    private javax.swing.JPanel depositAmount;
    private javax.swing.JLabel display;
    private javax.swing.JPanel endTransaction;
    private javax.swing.JPanel enterProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel withdrawAmount;
    // End of variables declaration//GEN-END:variables
}
