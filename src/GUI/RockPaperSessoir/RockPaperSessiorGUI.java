/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.RockPaperSessoir;

import BackEnd.DBConnection;
import BackEnd.ImageResizer;
import BackEnd.ManagementClasses.Player;
import BackEnd.RockPaperSessior;
import GUI.MainPages.HomeScreen;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Mubashir Ali
 */
public class RockPaperSessiorGUI extends javax.swing.JFrame {

    private DBConnection dBC = new DBConnection();
    private RockPaperSessior rps;
    private Player player;
    private int move = 0;
    private int yourPoints = 0;
    private int aIPoints = 0;
    private boolean canPlay = true;

    private ImageIcon imgPaper = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\Paper.png");
    private ImageIcon imgRock = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\Rock.png");
    private ImageIcon imgSessior = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\Sessior.png");

    private ImageIcon imgPaperRed = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\PaperRed.png");
    private ImageIcon imgRockRed = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\RockRed.png");
    private ImageIcon imgSessiorRed = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\SessiorRed.png");

    private ImageIcon imgYouWon = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\YouWon.png");
    private ImageIcon imgAiWon = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\AIWon.png");
    private ImageIcon imgDraw = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\RockPaperSessoir\\Images\\Draw.png");

    public RockPaperSessiorGUI(Player player) {
        this.player = player;
        initComponents();
        initButtons();
        update();
        updateRound();
        textLiveScore.setText("Socre: " + player.getScore());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMassageFinal = new javax.swing.JLabel();
        textLiveScore = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelAIMove = new javax.swing.JLabel();
        labelUserMove = new javax.swing.JLabel();
        btnPaper = new javax.swing.JButton();
        btnRock = new javax.swing.JButton();
        btnSessior = new javax.swing.JButton();
        labelMassage = new javax.swing.JLabel();
        textWinningMassage = new javax.swing.JLabel();
        textRound = new javax.swing.JLabel();
        textYou = new javax.swing.JLabel();
        textAI = new javax.swing.JLabel();
        buttonClear1 = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelMassageFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 180, 760, 210));

        textLiveScore.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textLiveScore.setForeground(new java.awt.Color(255, 0, 255));
        jPanel1.add(textLiveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 160, 30));

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/HomeBtn.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 80, 80));

        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 700, -1, -1));
        jPanel1.add(labelAIMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 97, 400, 400));
        jPanel1.add(labelUserMove, new org.netbeans.lib.awtextra.AbsoluteConstraints(133, 97, 400, 400));

        btnPaper.setBackground(new java.awt.Color(0, 0, 0));
        btnPaper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaperActionPerformed(evt);
            }
        });
        jPanel1.add(btnPaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 507, 100, 100));

        btnRock.setBackground(new java.awt.Color(0, 0, 0));
        btnRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRockActionPerformed(evt);
            }
        });
        jPanel1.add(btnRock, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 507, 100, 100));

        btnSessior.setBackground(new java.awt.Color(0, 0, 0));
        btnSessior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSessiorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSessior, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 507, 100, 100));
        jPanel1.add(labelMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(486, 10, 318, 81));

        textWinningMassage.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textWinningMassage.setForeground(new java.awt.Color(255, 0, 255));
        jPanel1.add(textWinningMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 625, -1, -1));

        textRound.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        textRound.setForeground(new java.awt.Color(255, 0, 255));
        textRound.setText("Round: ");
        jPanel1.add(textRound, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 44));

        textYou.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        textYou.setForeground(new java.awt.Color(255, 0, 255));
        textYou.setText("You:0");
        jPanel1.add(textYou, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 48, 141, -1));

        textAI.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        textAI.setForeground(new java.awt.Color(255, 0, 255));
        textAI.setText("AI:0");
        jPanel1.add(textAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(903, 48, 141, -1));

        buttonClear1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RepeatButton.png"))); // NOI18N
        buttonClear1.setBorder(null);
        buttonClear1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClear1ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 80, 80));

        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RepeatButton.png"))); // NOI18N
        buttonClear.setBorder(null);
        buttonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 610, 80, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void movePlayed() {
        hideButtons();
        buttonClear1.setVisible(true);
    }

    private void play(int a) {
        if (canPlay) {
            if (move < 3) {
                rps = new RockPaperSessior(a);
                // setting user move image on GUI
                labelUserMove.setIcon(ImageResizer.resize(getUserImage(rps.getUserMove()), labelUserMove));
                // setting computer move image on GUI

                labelAIMove.setIcon(ImageResizer.resize(getAiImage(rps.getComputerMove()), labelAIMove));
                // setting Win Massage
                labelMassage.setIcon(ImageResizer.resize(getMassageImage(rps.checkUserWin()), labelMassage));
                // adding move if its not draw

                movePlayed();

                if (rps.checkUserWin() != "Draw") {
                    move++;
                }

                // Adding points
                addPoints(rps.checkUserWin());
                // setting win condition
                textWinningMassage.setText(rps.winingCondition());
                update();
                if (move == 3) {
                    labelMassage.setIcon(null);
                    labelMassageFinal.setIcon(ImageResizer.resize(getFinalWinner(), labelMassageFinal));
                    hideButtons();
                    buttonClear1.setVisible(false);
                }
            }
        }

    }

    private void update() {
        textAI.setText("AI: " + aIPoints);
        textYou.setText("You: " + yourPoints);
    }

    private void updateRound() {
        if (move < 2) {
            textRound.setText("Round: " + (move + 1) + "/3");
        } else if (move == 2) {
            textRound.setText("Final Round: 3/3");
        }
    }

    private ImageIcon getFinalWinner() {
        if (yourPoints > aIPoints) {
            player.addScore(100);
            textLiveScore.setText("Socre: " + player.getScore());
            dBC.UpdateplayerData(player);
            return imgYouWon;
        } else if (aIPoints > yourPoints) {
            return imgAiWon;
        }
        return imgDraw;
    }

    private void clear() {
        labelUserMove.setIcon(null);
        labelAIMove.setIcon(null);
        labelMassageFinal.setIcon(null);
        initButtons();
        move = 0;
        aIPoints = 0;
        yourPoints = 0;
        update();
        textWinningMassage.setText(null);
        updateRound();
    }

    private ImageIcon getUserImage(String a) {
        if (a == "Rock") {
            return imgRock;
        } else if (a == "Paper") {
            return imgPaper;
        }
        return imgSessior;
    }

    private void addPoints(String a) {
        if (a == "You Won") {
            yourPoints++;
        } else if (a == "AI Won") {
            aIPoints++;
        }
    }

    private ImageIcon getMassageImage(String a) {
        if (a == "You Won") {
            return imgYouWon;
        } else if (a == "AI Won") {
            return imgAiWon;
        }
        return imgDraw;
    }

    private ImageIcon getAiImage(String a) {
        if (a == "Rock") {
            return imgRockRed;
        } else if (a == "Paper") {
            return imgPaperRed;
        }
        return imgSessiorRed;
    }

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);

    }

    private void initButtons() {
        btnRock.setVisible(true);
        btnPaper.setVisible(true);
        btnSessior.setVisible(true);
        btnRock.setIcon(ImageResizer.resize(imgRock, btnRock));
        btnPaper.setIcon(ImageResizer.resize(imgPaper, btnPaper));
        btnSessior.setIcon(ImageResizer.resize(imgSessior, btnSessior));
        buttonClear1.setVisible(false);
    }

    private void hideButtons() {
        ImageIcon blackImage = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\TicTacToeButtonBack.png");
//          btnRock.setIcon(ImageResizer.resize(blackImage, btnRock));
//        btnPaper.setIcon(ImageResizer.resize(blackImage, btnPaper));
//        btnSessior.setIcon(ImageResizer.resize(blackImage, btnSessior));
        btnRock.setVisible(false);
        btnPaper.setVisible(false);
        btnSessior.setVisible(false);
    }

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRockActionPerformed
        play(0);
    }//GEN-LAST:event_btnRockActionPerformed

    private void btnPaperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaperActionPerformed
        play(1);
    }//GEN-LAST:event_btnPaperActionPerformed

    private void btnSessiorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSessiorActionPerformed
        play(2);
    }//GEN-LAST:event_btnSessiorActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClear1ActionPerformed
        updateRound();
        initButtons();
        labelUserMove.setIcon(null);
        labelAIMove.setIcon(null);
        textWinningMassage.setText(null);
        labelMassage.setIcon(null);
    }//GEN-LAST:event_buttonClear1ActionPerformed

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
            java.util.logging.Logger.getLogger(RockPaperSessiorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RockPaperSessiorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RockPaperSessiorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RockPaperSessiorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RockPaperSessiorGUI(new Player("1234", 12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnPaper;
    private javax.swing.JButton btnRock;
    private javax.swing.JButton btnSessior;
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonClear1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelAIMove;
    private javax.swing.JLabel labelMassage;
    private javax.swing.JLabel labelMassageFinal;
    private javax.swing.JLabel labelUserMove;
    private javax.swing.JLabel textAI;
    private javax.swing.JLabel textLiveScore;
    private javax.swing.JLabel textRound;
    private javax.swing.JLabel textWinningMassage;
    private javax.swing.JLabel textYou;
    // End of variables declaration//GEN-END:variables
}
