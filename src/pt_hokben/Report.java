/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt_hokben;

/**
 *
 * @author Adm-004
 */
import java.io.FileOutputStream;
import java.sql.Connection;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 *
 * @author okin
 */
public class Report {

    /**
     * @param args the command line arguments
     */
    public static void main(String[]args) {
        try {

        /*Nama file excell*/
            String filename = "C:/ReportMakanan.xls" ;
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
            while(res.next()){
                    HSSFRow row   = sheet.createRow((short)i);   /*index row 1*/
                    row.createCell(0).setCellValue(i);  /*column 0*/
                    row.createCell(1).setCellValue(res.getString(2));  /* column  1*/
                    row.createCell(2).setCellValue(res.getString(3));  /* column 2*/
                i++ ;
            }
        }catch(Exception e){
            
        }
            


//                   
//            HSSFRow row2 = sheet.createRow((short)2);   /*index row 2*/
//                    row2.createCell(0).setCellValue("2"); /*column 0*/
//                    row2.createCell(1).setCellValue("Ayrini"); /* column  1*/
//                    row2.createCell(2).setCellValue("Indonesia"); /* column 2*/

            FileOutputStream fileOut = new FileOutputStream(filename);

/*menulis file*/
            workbook.write(fileOut);

/*menutup koneksi*/
            fileOut.close();
               JOptionPane.showMessageDialog(null, "Berhasil di export di C:/ReportMakanan.xls");
        } catch ( Exception ex ) {
            System.out.println(ex);
        }
    }
}
