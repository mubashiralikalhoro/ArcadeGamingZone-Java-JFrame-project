/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.MainPages;

import BackEnd.DBConnection;
import BackEnd.ImageResizer;
import BackEnd.LoginSystemFilling;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author hume
 */
public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        new LoginSystemFilling().clear();
        initComponents();
        editTextPassword.setEchoChar((char) 0);
        textEye.setIcon(ImageResizer.resize(new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\eyeIcon.png"), textEye));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        textEye = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editTextUsername = new javax.swing.JTextField();
        editTextPassword = new javax.swing.JPasswordField();
        btnSignUp1 = new javax.swing.JToggleButton();
        btnSignUp = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textEyeMouseReleased(evt);
            }
        });
        jPanel2.add(textEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 30, 30));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 40, 40));

        editTextUsername.setBackground(new java.awt.Color(0, 0, 0));
        editTextUsername.setForeground(new java.awt.Color(255, 255, 255));
        editTextUsername.setText("Email");
        editTextUsername.setBorder(null);
        editTextUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextUsernameFocusLost(evt);
            }
        });
        editTextUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextUsernameActionPerformed(evt);
            }
        });
        jPanel2.add(editTextUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 368, 31));

        editTextPassword.setBackground(new java.awt.Color(0, 0, 0));
        editTextPassword.setForeground(new java.awt.Color(255, 255, 255));
        editTextPassword.setText("Password");
        editTextPassword.setBorder(null);
        editTextPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextPasswordFocusLost(evt);
            }
        });
        editTextPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextPasswordActionPerformed(evt);
            }
        });
        jPanel2.add(editTextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 340, 31));

        btnSignUp1.setBackground(new java.awt.Color(102, 102, 102));
        btnSignUp1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSignUp1.setForeground(new java.awt.Color(255, 0, 255));
        btnSignUp1.setText("Log in");
        btnSignUp1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 120, 50));

        btnSignUp.setBackground(new java.awt.Color(102, 102, 102));
        btnSignUp.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 0, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel2.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 120, 50));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 368, 10));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 368, 50));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Copyright @2022 All Rights Reserved");
        jLabel2.setToolTipText("");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/loginpallate.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);

    }
    private void editTextUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextUsernameActionPerformed


    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        close();
        new SignUpForm().setVisible(true);
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void editTextPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusGained
        if (editTextPassword.getText().equals("Password")) {
            editTextPassword.setText(null);
            editTextPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_editTextPasswordFocusGained

    private void editTextPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextPasswordFocusLost
        if (editTextPassword.getText().isEmpty()) {
            editTextPassword.setText("Password");
            editTextPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_editTextPasswordFocusLost

    private void editTextUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextUsernameFocusGained
        if (editTextUsername.getText().equals("Email")) {
            editTextUsername.setText(null);
        }
    }//GEN-LAST:event_editTextUsernameFocusGained

    private void editTextUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextUsernameFocusLost
        if (editTextUsername.getText().isEmpty()) {
            editTextUsername.setText("Email");
        }
    }//GEN-LAST:event_editTextUsernameFocusLost

    private void editTextPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextPasswordActionPerformed

    private void btnSignUp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp1ActionPerformed
        // checking fields are filled
        if (!editTextUsername.getText().equals("Email") && !editTextPassword.getText().equals("Password")) {
            DBConnection dBC = new DBConnection();
            // checking if its the ceo
            String username = editTextUsername.getText();
            String password = editTextPassword.getText();

            if (editTextUsername.getText().contains("@ceo") && dBC.ceoLogIn(editTextUsername.getText(), editTextPassword.getText())) {
                close();
                new LoginSystemFilling().writeData(username, password);
                new HomeScreenCEO(dBC.getCeoData()).setVisible(true);
            } // checking if its a developer.
            else if (editTextUsername.getText().contains("@dev") && dBC.devLogIn(editTextUsername.getText(), editTextPassword.getText())) {
                close();
                new LoginSystemFilling().writeData(username, password);
                new HomeScreenDeveloper(dBC.getDevData()).setVisible(true);
            } //checking if its a manager.
            else if (editTextUsername.getText().contains("@man") && dBC.manLogIn(editTextUsername.getText(), editTextPassword.getText())) {
                close();
                new LoginSystemFilling().writeData(username, password);
                new HomeScreenManager(dBC.getManData()).setVisible(true);
            } // checking if its player
            else if (dBC.playerLogin(editTextUsername.getText(), editTextPassword.getText())) {
                close();
                new LoginSystemFilling().writeData(username, password);
                new HomeScreen(dBC.getPlayerData()).setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please enter your email and password both!");
        }

    }//GEN-LAST:event_btnSignUp1ActionPerformed

    private void textEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMousePressed
        editTextPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_textEyeMousePressed

    private void textEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMouseReleased
        if (!editTextPassword.getText().equals("Password"))
            editTextPassword.setEchoChar('*');
    }//GEN-LAST:event_textEyeMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSignUp;
    private javax.swing.JToggleButton btnSignUp1;
    private javax.swing.JPasswordField editTextPassword;
    private javax.swing.JTextField editTextUsername;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel textEye;
    // End of variables declaration//GEN-END:variables
}
