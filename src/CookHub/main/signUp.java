package CookHub.main;


import controller.UserController;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


/**
 *
 * @author User
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
        initComponents();
    }
public void close(){
    WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pictureBox1 = new CookHub.components.PictureBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        conPass = new javax.swing.JPasswordField();
        newPass1 = new javax.swing.JPasswordField();
        newName1 = new javax.swing.JTextField();
        reg1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/CookHub/image/1.2-Screen 1-State 1.png"))); // NOI18N

        jLabel1.setText("User :");
        pictureBox1.add(jLabel1);
        jLabel1.setBounds(40, 160, 60, 40);

        jLabel2.setText("Password :");
        pictureBox1.add(jLabel2);
        jLabel2.setBounds(40, 210, 60, 40);

        jLabel3.setText("Confirm Password :");
        pictureBox1.add(jLabel3);
        jLabel3.setBounds(40, 270, 110, 40);

        conPass.setPreferredSize(new java.awt.Dimension(90, 40));
        conPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conPassActionPerformed(evt);
            }
        });
        pictureBox1.add(conPass);
        conPass.setBounds(160, 270, 179, 30);
        pictureBox1.add(newPass1);
        newPass1.setBounds(160, 220, 180, 30);

        newName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newName1ActionPerformed(evt);
            }
        });
        pictureBox1.add(newName1);
        newName1.setBounds(160, 170, 180, 30);

        reg1.setText("Register");
        reg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg1ActionPerformed(evt);
            }
        });
        pictureBox1.add(reg1);
        reg1.setBounds(200, 310, 90, 34);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pictureBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void conPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_conPassActionPerformed

    private void reg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg1ActionPerformed
       
        controller.UserController theController = new UserController();
        String username = newName1.getText();
        char[] password = newPass1.getPassword();
        
        if (  Arrays.equals(newPass1.getPassword(), conPass.getPassword())) {
            System.out.println("Created - " +theController.addUserToDatabase(new Model.User(username, password)));
            JOptionPane.showMessageDialog(null, "User Added!!");
            close();
            login lg = new login();
            lg.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Password doesn't match! Try Again!");
            newName1.setText("");
            newPass1.setText("");
            conPass.setText("");
        }
  
    }//GEN-LAST:event_reg1ActionPerformed

    private void newName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newName1ActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField newName1;
    private javax.swing.JPasswordField newPass1;
    private CookHub.components.PictureBox pictureBox1;
    private javax.swing.JButton reg1;
    // End of variables declaration//GEN-END:variables
}
