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
public class FormEditMakanan extends javax.swing.JFrame {

    /**
     * Creates new form FormEditMakanan
     */
    public FormEditMakanan() {
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

        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jenis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        harga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        masa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(267, 340, 90, 40);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/updated.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(40, 340, 103, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID Makanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 71, 96, 20);
        getContentPane().add(id);
        id.setBounds(150, 63, 210, 30);
        getContentPane().add(nama);
        nama.setBounds(150, 110, 210, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama Makanan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 110, 96, 20);
        getContentPane().add(jenis);
        jenis.setBounds(150, 160, 210, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Jenis Makanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 160, 80, 20);
        getContentPane().add(harga);
        harga.setBounds(150, 210, 210, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Harga Makanan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 210, 85, 20);
        getContentPane().add(masa);
        masa.setBounds(150, 260, 210, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Masa Makanan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 260, 96, 20);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(160, 340, 90, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Edit Data Makanan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(150, 10, 160, 17);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FRM.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1280, 853);

        setSize(new java.awt.Dimension(463, 434));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Master_makanan a = new Master_makanan();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int info = JOptionPane.showConfirmDialog(null, "Hapus Data ?");
        switch(info){
            case JOptionPane.YES_OPTION  :
                try {
                    String sql = "delete from master_makanan where id_makanan = '"+ id.getText() +"' " ;
                    java.sql.Connection conn = (Connection)koneksi.configDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                   JOptionPane.showMessageDialog(null, "data di hapus");
                   this.dispose();
                   Master_makanan a  = new Master_makanan();
                   a.setVisible(true);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    Master_makanan a  = new Master_makanan();
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
            String sql = "update master_makanan set "
                    + "id_makanan = '"+ id.getText() + "' , "
                    + "nama_makanan = '"+ nama.getText() +"' ,"
                    + "jenis_makanan = '"+ jenis.getText() +"' ,"
                    + "harga_makanan = '"+ harga.getText() +"' ,"
                    + "masa_makanan = '"+ masa.getText() +"' where id_makanan='"+ id.getText() +"'  ";
                  java.sql.Connection conn = (Connection)koneksi.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Data Di Update");
                  this.dispose();
                  Master_makanan a  = new Master_makanan();
                  a.setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
            Master_makanan a  = new Master_makanan();
            a.setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed
    
    public void form (String[] data){
        id.setText(data[0]);
        nama.setText(data[1]);
        jenis.setText(data[2]);
        harga.setText(data[3]);
        masa.setText(data[4]);
    }
    
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
            java.util.logging.Logger.getLogger(FormEditMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditMakanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditMakanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField masa;
    private javax.swing.JTextField nama;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
