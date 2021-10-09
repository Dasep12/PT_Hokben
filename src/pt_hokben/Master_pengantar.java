/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_hokben;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author dasep
 */
public class Master_pengantar extends javax.swing.JFrame {

    /**
     * Creates new form Master_pengantar
     */
    private String id ;
    public Master_pengantar() {
        initComponents();
         loadData(this.id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pengantar = new javax.swing.JTable();
        key = new javax.swing.JTextField();
        cari2 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pdf = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pengantar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        pengantar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengantarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pengantar);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(63, 85, 599, 110);

        key.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyActionPerformed(evt);
            }
        });
        getContentPane().add(key);
        key.setBounds(60, 220, 131, 40);

        cari2.setText("Cari ");
        cari2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari2ActionPerformed(evt);
            }
        });
        getContentPane().add(cari2);
        cari2.setBounds(210, 220, 55, 40);

        reset1.setText("Reset Pencarian");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });
        getContentPane().add(reset1);
        reset1.setBounds(280, 220, 111, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/plus.png"))); // NOI18N
        jButton2.setText("Tambah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 220, 100, 40);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 280, 100, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MASTER PENGANTAR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(246, 12, 192, 22);

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 140, 59, 20);

        pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PDF_24287.png"))); // NOI18N
        pdf.setText("Export PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        getContentPane().add(pdf);
        pdf.setBounds(400, 220, 150, 40);

        setSize(new java.awt.Dimension(702, 401));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void loadData(String data){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pengantar");
        model.addColumn("Nama");
        model.addColumn("Area");
        model.addColumn("No Telepon");
        model.addColumn("Umur");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Alamat");
        
        //tampilkan data makanan kedalam table 
        try {
            String sql = "" ;

            if(data == null ){
                sql = "Select * from master_pengantar   " ;
            }else {
                sql = "Select * from master_pengantar where "
                        + "idpengantar like  '%"+ data +"%' or nama like '%"+ data +"%'  "
                        + "or area like '%"+ data +"%'   "  ;                
            }
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[] {res.getString(1) ,  res.getString(2) , res.getString(3) , res.getString(4)
                , res.getString(5) , res.getString(6) , res.getString(7) } );
            }
            pengantar.setModel(model);
        }catch(Exception e){
            
        } 
    }
    private void pengantarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengantarMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        int baris           = pengantar.rowAtPoint(evt.getPoint());
        String id           = pengantar.getValueAt(baris,0).toString();
        String nama         = pengantar.getValueAt(baris,1).toString();
        String area         = pengantar.getValueAt(baris,2).toString();
        String notelepon    = pengantar.getValueAt(baris,3).toString();
        String umur         = pengantar.getValueAt(baris,4).toString();
        String tgl_lahir    = pengantar.getValueAt(baris,5).toString();
        String alamat       = pengantar.getValueAt(baris,6).toString();

        String[]  data = { id , nama , area , notelepon , umur , tgl_lahir , alamat } ;
        this.dispose();

        FormEditPengantar a = new FormEditPengantar();
        a.form(data);
        a.setVisible(true);
    }//GEN-LAST:event_pengantarMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        input_master_pengantar a = new input_master_pengantar();
        a.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void keyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_keyActionPerformed

    private void cari2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari2ActionPerformed
        // TODO add your handling code here:
        if(key.getText().equals("")){
            JOptionPane.showMessageDialog(null,"keyword kosong");
        }else {
            String data = key.getText();
            loadData(data);
        }
    }//GEN-LAST:event_cari2ActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        // TODO add your handling code here:
        String data = null ;
        loadData(data);
    }//GEN-LAST:event_reset1ActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:
        try {
            File theDir = new File("C:/BackupFile/");
                if (!theDir.exists()){
                    theDir.mkdirs();
                }
            String path = "C://BackupFile//Master Pengantar.pdf" ;
            String  sql = "select * from master_pengantar " ;
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
            Document my_pdf_report = new Document();
            PdfWriter.getInstance(my_pdf_report, new FileOutputStream(path));
            my_pdf_report.open();
            my_pdf_report.add(new Paragraph("Laporan Master Pengantar",FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLUE)));
            my_pdf_report.add(new Paragraph(new Date().toString()));
            my_pdf_report.add(new Paragraph("-------------------------------------------------------------------"
                + "--------------------------------------------------------------"));
        my_pdf_report.add(new Paragraph("\n"));
        //we have four columns in our table
        PdfPTable my_report_table = new PdfPTable(7);
        //create a cell object
        PdfPCell table_cell;
        PdfPCell table_cell2;

        table_cell2=new PdfPCell(new Phrase("ID Pengantar"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("nama"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("area"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("Telpon"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("umur"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("Tgl Lahir"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("alamat"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);

        while (res.next()) {
            String id        = res.getString("idpengantar");
            table_cell          = new PdfPCell(new Phrase(id));
            my_report_table.addCell(table_cell);

            String nama         = res.getString("nama");
            table_cell          = new PdfPCell(new Phrase(nama));
            my_report_table.addCell(table_cell);

            String area        = res.getString("area");
            table_cell          = new PdfPCell(new Phrase(area));
            my_report_table.addCell(table_cell);

            String telpon     = res.getString("no_telpon");
            table_cell          = new PdfPCell(new Phrase(telpon));
            my_report_table.addCell(table_cell);
            
            String umur     = res.getString("umur");
            table_cell          = new PdfPCell(new Phrase(umur));
            my_report_table.addCell(table_cell);
            
            String tgl_lahir     = res.getString("tgl_lahir");
            table_cell          = new PdfPCell(new Phrase(tgl_lahir));
            my_report_table.addCell(table_cell);
            
            String alamat     = res.getString("alamat");
            table_cell          = new PdfPCell(new Phrase(alamat));
            my_report_table.addCell(table_cell);

        }
        /* Attach report table to PDF */
        my_pdf_report.add(my_report_table);
        my_pdf_report.close();

        /* Close all DB related objects */
        JOptionPane.showMessageDialog(null,"Disimpan " + path);
        }catch(Exception e){

        }
    }//GEN-LAST:event_pdfActionPerformed

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
            java.util.logging.Logger.getLogger(Master_pengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_pengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_pengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_pengantar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_pengantar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField key;
    private javax.swing.JButton pdf;
    private javax.swing.JTable pengantar;
    private javax.swing.JButton reset1;
    // End of variables declaration//GEN-END:variables

   
}
