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
public class FormEditAkun extends javax.swing.JFrame {

    /**
     * Creates new form FormEditPengantar
     */
    public FormEditAkun() {
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
        password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("ID User");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 70, 75, 20);
        getContentPane().add(id);
        id.setBounds(160, 70, 231, 30);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 75, 20);
        getContentPane().add(nama);
        nama.setBounds(160, 110, 231, 30);
        getContentPane().add(password);
        password.setBounds(160, 150, 231, 30);

        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 150, 75, 20);

        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/updated.png"))); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(70, 220, 100, 40);

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delete.png"))); // NOI18N
        delete.setText("Hapus");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(200, 220, 90, 40);

        back.setText("Kembali");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(320, 220, 80, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Edit Data User");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 20, 130, 17);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/FRM.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -10, 480, 310);

        setSize(new java.awt.Dimension(473, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public void form (String[] data){
        id.setText(data[0]);
        nama.setText(data[1]);
        password.setText(data[2]);
    }
    
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "update akun set "
            + "nama = '"+ nama.getText() +"' ,"
            + "password = '"+ password.getText() +"'   where id ='"+ id.getText() +"'  ";
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Data Di Update");
            this.dispose();
            Master_akun a  = new Master_akun();
            a.setVisible(true);
        }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
            Master_akun a  = new Master_akun();
            a.setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int info = JOptionPane.showConfirmDialog(null, "Hapus Data ?");
        switch(info){
            case JOptionPane.YES_OPTION  :
            try {
                String sql = "delete from akun where id = '"+ id.getText() +"' " ;
                java.sql.Connection conn = (Connection)koneksi.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "data di hapus");
                this.dispose();
                Master_akun a  = new Master_akun();
                a.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                Master_akun a  = new Master_akun();
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
        Master_akun a  = new Master_akun();
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
            java.util.logging.Logger.getLogger(FormEditAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormEditAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormEditAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormEditAkun.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormEditAkun().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField password;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
