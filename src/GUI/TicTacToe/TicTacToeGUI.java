package GUI.TicTacToe;

import BackEnd.DBConnection;
import BackEnd.ImageResizer;
import BackEnd.ManagementClasses.Player;
import BackEnd.TicTacToe;
import GUI.MainPages.HomeScreen;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

public class TicTacToeGUI extends javax.swing.JFrame {

    private Player player;
    private ImageIcon Xmove = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\TicTacToeX.png");
    private ImageIcon Omove = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\TicTacToeO.png");
    private ImageIcon empty = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\TicTacToeButtonBack.png");
    private ImageIcon AIwon = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\AIWon.png");
    private ImageIcon youWon = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\YouWon.png");
    private ImageIcon draw = new ImageIcon("C:\\Users\\Mubashir Ali\\Documents\\NetBeansProjects\\ArcadeGamingZone\\src\\GUI\\Images\\Draw.png");

    private TicTacToe ticTacToe = new TicTacToe();
    private int move = 0;

    public TicTacToeGUI(Player player) {
        initComponents();
        this.player = player;
        textLiveScore.setText("Score : "+player.getScore());
    }

    private void clear() {

        buttonMove0.setIcon(empty);
        buttonMove0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove1.setIcon(empty);
        buttonMove1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove2.setIcon(empty);
        buttonMove2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove3.setIcon(empty);
        buttonMove3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove4.setIcon(empty);
        buttonMove4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove5.setIcon(empty);
        buttonMove5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove6.setIcon(empty);
        buttonMove6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove7.setIcon(empty);
        buttonMove7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonMove8.setIcon(empty);
        buttonMove8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        winMassage.setIcon(null);
        ticTacToe = new TicTacToe();
        move = 0;
        textLiveScore.setText("Score : "+player.getScore());

    }

    private void win(int a) {
        DBConnection dBC = new DBConnection();
        if (a == 0) {
            winMassage.setIcon(AIwon);
            player.addLoss();
            dBC.UpdateplayerData(player);

        } else if (a == 1) {
            player.addWin();
            player.addScore(100);
            winMassage.setIcon(youWon);
            dBC.UpdateplayerData(player);
        }
        for (int i : ticTacToe.getAvailableMoves()) {
            if (i == 0) {
                buttonMove0.setCursor(Cursor.getDefaultCursor());
            } else if (i == 1) {
                buttonMove1.setCursor(Cursor.getDefaultCursor());
            } else if (i == 2) {
                buttonMove2.setCursor(Cursor.getDefaultCursor());
            } else if (i == 3) {
                buttonMove3.setCursor(Cursor.getDefaultCursor());
            } else if (i == 4) {
                buttonMove4.setCursor(Cursor.getDefaultCursor());
            } else if (i == 5) {
                buttonMove5.setCursor(Cursor.getDefaultCursor());
            } else if (i == 6) {
                buttonMove6.setCursor(Cursor.getDefaultCursor());
            } else if (i == 7) {
                buttonMove7.setCursor(Cursor.getDefaultCursor());
            } else if (i == 8) {
                buttonMove8.setCursor(Cursor.getDefaultCursor());
            }
        }
    }

    private void play(int a) {
        if (move == 0) {
            ticTacToe.setUserMove(a);
            update(a);
            move++;
            update(ticTacToe.getComputerMoveOne());
            move++;
        }
        if (move == 2 && ticTacToe.checkUnique(a)) {
            ticTacToe.setUserMove(a);
            update(a);
            move++;
            update(ticTacToe.getComputerMoveTwo());
            move++;
        }
        if (move == 4 && ticTacToe.checkUnique(a)) {
            ticTacToe.setUserMove(a);
            update(a);
            move++;
            update(ticTacToe.getComputerMoveThree());
            move++;
            if (ticTacToe.checkComputerWin()) {
                win(0);
            }
        }
        if (move == 6 && ticTacToe.checkUnique(a) && !ticTacToe.checkComputerWin()) {
            ticTacToe.setUserMove(a);
            update(a);
            move++;
            if (!ticTacToe.checkUserWin()) {
                update(ticTacToe.getComputerMoveFour());
                move++;
                if (ticTacToe.checkComputerWin()) {
                    win(0);
                }
            } else {
                win(1);
            }
        }
        if (move == 8 && ticTacToe.checkUnique(a) && !ticTacToe.checkComputerWin() && !ticTacToe.checkUserWin()) {
            update(a);
            if (ticTacToe.checkUserWin()) {
                win(1);
            } else {
                winMassage.setIcon(draw);
            }
        }
    }

    private ImageIcon getMove() {
        if (move % 2 == 0) {
            return ImageResizer.resize(Xmove, buttonMove0);
        }
        return ImageResizer.resize(Omove, buttonMove0);
    }

    private void update(int a) {
        switch (a) {
            case 0 -> {
                buttonMove0.setIcon(getMove());
                buttonMove0.setCursor(Cursor.getDefaultCursor());
            }
            case 1 -> {
                buttonMove1.setIcon(getMove());
                buttonMove1.setCursor(Cursor.getDefaultCursor());
            }
            case 2 -> {
                buttonMove2.setIcon(getMove());
                buttonMove2.setCursor(Cursor.getDefaultCursor());
            }
            case 3 -> {
                buttonMove3.setIcon(getMove());
                buttonMove3.setCursor(Cursor.getDefaultCursor());
            }
            case 4 -> {
                buttonMove4.setIcon(getMove());
                buttonMove4.setCursor(Cursor.getDefaultCursor());
            }
            case 5 -> {
                buttonMove5.setIcon(getMove());
                buttonMove5.setCursor(Cursor.getDefaultCursor());
            }
            case 6 -> {
                buttonMove6.setIcon(getMove());
                buttonMove6.setCursor(Cursor.getDefaultCursor());
            }
            case 7 -> {
                buttonMove7.setIcon(getMove());
                buttonMove7.setCursor(Cursor.getDefaultCursor());
            }
            case 8 -> {
                buttonMove8.setIcon(getMove());
                buttonMove8.setCursor(Cursor.getDefaultCursor());
            }
            default -> {
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        buttonMove1 = new javax.swing.JButton();
        buttonMove0 = new javax.swing.JButton();
        buttonMove2 = new javax.swing.JButton();
        buttonMove5 = new javax.swing.JButton();
        buttonMove3 = new javax.swing.JButton();
        buttonMove4 = new javax.swing.JButton();
        buttonMove6 = new javax.swing.JButton();
        buttonMove7 = new javax.swing.JButton();
        buttonMove8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        textLiveScore = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        winMassage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonMove1.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove1.setBorder(null);
        buttonMove1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove1ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, 140));

        buttonMove0.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove0.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        buttonMove0.setForeground(new java.awt.Color(255, 255, 255));
        buttonMove0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove0.setBorder(null);
        buttonMove0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove0ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove0, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 140, 140));

        buttonMove2.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove2.setBorder(null);
        buttonMove2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 140, 140));

        buttonMove5.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove5.setBorder(null);
        buttonMove5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove5ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 140, 140));

        buttonMove3.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove3.setBorder(null);
        buttonMove3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove3ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 140, 140));

        buttonMove4.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove4.setBorder(null);
        buttonMove4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove4ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, 140));

        buttonMove6.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove6.setBorder(null);
        buttonMove6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove6ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 140, 140));

        buttonMove7.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove7.setBorder(null);
        buttonMove7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove7ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 140, 140));

        buttonMove8.setBackground(new java.awt.Color(0, 0, 0));
        buttonMove8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeButtonBack.png"))); // NOI18N
        buttonMove8.setBorder(null);
        buttonMove8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMove8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMove8ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonMove8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 140, 140));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/TicTacToeBack.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 650));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 650, 650));

        textLiveScore.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textLiveScore.setForeground(new java.awt.Color(255, 0, 255));
        jPanel1.add(textLiveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 10, 160, 30));

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/HomeBtn.png"))); // NOI18N
        buttonHome.setBorder(null);
        buttonHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        jPanel1.add(buttonHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 80, 80));

        buttonClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/RepeatButton.png"))); // NOI18N
        buttonClear.setBorder(null);
        buttonClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel1.add(buttonClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 80, 80));
        jPanel1.add(winMassage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 520, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMove2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove2ActionPerformed
        play(2);
    }//GEN-LAST:event_buttonMove2ActionPerformed

    private void buttonMove6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove6ActionPerformed
        play(6);
    }//GEN-LAST:event_buttonMove6ActionPerformed

    private void buttonMove1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove1ActionPerformed
        play(1);
    }//GEN-LAST:event_buttonMove1ActionPerformed

    private void buttonMove0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove0ActionPerformed
        play(0);
    }//GEN-LAST:event_buttonMove0ActionPerformed

    private void buttonMove3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove3ActionPerformed
        play(3);
    }//GEN-LAST:event_buttonMove3ActionPerformed

    private void buttonMove4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove4ActionPerformed
        play(4);
    }//GEN-LAST:event_buttonMove4ActionPerformed

    private void buttonMove5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove5ActionPerformed
        play(5);
    }//GEN-LAST:event_buttonMove5ActionPerformed

    private void buttonMove7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove7ActionPerformed
        play(7);
    }//GEN-LAST:event_buttonMove7ActionPerformed

    private void buttonMove8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMove8ActionPerformed
        play(8);
    }//GEN-LAST:event_buttonMove8ActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
        clear();
    }//GEN-LAST:event_buttonClearActionPerformed
    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }
    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
    }//GEN-LAST:event_buttonHomeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI(new Player("1234", 12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMove0;
    private javax.swing.JButton buttonMove1;
    private javax.swing.JButton buttonMove2;
    private javax.swing.JButton buttonMove3;
    private javax.swing.JButton buttonMove4;
    private javax.swing.JButton buttonMove5;
    private javax.swing.JButton buttonMove6;
    private javax.swing.JButton buttonMove7;
    private javax.swing.JButton buttonMove8;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel textLiveScore;
    private javax.swing.JLabel winMassage;
    // End of variables declaration//GEN-END:variables
}
