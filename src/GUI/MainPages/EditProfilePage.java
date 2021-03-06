/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.MainPages;

import BackEnd.DBConnection;
import BackEnd.ImageResizer;
import BackEnd.ManagementClasses.Player;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mubashir Ali
 */
public class EditProfilePage extends javax.swing.JFrame {

    private Player player;

    /**
     * Creates new form EditProfilePage
     */
    public EditProfilePage(Player player) {
        this.player = player;
        initComponents();
        initPlayerData();
        textEye.setIcon(ImageResizer.resize(new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\eyeIcon.png"), textEye));
        textEye1.setIcon(ImageResizer.resize(new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\eyeIcon.png"), textEye));
    }

    private void initPlayerData() {
        editTextFirstName.setText(player.getUsername());
        editTextEmail.setText(player.getEmail());
        editTextOldPassword.setEchoChar((char) 0);
        editTextNewPassword.setEchoChar((char) 0);
        editTextInGameName.setText(player.getInGameName());

    }

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
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
        editTextInGameName = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        editTextEmail = new javax.swing.JTextField();
        textEye = new javax.swing.JLabel();
        textEye1 = new javax.swing.JLabel();
        editTextNewPassword = new javax.swing.JPasswordField();
        editTextOldPassword = new javax.swing.JPasswordField();
        editTextFirstName = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btnBack = new javax.swing.JToggleButton();
        btnApplyChanges = new javax.swing.JToggleButton();
        backgournd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editTextInGameName.setBackground(new java.awt.Color(0, 0, 0));
        editTextInGameName.setForeground(new java.awt.Color(255, 255, 255));
        editTextInGameName.setText("InGame Name");
        editTextInGameName.setBorder(null);
        editTextInGameName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextInGameNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextInGameNameFocusLost(evt);
            }
        });
        editTextInGameName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextInGameNameActionPerformed(evt);
            }
        });
        jPanel1.add(editTextInGameName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 368, 31));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 368, 10));

        editTextEmail.setBackground(new java.awt.Color(0, 0, 0));
        editTextEmail.setForeground(new java.awt.Color(255, 255, 255));
        editTextEmail.setText("Enter your email address");
        editTextEmail.setBorder(null);
        editTextEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextEmailFocusLost(evt);
            }
        });
        editTextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextEmailActionPerformed(evt);
            }
        });
        jPanel1.add(editTextEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 368, 31));

        textEye.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textEyeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textEyeMouseReleased(evt);
            }
        });
        jPanel1.add(textEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 30, 30));

        textEye1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textEye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textEye1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textEye1MouseReleased(evt);
            }
        });
        jPanel1.add(textEye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 30, 30));

        editTextNewPassword.setBackground(new java.awt.Color(0, 0, 0));
        editTextNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        editTextNewPassword.setText("Enter your new password");
        editTextNewPassword.setBorder(null);
        editTextNewPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextNewPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextNewPasswordFocusLost(evt);
            }
        });
        jPanel1.add(editTextNewPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 330, 31));

        editTextOldPassword.setBackground(new java.awt.Color(0, 0, 0));
        editTextOldPassword.setForeground(new java.awt.Color(255, 255, 255));
        editTextOldPassword.setText("Enter your old password");
        editTextOldPassword.setBorder(null);
        editTextOldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextOldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextOldPasswordFocusLost(evt);
            }
        });
        editTextOldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextOldPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(editTextOldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 330, 31));

        editTextFirstName.setBackground(new java.awt.Color(0, 0, 0));
        editTextFirstName.setForeground(new java.awt.Color(255, 255, 255));
        editTextFirstName.setText("Username");
        editTextFirstName.setBorder(null);
        editTextFirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextFirstNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextFirstNameFocusLost(evt);
            }
        });
        editTextFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(editTextFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 370, 31));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 368, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 370, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 368, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 368, 10));

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 0, 255));
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 380, 170, 80));

        btnApplyChanges.setBackground(new java.awt.Color(102, 102, 102));
        btnApplyChanges.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnApplyChanges.setForeground(new java.awt.Color(255, 0, 255));
        btnApplyChanges.setText("Apply Changes");
        btnApplyChanges.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApplyChanges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApplyChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyChangesActionPerformed(evt);
            }
        });
        jPanel1.add(btnApplyChanges, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 170, 80));

        backgournd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/homeScreen.png"))); // NOI18N
        jPanel1.add(backgournd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void editTextInGameNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextInGameNameFocusGained
        if (editTextInGameName.getText().equals("InGame Name")) {
            editTextInGameName.setText(null);
        }
    }//GEN-LAST:event_editTextInGameNameFocusGained

    private void editTextInGameNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextInGameNameFocusLost
        if (editTextInGameName.getText().isEmpty()) {
            editTextInGameName.setText("InGame Name");
        }
    }//GEN-LAST:event_editTextInGameNameFocusLost

    private void editTextInGameNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextInGameNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextInGameNameActionPerformed

    private void editTextEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusGained
        if (editTextEmail.getText().equals("Enter your email address")) {
            editTextEmail.setText(null);
        }
    }//GEN-LAST:event_editTextEmailFocusGained

    private void editTextEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextEmailFocusLost
        if (editTextEmail.getText().isEmpty()) {
            editTextEmail.setText("Enter your email address");
        }
    }//GEN-LAST:event_editTextEmailFocusLost

    private void editTextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextEmailActionPerformed

    private void editTextNewPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNewPasswordFocusGained
        if (editTextNewPassword.getText().equals("Enter your new password")) {
            editTextNewPassword.setText(null);
            editTextNewPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_editTextNewPasswordFocusGained

    private void editTextNewPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNewPasswordFocusLost
        if (editTextNewPassword.getText().isEmpty()) {
            editTextNewPassword.setText("Enter your new password");
            editTextNewPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_editTextNewPasswordFocusLost

    private void editTextOldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextOldPasswordFocusGained
        if (editTextOldPassword.getText().equals("Enter your old password")) {
            editTextOldPassword.setText(null);
            editTextOldPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_editTextOldPasswordFocusGained

    private void editTextOldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextOldPasswordFocusLost
        if (editTextOldPassword.getText().isEmpty()) {
            editTextOldPassword.setText("Enter your old password");
            editTextOldPassword.setEchoChar((char) 0);
        }
    }//GEN-LAST:event_editTextOldPasswordFocusLost

    private void editTextOldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextOldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextOldPasswordActionPerformed

    private void btnApplyChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyChangesActionPerformed
        String username;
        String password;
        String email;
        String inGameName;
        if (!editTextFirstName.getText().equals("Username")
                && !editTextEmail.getText().equals("Enter your email address")
                && !editTextOldPassword.getText().equals("Enter your old password")
                && !editTextNewPassword.getText().equals("Enter your new password")
                && !editTextInGameName.getText().equals("InGame Name")) {
            if (editTextOldPassword.getText().equals(player.getPassword())) {
                username = editTextFirstName.getText();
                password = editTextNewPassword.getText();
                email = editTextEmail.getText();
                inGameName = editTextInGameName.getText();
                DBConnection dBC = new DBConnection();
                player.setUsername(username);
                player.setPassword(password);
                player.setInGameName(inGameName);
                player.setEmail(email);
                dBC.UpdateplayerData(player);
                close();
                new HomeScreen(player).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "please check your password!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
        }
    }//GEN-LAST:event_btnApplyChangesActionPerformed

    private void editTextFirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextFirstNameFocusGained
        if (editTextFirstName.getText().equals("Username")) {
            editTextFirstName.setText(null);
        }
    }//GEN-LAST:event_editTextFirstNameFocusGained

    private void editTextFirstNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextFirstNameFocusLost
        if (editTextFirstName.getText().isEmpty()) {
            editTextFirstName.setText("Username");
        }
    }//GEN-LAST:event_editTextFirstNameFocusLost

    private void editTextFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextFirstNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void textEyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMousePressed
        editTextNewPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_textEyeMousePressed

    private void textEyeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEyeMouseReleased
        if (!editTextNewPassword.getText().equals("Enter your new password"))
            editTextNewPassword.setEchoChar('*');
    }//GEN-LAST:event_textEyeMouseReleased

    private void textEye1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEye1MousePressed
        editTextOldPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_textEye1MousePressed

    private void textEye1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textEye1MouseReleased
           if (!editTextOldPassword.getText().equals("Enter your old password"))
            editTextOldPassword.setEchoChar('*');
    }//GEN-LAST:event_textEye1MouseReleased

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
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProfilePage(new Player("1234", 12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgournd;
    private javax.swing.JToggleButton btnApplyChanges;
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JTextField editTextEmail;
    private javax.swing.JTextField editTextFirstName;
    private javax.swing.JTextField editTextInGameName;
    private javax.swing.JPasswordField editTextNewPassword;
    private javax.swing.JPasswordField editTextOldPassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel textEye;
    private javax.swing.JLabel textEye1;
    // End of variables declaration//GEN-END:variables
}
