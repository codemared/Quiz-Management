/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vocabuilder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.Timer;

/**
 *
 * @author Md Saddam Hossain
 */
public class VocabularyTest extends JFrame {

    static VocabularyTest vocabularyTest;
    private Timer timer;//....................................................................................
    public int cnt = 1, col = 0, row = 0, rowNum = 0, i = 2, examResult=0;
    public int[][] ans = new int[100][5];
    public int[][] check = new int[100][5];
    public String[][] arr = new String[100][10];
    public static FileWriter fileWriterOfVocabularyTest;
    public static PrintWriter printWriterOfVocabularyTest;
    public static FileReader fileReaderOfVocabularyTest;
    public static BufferedReader bufferedReaderOfVocabularyTest;
    int second = 0, minute = 0;//..........................................
    String str = "";//..........................................................
    /**
     * Creates new form VocabularyTest
     */

     public void receive(){
              for(int i = 1; i<rowNum; ++i)
              {
                  int j = 0;
                  while(j < 6){
                      try{
                      arr[i][j] = Exam.dataIn.readUTF();
                      }
                      catch(Exception e){
                          System.out.println("Exception in receive server data!!!");
                      }
                  }
              }
              for(int i = 1; i<rowNum; ++i)
              {
                  int j = 0;
                  while(j <6){
                      System.out.println("received : " + arr[i][j]);
                  }
              }
                
            }
    public VocabularyTest() {

        initComponents();
       
        try {  //data retrive from csv file
            timer = new Timer(1000, new TimerListener());
            timer.start();
             
//            fileReaderOfVocabularyTest = new FileReader("Questions.csv");
//            bufferedReaderOfVocabularyTest = new BufferedReader(fileReaderOfVocabularyTest);
//
//            String line = null;
//            String[] ar = new String[10];
//
//            while ((line = bufferedReaderOfVocabularyTest.readLine()) != null) {
//                rowNum++;
//                ar = line.split(",");
//                for (int i = 0; i < 6; i++) {
//
//                    arr[rowNum][i] = ar[i];
//
//                }
//                System.out.println();
//            }
//            VocabularyTest.bufferedReaderOfVocabularyTest.close();
           
            
        } catch (Exception e2) {
            System.out.println("Exception in VocabularyTest!");
        }
        jLabel1ForQuestion.setText(String.valueOf(arr[1][0]));
        jLabel2ForNumber.setText(String.valueOf(i - 1 + "."));
        jLabel1Forop1.setText(String.valueOf(arr[1][1]));
        jLabel2Forop2.setText(String.valueOf(arr[1][2]));
        jLabel3Forop3.setText(String.valueOf(arr[1][3]));
        jLabel4Forop4.setText(String.valueOf(arr[1][4]));
//        System.out.println(rowNum);
//        for(int j = 1; j<=rowNum; ++j){
//            for(int k = 0; k<6; ++k)
//        System.out.print(arr[j][k]+" ");
//        System.out.println();}
        for (row = 0; row < rowNum; ++row) {
            for (col = 0; col < 4; ++col) {
                ans[row][col] = 0;
                check[row][col] = 0;
            }
        }
        for (row = 0; row < rowNum; ++row) {
            for (col = 0; col < 4; ++col) {

                if (arr[row][col + 1] == arr[row][5]) {
                    check[row + 1][col] = 1;
                } else if (arr[row][col + 1] == arr[row][6]) {
                    check[row + 1][col] = 1;
                } else if (arr[row][col + 1] == arr[row][7]) {
                    check[row + 1][col] = 1;
                } else if (arr[row][col + 1] == arr[row][8]) {
                    check[row + 1][col] = 1;
                }

            }
        }

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
        jLabel1ForQuestion = new javax.swing.JLabel();
        jLabel2ForNumber = new javax.swing.JLabel();
        jCheckBox1Forop1 = new javax.swing.JCheckBox();
        jCheckBox2Forop2 = new javax.swing.JCheckBox();
        jCheckBox3Forop3 = new javax.swing.JCheckBox();
        jCheckBox4Forop4 = new javax.swing.JCheckBox();
        jLabel1Forop1 = new javax.swing.JLabel();
        jLabel2Forop2 = new javax.swing.JLabel();
        jLabel3Forop3 = new javax.swing.JLabel();
        jLabel4Forop4 = new javax.swing.JLabel();
        jButton1ForNext = new javax.swing.JButton();
        jButton2ForPrev = new javax.swing.JButton();
        label1ForTimer = new javax.swing.JLabel();
        jButton1ForBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vocabuilder");
        setPreferredSize(new java.awt.Dimension(800, 650));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 650));
        jPanel2.setLayout(null);

        jLabel1ForQuestion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1ForQuestion.setForeground(new java.awt.Color(0, 204, 51));
        jPanel2.add(jLabel1ForQuestion);
        jLabel1ForQuestion.setBounds(110, 100, 700, 80);

        jLabel2ForNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2ForNumber.setForeground(new java.awt.Color(0, 204, 51));
        jPanel2.add(jLabel2ForNumber);
        jLabel2ForNumber.setBounds(80, 130, 50, 20);

        jCheckBox1Forop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1Forop1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1Forop1);
        jCheckBox1Forop1.setBounds(220, 220, 21, 21);

        jCheckBox2Forop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2Forop2ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox2Forop2);
        jCheckBox2Forop2.setBounds(220, 250, 21, 21);

        jCheckBox3Forop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3Forop3ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox3Forop3);
        jCheckBox3Forop3.setBounds(220, 280, 21, 21);

        jCheckBox4Forop4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4Forop4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4Forop4);
        jCheckBox4Forop4.setBounds(220, 310, 21, 21);

        jLabel1Forop1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel2.add(jLabel1Forop1);
        jLabel1Forop1.setBounds(260, 210, 150, 30);

        jLabel2Forop2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel2.add(jLabel2Forop2);
        jLabel2Forop2.setBounds(260, 240, 160, 30);

        jLabel3Forop3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel2.add(jLabel3Forop3);
        jLabel3Forop3.setBounds(260, 270, 160, 30);

        jLabel4Forop4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jPanel2.add(jLabel4Forop4);
        jLabel4Forop4.setBounds(260, 300, 160, 30);

        jButton1ForNext.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1ForNext.setText("Next>>");
        jButton1ForNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ForNextActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1ForNext);
        jButton1ForNext.setBounds(550, 440, 80, 23);

        jButton2ForPrev.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2ForPrev.setText("<<Prev");
        jButton2ForPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ForPrevActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2ForPrev);
        jButton2ForPrev.setBounds(110, 440, 80, 23);

        label1ForTimer.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        label1ForTimer.setText("00:00");
        jPanel2.add(label1ForTimer);
        label1ForTimer.setBounds(550, 40, 110, 30);

        jButton1ForBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1ForBack.setText("<<-Back");
        jButton1ForBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ForBackActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1ForBack);
        jButton1ForBack.setBounds(40, 30, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
         //click button for next question
    
    private class TimerListener implements ActionListener {//.....................................................
        public void actionPerformed(ActionEvent event) {
            ++second;
            if (second == 60) {
                second = 0;
                ++minute;
            }

            str = "0" + minute + ":";

            if (second < 10) {
                str += "0" + second;
            } else {
                str += "" + second;
            }
            
            if(second == 10)
            {
                for(int i=1; i<=rowNum; ++i){
                    int cnt = 1;
                    for(int j = 0; j<4; ++j){
                        if(check[i][j]==ans[i][j])
                            ++cnt;
                    }
                     if(cnt==4)
                         ++examResult;
                }
                timer.stop();
                
                
                
                ShowResult showResult = new ShowResult();
                showResult.res = examResult;
                showResult.setLabel();
                
                StartMenu.startMenu.getContentPane().remove(VocabularyTest.jPanel2);
                StartMenu.startMenu.getContentPane().add(ShowResult.jPanel1);
                StartMenu.startMenu.repaint();
                
            }
            
            label1ForTimer.setText(str);
        }
    }
    
    private void jButton1ForNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ForNextActionPerformed
        // TODO add your handling code here:

        jLabel1ForQuestion.setText(String.valueOf(arr[i][0]));
        jLabel2ForNumber.setText(String.valueOf(i + "."));
        jLabel1Forop1.setText(String.valueOf(arr[i][1]));
        jLabel2Forop2.setText(String.valueOf(arr[i][2]));
        jLabel3Forop3.setText(String.valueOf(arr[i][3]));
        jLabel4Forop4.setText(String.valueOf(arr[i][4]));

        if (ans[i][0] == 0) {
            jCheckBox1Forop1.setSelected(false);
        }
        if (ans[i][1] == 0) {
            jCheckBox2Forop2.setSelected(false);
        }
        if (ans[i][2] == 0) {
            jCheckBox3Forop3.setSelected(false);
        }
        if (ans[i][3] == 0) {
            jCheckBox4Forop4.setSelected(false);
        }
        if (ans[i][0] == 1) {
            jCheckBox1Forop1.setSelected(true);
        }
        if (ans[i][1] == 1) {
            jCheckBox2Forop2.setSelected(true);
        }
        if (ans[i][2] == 1) {
            jCheckBox3Forop3.setSelected(true);
        }
        if (ans[i][3] == 1) {
            jCheckBox4Forop4.setSelected(true);
        }
        if (i >= rowNum) {
            jButton1ForNext.setEnabled(false);
            jButton2ForPrev.setEnabled(true);
        } else {
            jButton1ForNext.setEnabled(true);
            jButton2ForPrev.setEnabled(true);
        }
        i++;
    }//GEN-LAST:event_jButton1ForNextActionPerformed
    //click button for previous question
    private void jButton2ForPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ForPrevActionPerformed
        // TODO add your handling code here:

        --i;
        jLabel1ForQuestion.setText(String.valueOf(arr[i - 1][0]));
        jLabel2ForNumber.setText(String.valueOf(i - 1 + "."));
        jLabel1Forop1.setText(String.valueOf(arr[i - 1][1]));
        jLabel2Forop2.setText(String.valueOf(arr[i - 1][2]));
        jLabel3Forop3.setText(String.valueOf(arr[i - 1][3]));
        jLabel4Forop4.setText(String.valueOf(arr[i - 1][4]));

        if (ans[i - 1][0] == 0) {
            jCheckBox1Forop1.setSelected(false);
        }
        if (ans[i - 1][1] == 0) {
            jCheckBox2Forop2.setSelected(false);
        }
        if (ans[i - 1][2] == 0) {
            jCheckBox3Forop3.setSelected(false);
        }
        if (ans[i - 1][3] == 0) {
            jCheckBox4Forop4.setSelected(false);
        }
        if (ans[i - 1][0] == 1) {
            jCheckBox1Forop1.setSelected(true);
        }
        if (ans[i - 1][1] == 1) {
            jCheckBox2Forop2.setSelected(true);
        }
        if (ans[i - 1][2] == 1) {
            jCheckBox3Forop3.setSelected(true);
        }
        if (ans[i - 1][3] == 1) {
            jCheckBox4Forop4.setSelected(true);
        }
        jButton1ForNext.setEnabled(true);
        if (i <= 2) {
            jButton2ForPrev.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2ForPrevActionPerformed
    // action handled of checkbox1
    private void jCheckBox1Forop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1Forop1ActionPerformed
        // TODO add your handling code here:
        boolean t;

        t = jCheckBox1Forop1.isSelected();
        //System.out.println(t);
        if (t == true) {
            ans[i - 1][0] = 1;
        } else {
            ans[i - 1][0] = 0;
        }


    }//GEN-LAST:event_jCheckBox1Forop1ActionPerformed
    // action handled of checkbox2
    private void jCheckBox2Forop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2Forop2ActionPerformed
        // TODO add your handling code here:
        boolean t1;

        t1 = jCheckBox2Forop2.isSelected();
        if (t1 == true) {
            ans[i - 1][1] = 1;
        } else {
            ans[i - 1][1] = 0;
        }

    }//GEN-LAST:event_jCheckBox2Forop2ActionPerformed
    // action handled of checkbox3
    private void jCheckBox3Forop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3Forop3ActionPerformed
        // TODO add your handling code here:
        boolean t2;

        t2 = jCheckBox3Forop3.isSelected();
        if (t2 == true) {
            ans[i - 1][2] = 1;
        } else {
            ans[i - 1][2] = 0;
        }

    }//GEN-LAST:event_jCheckBox3Forop3ActionPerformed
    // action handled of checkbox4
    private void jCheckBox4Forop4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4Forop4ActionPerformed
        // TODO add your handling code here:
        boolean t3;

        t3 = jCheckBox4Forop4.isSelected();
        if (t3 == true) {
            ans[i - 1][3] = 1;
        } else {
            ans[i - 1][3] = 0;
        }

    }//GEN-LAST:event_jCheckBox4Forop4ActionPerformed

    private void jButton1ForBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ForBackActionPerformed
        // TODO add your handling code here:
        StartMenu.startMenu.getContentPane().remove(VocabularyTest.jPanel2);
        StartMenu.startMenu.getContentPane().add(Exam.jPanel2ForExam);
             StartMenu.startMenu.repaint();
    }//GEN-LAST:event_jButton1ForBackActionPerformed

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
            java.util.logging.Logger.getLogger(VocabularyTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VocabularyTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VocabularyTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VocabularyTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               vocabularyTest = new VocabularyTest();
                vocabularyTest.setVisible(true);
                // new VocabularyTest().fileReader(); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1ForBack;
    private javax.swing.JButton jButton1ForNext;
    private javax.swing.JButton jButton2ForPrev;
    private javax.swing.JCheckBox jCheckBox1Forop1;
    private javax.swing.JCheckBox jCheckBox2Forop2;
    private javax.swing.JCheckBox jCheckBox3Forop3;
    private javax.swing.JCheckBox jCheckBox4Forop4;
    private javax.swing.JLabel jLabel1ForQuestion;
    private javax.swing.JLabel jLabel1Forop1;
    private javax.swing.JLabel jLabel2ForNumber;
    private javax.swing.JLabel jLabel2Forop2;
    private javax.swing.JLabel jLabel3Forop3;
    private javax.swing.JLabel jLabel4Forop4;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label1ForTimer;
    // End of variables declaration//GEN-END:variables
}
