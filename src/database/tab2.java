/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.util.*;

import com.mysql.jdbc.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABIMBOLA LINUX
 */
public class tab2 extends javax.swing.JFrame {

    /**
     * Creates new form tab2
     */
    public tab2() {
        try {
            this.connect = tb.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(tab2.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        matricspace = new javax.swing.JTextField();
        SEARCH = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("WELCOME STUDENT ENTER YOUR MATRIC NUMBER");

        SEARCH.setText("SEARCH MATRIC NUMBER");
        SEARCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARCHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SEARCH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(matricspace, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(466, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(matricspace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SEARCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARCHActionPerformed
        // TODO add your handling code here:
         String matricno=null;
        
       matricno=matricspace.getText();
       int ip=Integer.parseInt(matricno);
       
         Connection   connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfos","root","david");
        
  Statement sqlSta=(Statement) connection.createStatement();
  
   String bqs="SELECT *  FROM students WHERE idstudent = " + ip;
   ResultSet rset =sqlSta.executeQuery(bqs);
             if(rset.next()) {
                 
                         
            String name=rset.getString(2);
            String matric=rset.getString(1);
            String ages=rset.getString(6);
            String level=rset.getString(5);
              String states=rset.getString(3);
               String gp=rset.getString(4);
             
                 //sqlSta.executeUpdate(bqs);
                 
                   JOptionPane.showMessageDialog(tab2.this, String.format("the user is in this database"));
      
             }
               
      else{
          
          JOptionPane.showMessageDialog(tab2.this, String.format("invalid entry:not available in the database"));
          
}


        }
           
      catch(Exception ex){
              JOptionPane.showMessageDialog(tab2.this, String.format("invalid matrino:not available in the database"));
          ex.printStackTrace();
          
}
       //     JOptionPane.showMessageDialog(tab2.this, String.format("you pressed :%s",
       //          matricno));
    }//GEN-LAST:event_SEARCHActionPerformed

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
            java.util.logging.Logger.getLogger(tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tab2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tab2().setVisible(true);
            }
        });
    }
    connection tb = new connection();
            
         Connection   connect;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SEARCH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField matricspace;
    // End of variables declaration//GEN-END:variables
}