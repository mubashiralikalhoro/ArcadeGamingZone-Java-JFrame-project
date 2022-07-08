/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.Maze;

/**
 *
 * @author Mubashir Ali
 */
public class MazeGUI extends javax.swing.JFrame {

    private Maze maze;
    
    public MazeGUI() {
        initComponents();
        maze= new Maze();
        for(int i=0;i<20;i++){
            String temp="";
            for(int j=0;j<maze.getGame()[i].length;j++){
                temp+=maze.getGame()[i][j];
            }
            setView(i,temp);
        }
       
    }

    private void setView(int index,String view){
        if(index==0){
            jLabel1.setText(view);
        }else if(index==1){
            jLabel2.setText(view);
        }else if(index==2){
            jLabel3.setText(view);
        }else if(index==3){
            jLabel5.setText(view);
        }else if(index==4){
            jLabel4.setText(view);
        }else if(index==5){
            jLabel6.setText(view);
        }else if(index==6){
            jLabel7.setText(view);
        }else if(index==7){
            jLabel8.setText(view);
        }else if(index==8){
            jLabel9.setText(view);
        }else if(index==9){
            jLabel10.setText(view);
        }else if(index==10){
            jLabel11.setText(view);
        }else if(index==11){
            jLabel12.setText(view);
        }else if(index==12){
            jLabel17.setText(view);
        }else if(index==13){
            jLabel16.setText(view);
        }else if(index==14){
            jLabel13.setText(view);
        }else if(index==15){
            jLabel18.setText(view);
        }else if(index==16){
            jLabel14.setText(view);
        }else if(index==17){
            jLabel15.setText(view);
        }else if(index==18){
            jLabel20.setText(view);
        }else if(index==19){
            jLabel19.setText(view);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setText("----------------------------------------------------------------");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 255));
        jLabel2.setText("----------------------------------------------------------------");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 255));
        jLabel3.setText("----------------------------------------------------------------");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 255));
        jLabel4.setText("----------------------------------------------------------------");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 255));
        jLabel5.setText("----------------------------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 255));
        jLabel6.setText("----------------------------------------------------------------");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 255));
        jLabel7.setText("----------------------------------------------------------------");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 255));
        jLabel8.setText("----------------------------------------------------------------");

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 255));
        jLabel9.setText("----------------------------------------------------------------");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 255));
        jLabel10.setText("----------------------------------------------------------------");

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 255));
        jLabel11.setText("----------------------------------------------------------------");

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 255));
        jLabel12.setText("----------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 255));
        jLabel13.setText("----------------------------------------------------------------");

        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 255));
        jLabel14.setText("----------------------------------------------------------------");

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 255));
        jLabel15.setText("----------------------------------------------------------------");

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 255));
        jLabel16.setText("----------------------------------------------------------------");

        jLabel17.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 255));
        jLabel17.setText("----------------------------------------------------------------");

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 255));
        jLabel18.setText("----------------------------------------------------------------");

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 255));
        jLabel19.setText("----------------------------------------------------------------");

        jLabel20.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 255));
        jLabel20.setText("----------------------------------------------------------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addContainerGap(42, Short.MAX_VALUE))
        );

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
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MazeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MazeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MazeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MazeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MazeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
