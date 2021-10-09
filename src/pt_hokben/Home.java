/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_hokben ;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import pt_hokben.Session;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        adm.setText(Session.nama);
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
        adm = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        transaksi = new javax.swing.JButton();
        makanan = new javax.swing.JButton();
        kendaraan = new javax.swing.JButton();
        pengantar = new javax.swing.JButton();
        biaya = new javax.swing.JButton();
        utilitas = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        statusPengantar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 0));
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        adm.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        adm.setForeground(new java.awt.Color(255, 255, 255));
        adm.setText("Admin");
        jPanel2.add(adm);
        adm.setBounds(310, 10, 190, 28);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PT EKA BOGA INTI");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(140, 40, 300, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delivery-guy.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(40, 10, 70, 70);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selamat Datang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(140, 10, 190, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/background-hitam-kuning.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 1170, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 0, 1030, 110);

        transaksi.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(transaksi);
        transaksi.setBounds(0, 110, 150, 40);

        makanan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        makanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/fast-food.png"))); // NOI18N
        makanan.setText("Master Makanan");
        makanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makananActionPerformed(evt);
            }
        });
        getContentPane().add(makanan);
        makanan.setBounds(270, 110, 150, 40);

        kendaraan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        kendaraan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delivery-man.png"))); // NOI18N
        kendaraan.setText("Master Kendaraan");
        kendaraan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kendaraanActionPerformed(evt);
            }
        });
        getContentPane().add(kendaraan);
        kendaraan.setBounds(410, 110, 160, 40);

        pengantar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pengantar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delivering.png"))); // NOI18N
        pengantar.setText("Master Pengantar");
        pengantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pengantarActionPerformed(evt);
            }
        });
        getContentPane().add(pengantar);
        pengantar.setBounds(550, 110, 160, 40);

        biaya.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        biaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delivering.png"))); // NOI18N
        biaya.setText("Biaya Kirim");
        biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biayaActionPerformed(evt);
            }
        });
        getContentPane().add(biaya);
        biaya.setBounds(700, 110, 141, 40);

        utilitas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        utilitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/delivery-man.png"))); // NOI18N
        utilitas.setText("Pengeluaran");
        utilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilitasActionPerformed(evt);
            }
        });
        getContentPane().add(utilitas);
        utilitas.setBounds(830, 110, 117, 40);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 530, 1040, 20);

        user.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/5202224201557740378-16.png"))); // NOI18N
        user.setText("User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(940, 110, 90, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("DELIVERY SYSTEM ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(410, 340, 620, 56);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/lg.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 210, 250, 300);

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 150, 1150, 380);

        statusPengantar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        statusPengantar.setText("Status Pemesanan");
        statusPengantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusPengantarActionPerformed(evt);
            }
        });
        getContentPane().add(statusPengantar);
        statusPengantar.setBounds(140, 110, 140, 40);

        setSize(new java.awt.Dimension(1046, 572));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        aksitrans a = new aksitrans();
        a.setVisible(true);
    }//GEN-LAST:event_transaksiActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        Master_user a = new Master_user();
        a.setVisible(true);
    }//GEN-LAST:event_userActionPerformed

    private void biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biayaActionPerformed
        // TODO add your handling code here:
        Master_biaya a = new Master_biaya();
        a.setVisible(true);
    }//GEN-LAST:event_biayaActionPerformed

    private void utilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utilitasActionPerformed
        // TODO add your handling code here:
        Master_utilitas a = new Master_utilitas();
        a.setVisible(true);
    }//GEN-LAST:event_utilitasActionPerformed

    private void kendaraanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kendaraanActionPerformed
        // TODO add your handling code here:
        Master_kendaraan a = new Master_kendaraan();
        a.setVisible(true);
    }//GEN-LAST:event_kendaraanActionPerformed

    private void pengantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pengantarActionPerformed
        // TODO add your handling code here:
        Master_pengantar a = new Master_pengantar();
        a.setVisible(true);
    }//GEN-LAST:event_pengantarActionPerformed

    private void makananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makananActionPerformed
        // TODO add your handling code here:
        Master_makanan a = new Master_makanan();
        a.setVisible(true);
    }//GEN-LAST:event_makananActionPerformed

    private void statusPengantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusPengantarActionPerformed
        // TODO add your handling code here:
        Status_pengantaran a = new Status_pengantaran();
        a.setVisible(true);
    }//GEN-LAST:event_statusPengantarActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adm;
    private javax.swing.JButton biaya;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton kendaraan;
    private javax.swing.JButton makanan;
    private javax.swing.JButton pengantar;
    private javax.swing.JButton statusPengantar;
    private javax.swing.JButton transaksi;
    private javax.swing.JButton user;
    private javax.swing.JButton utilitas;
    // End of variables declaration//GEN-END:variables
}
