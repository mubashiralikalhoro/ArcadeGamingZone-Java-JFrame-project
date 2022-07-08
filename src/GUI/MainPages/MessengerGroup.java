/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.MainPages;

import BackEnd.DBConnection;
import BackEnd.ManagementClasses.CEO;
import BackEnd.ManagementClasses.Developer;
import BackEnd.ManagementClasses.Manager;
import BackEnd.Message;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Mubashir Ali
 */
public class MessengerGroup extends javax.swing.JFrame {

    private String userName;
    private Developer developer;
    private Manager manager;
    private CEO cEO;
    private int person;

    public MessengerGroup(Developer dev) {
        userName = dev.getDevName();
        initComponents();
        this.developer = dev;
        person = 0;
        updateMessages();
    }

    public MessengerGroup(Manager man) {
        userName = man.getManName();
        initComponents();
        this.manager = man;
        person = 1;
        updateMessages();

    }

    public MessengerGroup(CEO ceo) {
        userName = ceo.getUsername();
        initComponents();
        this.cEO = ceo;
        person = 2;
        updateMessages();

    }

    private void updateMessages() {
        String print = "";
        for (Message i : new DBConnection().getAllMessage()) {
            print += i.printReport(15);
            print += "\n\n";
        }
        textMessages.setText(print);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JToggleButton();
        btnSubmit = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        textAreaMessageSend = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        textMessages = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, 120, 50));

        btnSubmit.setBackground(new java.awt.Color(102, 102, 102));
        btnSubmit.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 0, 255));
        btnSubmit.setText("Send");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 120, 50));

        jScrollPane2.setBorder(null);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textAreaMessageSend.setColumns(20);
        textAreaMessageSend.setRows(5);
        jScrollPane2.setViewportView(textAreaMessageSend);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 400, 100));

        textMessages.setBackground(new java.awt.Color(0, 0, 0));
        textMessages.setBorder(null);
        textMessages.setForeground(new java.awt.Color(255, 255, 255));
        textMessages.setText("data");
        textMessages.setAutoscrolls(false);
        textMessages.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textMessages.setFocusable(false);
        jScrollPane1.setViewportView(textMessages);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 400, 410));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/loginpallate.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

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

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (!textAreaMessageSend.getText().isEmpty()) {
            new DBConnection().addMessage(userName, textAreaMessageSend.getText());
            textAreaMessageSend.setText(null);
            updateMessages();

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        if (person == 0) {
            new HomeScreenDeveloper(developer).setVisible(true);
        } else if (person == 1) {
            new HomeScreenManager(manager).setVisible(true);
        } else if (person == 2) {
            new HomeScreenCEO(cEO).setVisible(true);
        }

    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(MessengerGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MessengerGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MessengerGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MessengerGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MessengerGroup(new CEO("nothing", "@ceo-mubashir", 100, 1002, "mubashirali@gmail.com", 12, "Mubashir", "mubashirali@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JToggleButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea textAreaMessageSend;
    private javax.swing.JTextPane textMessages;
    // End of variables declaration//GEN-END:variables
}
