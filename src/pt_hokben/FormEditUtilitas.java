/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_hokben;

import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author dasep
 */
public class FormEditUtilitas extends javax.swing.JFrame {

    /**
     * Creates new form FormEditKendaraan
     */
    public FormEditUtilitas() {
        initComponents();
        id.setEnabled(false);
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
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        merk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bahanbakar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        biaya = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        keterangan = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Id Utilitas");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 60, 110, 30);
        getContentPane().add(id);
        id.setBounds(200, 60, 230, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Merk Kendaraan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 110, 30);
        getContentPane().add(merk);
        merk.setBounds(200, 110, 230, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Bahan Bakar");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 110, 30);
        getContentPane().add(bahanbakar);
        bahanbakar.setBounds(200, 150, 230, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Biaya Operasional");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 110, 30);
        getContentPane().add(biaya);
        biaya.setBounds(200, 190, 230, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Keterangan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 110, 30);
        getContentPane().add(keterangan);
        keterangan.setBounds(200, 230, 230, 30);

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(350, 290, 80, 40);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(240, 290, 90, 40);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/updated.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(130, 290, 94, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Edit Data Utilitas");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 10, 120, 17);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FRM.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 510, 370);

        setSize(new java.awt.Dimension(516, 402));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Master_utilitas a = new Master_utilitas();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         int info = JOptionPane.showConfirmDialog(null, "Hapus Data ?");
        switch(info){
            case JOptionPane.YES_OPTION  :
                try {
                    String sql = "delete from form_utilitas  where id = '"+ id.getText() +"' " ;
                    java.sql.Connection conn = (Connection)koneksi.configDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                   JOptionPane.showMessageDialog(null, "data di hapus");
                   this.dispose();
                   Master_utilitas a  = new Master_utilitas();
                   a.setVisible(true);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    Master_utilitas a  = new Master_utilitas();
                    a.setVisible(true);
                }
               break ;
            default : 
                
             break ;
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
         try {
            String sql = "update form_utilitas set "
                    + "id = '"+ id.getText() + "' , "
                    + "merk_kendaraan = '"+ merk.getText() +"' ,"
                    + "bahan_bakar = '"+ bahanbakar.getText() +"' ,"
                    + "biaya_operasional = '"+ biaya.getText() +"' , "
                    + "keterangan = '"+ keterangan.getText() +" ' where id='"+ id.getText() +"'  ";
                  java.sql.Connection conn = (Connection)koneksi.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Data Di Update");
                  Master_utilitas a  = new Master_utilitas();
                  a.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            Master_utilitas a  = new Master_utilitas();
            a.setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public void form (String[] data){
        id.setText(data[0]);
        merk.setText(data[1]);
        bahanbakar.setText(data[2]);
        biaya.setText(data[3]);
        keterangan.setText(data[4]);
    }
    
    
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
            java.util.logging.Logger.getLogger(FormEditUtilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditUtilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditUtilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditUtilitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditUtilitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField bahanbakar;
    private javax.swing.JTextField biaya;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField keterangan;
    private javax.swing.JTextField merk;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
