/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package library.managment.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtpublisher = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(754, 461));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add New Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 456, 38));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Book Id :- ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Book Name :- ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 190, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Publisher : -");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, 20));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Price :-");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("Publish Year :-");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, -1));

        txtyear.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 370, -1));

        txtid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 370, -1));

        txtname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 370, -1));

        txtpublisher.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtpublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpublisherActionPerformed(evt);
            }
        });
        getContentPane().add(txtpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 370, -1));

        txtprice.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 370, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 0, 40, 40));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 51, 0), null, null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Home().setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtid.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All blanks must be filled");
            txtid.requestFocus();
        }
        else if (txtname.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All blanks must be filled");
            txtname.requestFocus();
        }
        else if (txtpublisher.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All blanks must be filled");
            txtpublisher.requestFocus();
        }
        else if (txtprice.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All blanks must be filled");
            txtprice.requestFocus();
        }
        else if (txtyear.getText().equals("")){
            JOptionPane.showMessageDialog(this,"All blanks must be filled");
            txtyear.requestFocus();
        }
        else{
            try {
                Connection con=Connect.Connection();
                PreparedStatement pst = con.prepareStatement("INSERT INTO `library`.`book` (`id`, `name`, `publisher`, `price`, `year`, `status`) VALUES (?, ?, ?, ?, ?, ?)");
                pst.setString(1, txtid.getText());
                pst.setString(2, txtname.getText());
                pst.setString(3, txtpublisher.getText());
                pst.setString(4, txtprice.getText());
                pst.setString(5, txtyear.getText());
                pst.setString(6, "not issued"); 


                pst.executeUpdate();
                JOptionPane.showMessageDialog(this,"Record Saved");
                txtid.setText("");
                txtname.setText("");
                txtpublisher.setText("");
                txtprice.setText("");
                txtyear.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(StudentRegistraion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtpublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpublisherActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
