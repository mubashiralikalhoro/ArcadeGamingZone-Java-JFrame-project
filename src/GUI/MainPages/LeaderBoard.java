package GUI.MainPages;

import BackEnd.DBConnection;
import BackEnd.ManagementClasses.Player;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

/**
 *
 * @author Mubashir Ali
 */
public class LeaderBoard extends javax.swing.JFrame {
    
    
    Player player;
    ArrayList<Player> playersData;

    public LeaderBoard(Player player) {
        this.player=player;
        playersData = new DBConnection().getAllPlayers();
        initComponents();
        sortByScore();
        printAllPlayers();
    }

    private void sortByScore() {
        for (int i = 0; i < playersData.size(); i++) {
            for (int j = 0; j < playersData.size() - 1; j++) {
                if (playersData.get(j).getScore() < playersData.get(j + 1).getScore()) {
                    Player temp = playersData.get(j);
                    playersData.set(j, playersData.get(j + 1));
                    playersData.set(j + 1, temp);
                }
            }
        }
    }

    private String printPlayer(Player player, int rank) {
        return "\t\t" + rank + ".\t\t" + player.getInGameName() + "\t\tName: " + player.getUsername() + "\t\tLevel: " + player.getLevel() + "\t\tScore: " + player.getScore();
    }

    private void printAllPlayers() {
        String print = "";
        int rank = 1;
        for (Player i : playersData) {
            print += printPlayer(i, rank) + "\n";
            rank++;
        }

        textRanks.setText(print);
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
        btnBack = new javax.swing.JToggleButton();
        textLeaderBoard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textRanks = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 250, 50));

        textLeaderBoard.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        textLeaderBoard.setForeground(new java.awt.Color(255, 0, 255));
        textLeaderBoard.setText("LeaderBoards");
        jPanel1.add(textLeaderBoard, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 110, 30));

        textRanks.setBackground(new java.awt.Color(0, 0, 0));
        textRanks.setBorder(null);
        textRanks.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textRanks.setForeground(new java.awt.Color(255, 255, 255));
        textRanks.setText("data");
        textRanks.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        textRanks.setFocusable(false);
        jScrollPane1.setViewportView(textRanks);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 1140, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Images/homeScreen.png"))); // NOI18N
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

    private void close() {
        WindowEvent windowClose = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(windowClose);
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        close();
        new HomeScreen(player).setVisible(true);
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
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaderBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaderBoard(new Player("1234", 12, 100, 10, 5, "5210799", "DemonX", 2000, 2, "Mubashir Ali", "mubashiralikalhoro@gmail.com")).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel textLeaderBoard;
    private javax.swing.JTextPane textRanks;
    // End of variables declaration//GEN-END:variables
}
