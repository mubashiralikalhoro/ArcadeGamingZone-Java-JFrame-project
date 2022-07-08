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
public class BuyMenu extends javax.swing.JFrame {

    private ImageIcon tickImage = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\Tick.png");
    private ImageIcon tokenImage = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\tokens.png");
    private Player player;
    private int selected = 0;

    public BuyMenu(Player player) {
        this.player = player;
        initComponents();
        initButtons();
        btnBuy.setVisible(false);
    }

    private void initButtons() {
        textTokenImage.setIcon(ImageResizer.resize(tokenImage, textTokenImage));
        textTokenImage1.setIcon(ImageResizer.resize(tokenImage, textTokenImage1));
        textTokenImage2.setIcon(ImageResizer.resize(tokenImage, textTokenImage2));
    }

    private void updateTick(int option) {
        btnBuy.setVisible(true);
        if (selected != 0) {
            if (selected == 1) {
                textTickImage.setIcon(null);
            } else if (selected == 2) {
                textTickImage1.setIcon(null);
            } else if (selected == 3) {
                textTickImage2.setIcon(null);
            }
        }
        selected = option;
        if (option == 1) {
            textTickImage.setIcon(ImageResizer.resize(tickImage, textTickImage));
        } else if (option == 2) {
            textTickImage1.setIcon(ImageResizer.resize(tickImage, textTickImage1));
        } else if (option == 3) {
            textTickImage2.setIcon(ImageResizer.resize(tickImage, textTickImage2));
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        textTickImage2 = new javax.swing.JLabel();
        textTokenImage2 = new javax.swing.JLabel();
        TokensPrice2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        textTickImage1 = new javax.swing.JLabel();
        textTokenImage1 = new javax.swing.JLabel();
        TokensPrice1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        textTickImage = new javax.swing.JLabel();
        textTokenImage = new javax.swing.JLabel();
        TokensPrice = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(textTickImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 11, 70, 68));
        jPanel4.add(textTokenImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 11, 70, 68));

        TokensPrice2.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        TokensPrice2.setForeground(new java.awt.Color(255, 0, 255));
        TokensPrice2.setText("1k tokens   |$100");
        jPanel4.add(TokensPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 44));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 360, 90));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 153), 1, true));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(textTickImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 19, 70, 60));
        jPanel3.add(textTokenImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 11, 70, 68));

        TokensPrice1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        TokensPrice1.setForeground(new java.awt.Color(255, 0, 255));
        TokensPrice1.setText("500 tokens   |$50");
        jPanel3.add(TokensPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 24, 260, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 360, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textTickImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textTickImageMouseClicked(evt);
            }
        });
        jPanel2.add(textTickImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 11, 70, 68));
        jPanel2.add(textTokenImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 11, 70, 68));

        TokensPrice.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        TokensPrice.setForeground(new java.awt.Color(255, 0, 255));
        TokensPrice.setText("100 tokens   |$10");
        jPanel2.add(TokensPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 260, 44));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 360, 90));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 153));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 600, 130, 50));

        btnBuy.setBackground(new java.awt.Color(0, 0, 0));
        btnBuy.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        btnBuy.setForeground(new java.awt.Color(153, 0, 153));
        btnBuy.setText("Buy");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 600, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/loginpallate.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void textTickImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textTickImageMouseClicked

    }//GEN-LAST:event_textTickImageMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        updateTick(1);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        updateTick(2);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        updateTick(3);
    }//GEN-LAST:event_jPanel4MouseClicked
    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);

    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed

        DBConnection dBC = new DBConnection();

        if (selected == 1) {
            dBC.addAmount(10);
            player.addTokens(100);
            player.addPurchase(10);
        } else if (selected == 2) {
            dBC.addAmount(50);
            player.addTokens(500);
            player.addPurchase(50);
        } else if (selected == 3) {
            dBC.addAmount(100);
            player.addTokens(1000);
            player.addPurchase(100);
        }

        JOptionPane.showMessageDialog(null, "Purchase sucessfull \nYour total tokens are " + player.getNoOfTokens());

        dBC.UpdateplayerData(player);
        close();
        new HomeScreen(player).setVisible(true);
        ;

    }//GEN-LAST:event_btnBuyActionPerformed

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
            java.util.logging.Logger.getLogger(BuyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyMenu(new Player("1234",12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TokensPrice;
    private javax.swing.JLabel TokensPrice1;
    private javax.swing.JLabel TokensPrice2;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel textTickImage;
    private javax.swing.JLabel textTickImage1;
    private javax.swing.JLabel textTickImage2;
    private javax.swing.JLabel textTokenImage;
    private javax.swing.JLabel textTokenImage1;
    private javax.swing.JLabel textTokenImage2;
    // End of variables declaration//GEN-END:variables
}
