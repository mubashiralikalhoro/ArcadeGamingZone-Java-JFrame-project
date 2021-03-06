/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.DoubleOrNothing;

import GUI.SlotMachine.*;
import BackEnd.DBConnection;
import BackEnd.SlotMachine;
import BackEnd.ImageResizer;
import BackEnd.ManagementClasses.Player;
import GUI.MainPages.HomeScreen;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 *
 * @author Mubashir Ali
 */
public class DoubleOrNothingGUI extends javax.swing.JFrame {

    Player player;
    private ImageIcon coin1 = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\coinFiveSide.png");
    private ImageIcon coin2 = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\coinMoonSide.jpg");
    private int tokens;

    public DoubleOrNothingGUI(Player player) {

        this.player = player;
        initComponents();
        setPlayerData();
        buttonClear.setVisible(false);
        textMessage.setHorizontalAlignment(SwingConstants.CENTER);
        setOptionsFieldVisible(false);
        textCoin1.setIcon(ImageResizer.resize(coin1, textCoin1));
        textCoin2.setIcon(ImageResizer.resize(coin2, textCoin2));

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
        jButton1 = new javax.swing.JButton();
        textCoin2 = new javax.swing.JLabel();
        textCoin1 = new javax.swing.JLabel();
        textMessage = new javax.swing.JLabel();
        buttonClear = new javax.swing.JButton();
        buttonHome = new javax.swing.JButton();
        textUserName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textTokens = new javax.swing.JLabel();
        textPlayerId = new javax.swing.JLabel();
        btnPlay = new javax.swing.JToggleButton();
        textAvatar = new javax.swing.JLabel();
        textLevel = new javax.swing.JLabel();
        textTotalWins = new javax.swing.JLabel();
        textScore = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        editTextNoOfTokens = new javax.swing.JTextField();
        textResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 0, 0));

        textCoin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCoin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCoin2MouseClicked(evt);
            }
        });
        jPanel1.add(textCoin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 170, 170));

        textCoin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        textCoin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textCoin1MouseClicked(evt);
            }
        });
        jPanel1.add(textCoin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 170, 170));

        textMessage.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textMessage.setForeground(new java.awt.Color(255, 0, 255));
        jPanel1.add(textMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 470, 30));

        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RepeatButton.png"))); // NOI18N
        buttonClear.setBorder(null);
        buttonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 80, 80));

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/HomeBtn.png"))); // NOI18N
        buttonHome.setBorder(null);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 80, 80));

        textUserName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textUserName.setForeground(new java.awt.Color(255, 255, 255));
        textUserName.setText("Name");
        jPanel1.add(textUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel1.setText("        ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 700, -1, -1));

        textTokens.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textTokens.setForeground(new java.awt.Color(255, 255, 255));
        textTokens.setText("Tokens");
        jPanel1.add(textTokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        textPlayerId.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textPlayerId.setForeground(new java.awt.Color(255, 255, 255));
        textPlayerId.setText("playerid");
        jPanel1.add(textPlayerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        btnPlay.setBackground(new java.awt.Color(102, 102, 102));
        btnPlay.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnPlay.setForeground(new java.awt.Color(255, 0, 255));
        btnPlay.setText("Play");
        btnPlay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPlay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });
        jPanel1.add(btnPlay, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, 140, 60));

        textAvatar.setText("j");
        textAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255), 2));
        jPanel1.add(textAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 130, 130));

        textLevel.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textLevel.setForeground(new java.awt.Color(255, 255, 255));
        textLevel.setText("Level");
        jPanel1.add(textLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, -1));

        textTotalWins.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textTotalWins.setForeground(new java.awt.Color(255, 255, 255));
        textTotalWins.setText("TotalWins");
        jPanel1.add(textTotalWins, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        textScore.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        textScore.setForeground(new java.awt.Color(255, 255, 255));
        textScore.setText("Scrore");
        jPanel1.add(textScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));
        jPanel1.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 368, 10));

        editTextNoOfTokens.setBackground(new java.awt.Color(0, 0, 0));
        editTextNoOfTokens.setForeground(new java.awt.Color(255, 255, 255));
        editTextNoOfTokens.setText("Enter the amount of tokens");
        editTextNoOfTokens.setBorder(null);
        editTextNoOfTokens.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                editTextNoOfTokensFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                editTextNoOfTokensFocusLost(evt);
            }
        });
        editTextNoOfTokens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTextNoOfTokensActionPerformed(evt);
            }
        });
        jPanel1.add(editTextNoOfTokens, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 368, 31));
        jPanel1.add(textResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, 240, 230));

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

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void setPlayerData() {
        textAvatar.setIcon(ImageResizer.resize(new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\GamingAvatar.jpg"), textAvatar));
        textPlayerId.setText("Player ID  :     " + player.getPlayerID());
        textUserName.setText("Name       :     " + player.getInGameName());
        textLevel.setText("Level       :     " + player.getLevel());
        textTotalWins.setText("Matchs     :    " + (player.getWins() + player.getLosses()));
        textTokens.setText("Tokens     :     " + player.getNoOfTokens());
        textScore.setText("Score      :     " + player.getScore());
    }

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }

    private void clear() {
        buttonClear.setVisible(false);
        btnPlay.setVisible(true);
        textMessage.setText(null);
        textResult.setIcon(null);
        setFieldVisible(true);
        editTextNoOfTokens.setText(null);
    }

    private int genrateDouble() {
        int r = 0;
        int[] nums = {0, 0, 0, 0, 2};
        r = nums[new Random().nextInt(5)];
        return r;
    }

    private void playPart2(int option) {
        setOptionsFieldVisible(false);
        textMessage.setText(null);
        int win = genrateDouble();
        if (option == 1) {
            if (win == 0) {
                textMessage.setText("You Lost Better luck next time");
                textResult.setIcon(ImageResizer.resize(coin2, textResult));
            } else if (win == 2) {
                textMessage.setText("You Won! " + (tokens * 2) + "Tokens.");
                player.addTokens(tokens * 2);
                textResult.setIcon(ImageResizer.resize(coin1, textResult));
            }
        } else if (option == 2) {
            if (win == 0) {
                textMessage.setText("You Lost Better luck next time");
                textResult.setIcon(ImageResizer.resize(coin1, textResult));

            } else if (win == 2) {
                textMessage.setText("You Won! " + (tokens * 2) + "Tokens.");
                player.addTokens(tokens * 2);
                textResult.setIcon(ImageResizer.resize(coin2, textResult));
            }
        }
        new DBConnection().UpdateplayerData(player);
        buttonClear.setVisible(true);
        setPlayerData();
    }

    private void play(int tokens) {
        this.tokens = tokens;
        textMessage.setText("Please select one coin");
        btnPlay.setVisible(false);
        setFieldVisible(false);
        setOptionsFieldVisible(true);
    }

    private void setOptionsFieldVisible(boolean b) {
        textCoin1.setVisible(b);
        textCoin2.setVisible(b);
    }

    private void setFieldVisible(boolean b) {
        editTextNoOfTokens.setVisible(b);
        jSeparator.setVisible(b);
    }

    private void update(int prize) {
        if (prize == 0) {
            textMessage.setText("Better Luck Next Time!");
            player.addLoss();
        } else {
            textMessage.setText("You Won " + prize + "Tokens. Congrats!");
            player.addWin();
            new DBConnection().takeAmount(prize);
        }
    }

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        String text = editTextNoOfTokens.getText();
        if (!text.equals("Enter the amount of tokens")) {
            try {
                int tokens = Integer.parseInt(text);
                if (player.getNoOfTokens() >= tokens) {
                    player.takeTokens(tokens);
                    play(tokens);
                } else {
                    textMessage.setText("out Of tokens please buy some!");
                }
            } catch (Exception e) {
                textMessage.setText("Please enter the vaild input!");
            }
        } else {
            textMessage.setText("Please enter the number of tokens first!");
        }

    }//GEN-LAST:event_btnPlayActionPerformed

    private void editTextNoOfTokensFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNoOfTokensFocusGained
        if (editTextNoOfTokens.getText().equals("Enter the amount of tokens")) {
            editTextNoOfTokens.setText(null);
        }
    }//GEN-LAST:event_editTextNoOfTokensFocusGained

    private void editTextNoOfTokensFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_editTextNoOfTokensFocusLost
        if (editTextNoOfTokens.getText().isEmpty()) {
            editTextNoOfTokens.setText("Enter the amount of tokens");
        }
    }//GEN-LAST:event_editTextNoOfTokensFocusLost

    private void editTextNoOfTokensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTextNoOfTokensActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editTextNoOfTokensActionPerformed

    private void textCoin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCoin1MouseClicked
        playPart2(1);
    }//GEN-LAST:event_textCoin1MouseClicked

    private void textCoin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textCoin2MouseClicked
        playPart2(2);
    }//GEN-LAST:event_textCoin2MouseClicked

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
            java.util.logging.Logger.getLogger(DoubleOrNothingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoubleOrNothingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoubleOrNothingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoubleOrNothingGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoubleOrNothingGUI(new Player("1234", 12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnPlay;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHome;
    private javax.swing.JTextField editTextNoOfTokens;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel textAvatar;
    private javax.swing.JLabel textCoin1;
    private javax.swing.JLabel textCoin2;
    private javax.swing.JLabel textLevel;
    private javax.swing.JLabel textMessage;
    private javax.swing.JLabel textPlayerId;
    private javax.swing.JLabel textResult;
    private javax.swing.JLabel textScore;
    private javax.swing.JLabel textTokens;
    private javax.swing.JLabel textTotalWins;
    private javax.swing.JLabel textUserName;
    // End of variables declaration//GEN-END:variables
}
