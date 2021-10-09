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
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import pt_hokben.koneksi;
/**
 *
 * @author dasep
 */
public class Master_makanan extends javax.swing.JFrame {

    /**
     * Creates new form Master_makanan
     */
    private String id ;
    public Master_makanan() {
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

        key = new javax.swing.JTextField();
        cari1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        makanan = new javax.swing.JTable();
        tambah = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        export = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Import = new javax.swing.JButton();
        export1 = new javax.swing.JButton();

        cari1.setText("Cari ");

        reset.setText("Reset Pencarian");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        makanan.setModel(new javax.swing.table.DefaultTableModel(
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
        makanan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                makananMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(makanan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 70, 593, 146);

        tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/plus.png"))); // NOI18N
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        getContentPane().add(tambah);
        tambah.setBounds(552, 230, 110, 40);

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(550, 280, 110, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("MASTER MAKANAN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 20, 240, 20);

        export.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Microsoft_Excel-01_25074.png"))); // NOI18N
        export.setText("Export Excel");
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        getContentPane().add(export);
        export.setBounds(390, 230, 150, 40);

        pdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/PDF_24287.png"))); // NOI18N
        pdf.setText("Export PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });
        getContentPane().add(pdf);
        pdf.setBounds(390, 280, 150, 40);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Import.setText("Upload Data");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        jPanel1.add(Import, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 40));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 720, 440);

        export1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/Microsoft_Excel-01_25074.png"))); // NOI18N
        export1.setText("Export Excel");
        export1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                export1ActionPerformed(evt);
            }
        });
        getContentPane().add(export1);
        export1.setBounds(390, 230, 150, 40);

        setSize(new java.awt.Dimension(728, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void makananMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_makananMouseClicked
        // TODO add your handling code here:
        int baris           = makanan.rowAtPoint(evt.getPoint());
        String id           = makanan.getValueAt(baris,0).toString();
        String nama         = makanan.getValueAt(baris,1).toString();
        String jenis        = makanan.getValueAt(baris,2).toString();
        String harga        = makanan.getValueAt(baris,3).toString();
        String masa         = makanan.getValueAt(baris,4).toString();
        
        String[]  data = { id , nama , jenis , harga , masa  } ;
        this.dispose();
        
        FormEditMakanan a = new FormEditMakanan();
        a.form(data);
        a.setVisible(true);
    }//GEN-LAST:event_makananMouseClicked

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        this.dispose();
        input_Master_makanan a = new input_Master_makanan();
        a.setVisible(true);
    }//GEN-LAST:event_tambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        // TODO add your handling code here:
        try {

            /*Nama file excell*/
            File theDir = new File("C:/BackupFile/");
                if (!theDir.exists()){
                    theDir.mkdirs();
                }
            String filename = "C:/BackupFile/Report Makanan.xls" ;
            HSSFWorkbook workbook = new HSSFWorkbook();

            /*menentukan sheet*/
            HSSFSheet sheet = workbook.createSheet("FirstSheet");
            try {
                String  sql = "select * from master_makanan " ;
                int i =  1 ;
                java.sql.Connection conn = (Connection)koneksi.configDB();
                java.sql.Statement stm = conn.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                HSSFRow rowhead = sheet.createRow((short)0);  /*index row 0*/
                rowhead.createCell(0).setCellValue("No");  /*column 0*/
                rowhead.createCell(1).setCellValue("Nama Makanan");  /*column 1*/
                rowhead.createCell(2).setCellValue("Jenis Makanan");  /*column 1*/
                rowhead.createCell(3).setCellValue("Harga Makanan");  /*column 2*/
                rowhead.createCell(4).setCellValue("Masa Makanan");  /*column 2*/
                while(res.next()){
                    HSSFRow row   = sheet.createRow((short)i);   /*index row 1*/
                    row.createCell(0).setCellValue(i);  /*column 0*/
                    row.createCell(1).setCellValue(res.getString(2));  /* column  1*/
                    row.createCell(2).setCellValue(res.getString(3));  /* column 2*/
                    row.createCell(3).setCellValue(res.getString(4));  /* column 2*/
                    row.createCell(4).setCellValue(res.getString(5));  /* column 2*/
                    i++ ;
                }
            }catch(Exception e){

            }
            FileOutputStream fileOut = new FileOutputStream(filename);

            /*menulis file*/
            workbook.write(fileOut);

            /*menutup koneksi*/
            fileOut.close();
            JOptionPane.showMessageDialog(null, "Berhasil di export di C:/ReportMakanan.xls");
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_exportActionPerformed

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed
        // TODO add your handling code here:
        try {
            File theDir = new File("C:/BackupFile/");
                if (!theDir.exists()){
                    theDir.mkdirs();
                }
                String path = "C://BackupFile//Master Makanan.pdf" ;
            String  sql = "select * from master_makanan " ;
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
        Document my_pdf_report = new Document();
        PdfWriter.getInstance(my_pdf_report, new FileOutputStream(path));
        my_pdf_report.open();            
        my_pdf_report.add(new Paragraph("Laporan Master Makanan",FontFactory.getFont(FontFactory.TIMES_BOLD, 18, Font.BOLD, BaseColor.BLUE)));
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
        JOptionPane.showMessageDialog(null,"Disimpan "+ path);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_pdfActionPerformed

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser() ;
        int response = fileChooser.showOpenDialog(null);
        if(response == JFileChooser.APPROVE_OPTION){
            File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
            //System.out.print(file);
            //path.setText("" + file + "" );
            try {
                POIFSFileSystem fs = new POIFSFileSystem(file);
                HSSFWorkbook wb = new HSSFWorkbook(fs);
                HSSFSheet sheet = wb.getSheetAt(0);
                Row row;
                for(int i=1; i<=sheet.getLastRowNum(); i++){
                    row = sheet.getRow(i);
                    String idMakanan = row.getCell(0).getStringCellValue() ;
                    String namaMakanan = row.getCell(1).getStringCellValue() ;
                    String jenisMakanan = row.getCell(2).getStringCellValue() ;
                    String hargaMakanan = row.getCell(3).getStringCellValue() ;
                    String masaMakanan = row.getCell(4).getStringCellValue() ;

                    String sql = "INSERT INTO  master_makanan ("
                    + " id_makanan , nama_makanan , jenis_makanan , harga_makanan , "
                    + " masa_makanan , kandungan_makanan ) values "
                    + "('"+ idMakanan +"' , '"+ namaMakanan +"' , '"+ jenisMakanan +"' , "
                    + "'"+ hargaMakanan +"' , '"+ masaMakanan +"' , '' ) " ;
                    java.sql.Connection conn = (java.sql.Connection)koneksi.configDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                }
                JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
                String key = "" ;
                loadData(key);
                // reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_ImportActionPerformed

    private void export1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_export1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_export1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void loadData(String data){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Makanan");
        model.addColumn("Nama Makanan");
        model.addColumn("Jenis Makanan");
        model.addColumn("Harga Makanan");
        model.addColumn("Masa Makanan");
        
        //tampilkan data makanan kedalam table 
        try {
            String sql = "" ;

            if(data == null ){
                sql = "Select * from master_makanan order by id_makanan asc  " ;
            }else {
                sql = "Select * from master_makanan where "
                        + "nama_makanan like  '%"+ data +"%' or jenis_makanan like '%"+ data +"'   "  ;                
            }
            java.sql.Connection conn = (Connection)koneksi.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                model.addRow(new Object[] {res.getString(1) ,  res.getString(2) , res.getString(3) , res.getString(4)
                , res.getString(5) } );
            }
            makanan.setModel(model);
        }catch(Exception e){
            
        } 
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
            java.util.logging.Logger.getLogger(Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_makanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_makanan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Import;
    private javax.swing.JButton cari1;
    private javax.swing.JButton export;
    private javax.swing.JButton export1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JTable makanan;
    private javax.swing.JButton pdf;
    private javax.swing.JButton reset;
    private javax.swing.JButton tambah;
    // End of variables declaration//GEN-END:variables
}
