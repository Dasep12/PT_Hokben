/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_hokben;
import java.sql.Connection;
import javax.swing.JOptionPane;
import pt_hokben.koneksi;
/**
 *
 * @author E6530
 */
public class input_Master_makanan extends javax.swing.JFrame {

    /**
     * Creates new form input_Master_makanan
     */
    public input_Master_makanan() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idMakanan = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        masa = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("ID makanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(36, 96, 65, 14);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nama Makanan");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(36, 141, 84, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Harga Makanan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(34, 236, 85, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Jenis Makanan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(34, 187, 81, 14);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Masa Makanan");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(34, 281, 81, 14);

        idMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMakananActionPerformed(evt);
            }
        });
        getContentPane().add(idMakanan);
        idMakanan.setBounds(155, 92, 196, 30);
        getContentPane().add(nama);
        nama.setBounds(155, 137, 196, 30);
        getContentPane().add(harga);
        harga.setBounds(155, 232, 196, 30);

        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        getContentPane().add(jenis);
        jenis.setBounds(155, 187, 196, 30);
        getContentPane().add(masa);
        masa.setBounds(155, 277, 196, 30);

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/diskette.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(155, 331, 97, 50);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Input Master Makanan");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 20, 190, 22);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/previous.png"))); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(270, 330, 70, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/fgg.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1, -14, 850, 880);

        setSize(new java.awt.Dimension(451, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void reset(){
        idMakanan.setText("");
        nama.setText("");
        jenis.setText("");
        harga.setText("");
        masa.setText("");
    }
    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if(idMakanan.getText().equals("") || nama.getText().equals("")|| jenis.getText().equals("") 
                || harga.getText().equals("") || masa.getText().equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "INSERT INTO  master_makanan ("
                        + " id_makanan , nama_makanan , jenis_makanan , harga_makanan , "
                        + " masa_makanan , kandungan_makanan ) values "
                        + "('"+ idMakanan.getText() +"' , '"+ nama.getText() +"' , '"+ jenis.getText() +"' , "
                        + "'"+ harga.getText() +"' , '"+ masa.getText() +"' , '' ) " ;
                  java.sql.Connection conn = (Connection)koneksi.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
                  reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    
    }//GEN-LAST:event_simpanActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jenisActionPerformed

    private void idMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMakananActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Master_makanan a  = new Master_makanan();
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
            java.util.logging.Logger.getLogger(input_Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(input_Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(input_Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(input_Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new input_Master_makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField idMakanan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField masa;
    private javax.swing.JTextField nama;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}
