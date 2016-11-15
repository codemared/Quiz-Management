package vocabuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


/**
 *
 * @author Md Saddam Hossain
 */
public class StartMenu extends javax.swing.JFrame {
    
   
    public static javax.swing.JPanel jPanel2OfStartMenu;
    public static StartMenu startMenu;
    
    
    public static FileWriter fileWriterOfMcq;
    public static PrintWriter printWriterOfMcq;
    public static FileReader fileReaderOfMcq;
    public static BufferedReader bufferedReaderOfMcq;
    
    public static FileWriter fileWriterOfGapFilling;
    public static PrintWriter printWriterOfGapFilling;
    public static FileReader fileReaderOfGapFilling;
    public static BufferedReader bufferedReaderOfGapFilling;
    
    public StartMenu() {
        initComponents();
        jPanel2OfStartMenu = jPanel1OfStartMenu;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1OfStartMenu = new javax.swing.JPanel();
        jButton3ForHelp = new javax.swing.JButton();
        jButton4ForExit = new javax.swing.JButton();
        jButton2ForAbout = new javax.swing.JButton();
        jButtonForStart = new javax.swing.JButton();
        backGroundImageIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocabuilder");
        setPreferredSize(new java.awt.Dimension(800, 650));
        setResizable(false);

        jPanel1OfStartMenu.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1OfStartMenu.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1OfStartMenu.setLayout(null);

        jButton3ForHelp.setText("Tips");
        jButton3ForHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ForHelpActionPerformed(evt);
            }
        });
        jPanel1OfStartMenu.add(jButton3ForHelp);
        jButton3ForHelp.setBounds(300, 130, 61, 30);

        jButton4ForExit.setText("Exit");
        jButton4ForExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ForExitActionPerformed(evt);
            }
        });
        jPanel1OfStartMenu.add(jButton4ForExit);
        jButton4ForExit.setBounds(300, 170, 61, 30);

        jButton2ForAbout.setText("About");
        jButton2ForAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ForAboutActionPerformed(evt);
            }
        });
        jPanel1OfStartMenu.add(jButton2ForAbout);
        jButton2ForAbout.setBounds(300, 90, 61, 30);

        jButtonForStart.setText("Start");
        jButtonForStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonForStartActionPerformed(evt);
            }
        });
        jPanel1OfStartMenu.add(jButtonForStart);
        jButtonForStart.setBounds(300, 50, 61, 30);

        backGroundImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vocabuilder/keyboard.jpg"))); // NOI18N
        backGroundImageIcon.setText("jLabel1");
        backGroundImageIcon.setMaximumSize(new java.awt.Dimension(800, 650));
        backGroundImageIcon.setMinimumSize(new java.awt.Dimension(800, 650));
        backGroundImageIcon.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel1OfStartMenu.add(backGroundImageIcon);
        backGroundImageIcon.setBounds(-10, 0, 800, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1OfStartMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1OfStartMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonForStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonForStartActionPerformed
        // TODO add your handling code here:
//   
        StartMenu.startMenu.getContentPane().remove(StartMenu.startMenu.jPanel2OfStartMenu);
        StartMenu.startMenu.getContentPane().add(Exam.jPanel2ForExam);
        StartMenu.startMenu.repaint();
    }//GEN-LAST:event_jButtonForStartActionPerformed

    private void jButton2ForAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ForAboutActionPerformed
        // TODO add your handling code here:

        StartMenu.startMenu.getContentPane().remove(StartMenu.startMenu.jPanel2OfStartMenu);
        StartMenu.startMenu.getContentPane().add(About.jPanlel2OfAbout); 
        StartMenu.startMenu.repaint();
        
        
    }//GEN-LAST:event_jButton2ForAboutActionPerformed

    private void jButton4ForExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ForExitActionPerformed
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jButton4ForExitActionPerformed

    private void jButton3ForHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ForHelpActionPerformed
        // TODO add your handling code here:
//       
        StartMenu.startMenu.getContentPane().remove(StartMenu.startMenu.jPanel2OfStartMenu);
        StartMenu.startMenu.getContentPane().add(Tips.jPanel2OfTips); 
        StartMenu.startMenu.repaint();
        
    }//GEN-LAST:event_jButton3ForHelpActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
              
       startMenu = new StartMenu();
       new Exam();
       new About();
       new Tips();
       
       
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
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                startMenu = new StartMenu();
                startMenu.setLocationRelativeTo(null);
                startMenu.setVisible(true);
                startMenu.setResizable(false);
                startMenu.setSize(800, 650);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGroundImageIcon;
    private javax.swing.JButton jButton2ForAbout;
    private javax.swing.JButton jButton3ForHelp;
    private javax.swing.JButton jButton4ForExit;
    private javax.swing.JButton jButtonForStart;
    private javax.swing.JPanel jPanel1OfStartMenu;
    // End of variables declaration//GEN-END:variables

//    boolean checkFile(String questionscsv) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

}
