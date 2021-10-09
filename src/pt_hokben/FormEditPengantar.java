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
public class FormEditPengantar extends javax.swing.JFrame {

    /**
     * Creates new form FormEditPengantar
     */
    public FormEditPengantar() {
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
        nama = new javax.swing.JTextField();
        area = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        notelepon = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        umur = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tanggal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Id Pengantar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 75, 20);
        getContentPane().add(id);
        id.setBounds(160, 70, 231, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 75, 20);
        getContentPane().add(nama);
        nama.setBounds(160, 110, 231, 30);
        getContentPane().add(area);
        area.setBounds(160, 150, 231, 30);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Area");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 75, 20);
        getContentPane().add(notelepon);
        notelepon.setBounds(160, 190, 231, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("No Telepon");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 190, 75, 20);
        getContentPane().add(umur);
        umur.setBounds(160, 230, 231, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Umur");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 230, 75, 20);
        getContentPane().add(tanggal);
        tanggal.setBounds(160, 270, 231, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Tanggal Lahir");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 280, 95, 20);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(160, 310, 231, 90);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Alamat");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 320, 63, 20);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/updated.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(70, 430, 110, 40);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(190, 430, 100, 40);

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(300, 430, 90, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Edit Data Pengantar");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(160, 10, 140, 17);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FRM.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 470, 510);

        setSize(new java.awt.Dimension(473, 538));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void form (String[] data){
        id.setText(data[0]);
        nama.setText(data[1]);
        area.setText(data[2]);
        notelepon.setText(data[3]);
        umur.setText(data[4]);
        tanggal.setText(data[5]);
        alamat.setText(data[6]);
    }
    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update master_pengantar set "
            + "idpengantar = '"+ id.getText() + "' , "
            + "nama = '"+ nama.getText() +"' ,"
            + "area = '"+ area.getText() +"' ,"
            + "no_telpon = '"+ notelepon.getText() +"' , "
            + "umur = '"+ umur.getText() +"' ,"
            + "tgl_lahir = '"+ tanggal.getText() +"' ,"
            + "alamat = '"+ alamat.getText() +" ' where idpengantar='"+ id.getText() +"'  ";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Di Update");
            this.dispose();
            Master_pengantar a  = new Master_pengantar();
            a.setVisible(true);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
           Master_pengantar a  = new Master_pengantar();
            a.setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int info = JOptionPane.showConfirmDialog(null, "Hapus Data ?");
        switch(info){
            case JOptionPane.YES_OPTION  :
            try {
                String sql = "delete from master_pengantar where idpengantar = '"+ id.getText() +"' " ;
                java.sql.Connection conn = (Connection)koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "data di hapus");
                this.dispose();
                Master_pengantar a  = new Master_pengantar();
                a.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                Master_pengantar a  = new Master_pengantar();
                a.setVisible(true);
            }
            break ;
            default :

            break ;
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Master_pengantar a  = new Master_pengantar();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(FormEditPengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditPengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditPengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditPengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditPengantar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField area;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notelepon;
    private javax.swing.JTextField tanggal;
    private javax.swing.JTextField umur;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}