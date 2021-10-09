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
import java.io.FileOutputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/**
 *
 * @author dasep
 */
public class Laporan_pengeluaran extends javax.swing.JFrame {

     private String id ;
    /** Creates new form Laporan */
    public Laporan_pengeluaran() {
        initComponents();
        loadPesanan(this.id);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        laporan = new javax.swing.JTable();
        key = new javax.swing.JTextField();
        reset = new javax.swing.JButton();
        cari1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        export = new javax.swing.JButton();
        pdf = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/hj.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(null);

        laporan.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(laporan);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(19, 83, 680, 109);
        jPanel1.add(key);
        key.setBounds(20, 210, 131, 40);

        reset.setText("Reset Pencarian");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(270, 210, 124, 40);

        cari1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/CR.png"))); // NOI18N
        cari1.setText("Cari ");
        cari1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cari1ActionPerformed(evt);
            }
        });
        jPanel1.add(cari1);
        cari1.setBounds(160, 210, 90, 40);

        back.setText("Home");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(590, 210, 110, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LAPORAN PENGELUARAN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(207, 20, 260, 22);

        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Microsoft_Excel-01_25074.png"))); // NOI18N
        export.setText("Export Excel");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        jPanel1.add(export);
        export.setBounds(420, 210, 150, 40);

        pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PDF_24287.png"))); // NOI18N
        pdf.setText("Export PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        jPanel1.add(pdf);
        pdf.setBounds(420, 260, 150, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(737, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        String data = null ;
        loadPesanan(data);
    }//GEN-LAST:event_resetActionPerformed

    private void cari1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cari1ActionPerformed
        // TODO add your handling code here:
        if(key.getText().equals("")){
            JOptionPane.showMessageDialog(null,"keyword kosong");
        }else {
            String data = key.getText();
            loadPesanan(data);
        }
    }//GEN-LAST:event_cari1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        try {

            /*Nama file excell*/
            String filename = "D:/LaporanPengeluaran.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();

            /*menentukan sheet*/
            HSSFSheet sheet = workbook.createSheet("FirstSheet");
            try {
                String  sql = "select * from form_utilitas " ;
                int i =  1 ;
                java.sql.Connection conn = (Connection)koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                HSSFRow rowhead = sheet.createRow((short)0);  /*index row 0*/
                rowhead.createCell(0).setCellValue("No");  /*column 0*/
                rowhead.createCell(1).setCellValue("Merek Kendaraan");  /*column 1*/
                rowhead.createCell(2).setCellValue("Bahan Bakar");  /*column 2*/
                rowhead.createCell(3).setCellValue("Biaya Operasional");  /*column 2*/
                rowhead.createCell(4).setCellValue("Tanggal");  /*column 2*/
                rowhead.createCell(5).setCellValue("Keterangan");  /*column 2*/
                while(res.next()){
                    HSSFRow row   = sheet.createRow((short)i);   /*index row 1*/
                    row.createCell(0).setCellValue(i);  /*column 0*/
                    row.createCell(1).setCellValue(res.getString(2));  /* column  1*/
                    row.createCell(2).setCellValue(res.getString(3));  /* column 2*/
                    row.createCell(3).setCellValue(res.getString(4));  /* column 2*/
                    row.createCell(4).setCellValue(res.getString(5));  /* column 2*/
                    row.createCell(5).setCellValue(res.getString(6));  /* column 2*/
                    i++ ;
                }
            }catch(Exception e){

            }
            FileOutputStream fileOut = new FileOutputStream(filename);

            /*menulis file*/
            workbook.write(fileOut);

            /*menutup koneksi*/
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Berhasil di export di " + filename);
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_exportActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:
        try {
            String  sql = "select * from master_makanan " ;
            String path = "C://PengeluaranReport.pdf" ;
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
        Document my_pdf_report = new Document();
        PdfWriter.getInstance(my_pdf_report, new FileOutputStream(path));
        my_pdf_report.open();            
        my_pdf_report.add(new Paragraph("Laporan Utilitas",FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLUE)));
        my_pdf_report.add(new Paragraph(new Date().toString()));
        my_pdf_report.add(new Paragraph("-------------------------------------------------------------------"
                + "--------------------------------------------------------------"));
        my_pdf_report.add(new Paragraph("\n"));
        //we have four columns in our table
        PdfPTable my_report_table = new PdfPTable(4);
        //create a cell object
        PdfPCell table_cell;
        PdfPCell table_cell2;
        
        
        table_cell2=new PdfPCell(new Phrase("Nama Makanan"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("Jenis"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("Harga"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);
        table_cell2=new PdfPCell(new Phrase("Masa"));
        table_cell2.setBackgroundColor(BaseColor.CYAN);
        my_report_table.addCell(table_cell2);

        
        while (res.next()) {                
            String kode         = res.getString("nama_makanan");
            table_cell          = new PdfPCell(new Phrase(kode));
            my_report_table.addCell(table_cell);
            
            String merk         = res.getString("jenis_makanan");
            table_cell          = new PdfPCell(new Phrase(merk));
            my_report_table.addCell(table_cell);
            
            String jenis        = res.getString("harga_makanan");
            table_cell          = new PdfPCell(new Phrase(jenis));
            my_report_table.addCell(table_cell);
            
            String nopolisi     = res.getString("masa_makanan");
            table_cell          = new PdfPCell(new Phrase(nopolisi));
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
            java.util.logging.Logger.getLogger(Laporan_pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan_pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan_pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan_pengeluaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan_pengeluaran().setVisible(true);
            }
        });
    }
    
    public void loadPesanan(String data){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pesanan");
        model.addColumn("Merk Kendaraan");
        model.addColumn("Bahan Bakar");
        model.addColumn("Biaya Operasional");
        model.addColumn("Keterangan");
        
        //tampilkan data pesanan kedalam table 
        try {
            String sql = "" ;

            if(data == null ){
                sql = "select * from form_utilitas " ;
            }else {
                sql = "Select * from form_utilitas where "
                        + "tanggal like '%"+ data +"%'  "  ;                
            }
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[] {res.getString(1) ,  res.getString(2) , res.getString(3) , res.getString(4)
                , res.getString(5)} );
            }
            laporan.setModel(model);
        }catch(Exception e){
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cari1;
    private javax.swing.JButton export;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JTable laporan;
    private javax.swing.JButton pdf;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables

}