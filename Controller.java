/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long;

import thanh.Model.*;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPTable;
import java.io.*;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.Calendar;
import java.util.Map;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class Controller {

    public static class MyJTable {

        private Connection connect = null;
        private DefaultTableModel tableModel = new DefaultTableModel();
        static String[] string;
        static int number;
        // hàm tiềm kiếm trong csdl và chèn vào table

        public MyJTable(String[] xau, int id, int soluong, javax.swing.JTable bang, int num, Map<Integer, DiaPhim> diaphim, Map<Integer, DiaNhac> dianhac,Map<Integer, Sach> sach) 
        {
            string = xau;// tên của các cột tiêu đề của table
            number = num; // số lượng cột của table
            tableModel.setColumnIdentifiers(string);
            bang.setModel(tableModel);
            if (diaphim.containsKey(id)) {
                DiaPhim obj = diaphim.get(id);
                updateData(String.valueOf(obj.getId()), obj.getTen(), obj.getGiaBan(), Integer.valueOf(soluong));
            }
            else if (dianhac.containsKey(id)) {
                DiaNhac obj = dianhac.get(id);
                updateData(String.valueOf(obj.getId()), obj.getTen(), obj.getGiaBan(), Integer.valueOf(soluong));
            }
            else if (sach.containsKey(id)) {
                Sach obj = sach.get(id);
                updateData(String.valueOf(obj.getId()), obj.getTen(), obj.getGiaBan(), Integer.valueOf(soluong));
            }
        }

        public void updateData(String id, String ten, double gia, int soluong) {// hàm đưa thông tin tìm kiếm được trên csdl vào bảng 
            // result là biến được hàm view trả về, định dạng là 1 map 
            String[] colsName = this.string;
            tableModel.setColumnIdentifiers(colsName);

            String rows[] = new String[number];
            rows[0] = id;
            rows[1] = ten;
            rows[2] = String.valueOf(gia);
            rows[3] = String.valueOf(soluong);
            rows[4] = String.valueOf(gia * soluong);

            tableModel.addRow(rows); // chèn cái hàng vừa tìm đc vào bảng

        }

    }

    // hàm này dùng để tính tổng tiền tất cả của hóa đơn
    public int tinhtongtien(int[] A, int[] B, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + A[i] * B[i];
        }
        return sum;
    }

    // hàm này dùng để thêm một sản phảm vào table hóa đơn
    public static void addToBill(String id, String soluong, javax.swing.JTable table, Map<Integer, DiaPhim> diaphim, Map<Integer, DiaNhac> dianhac,Map<Integer, Sach> sach) {
  
        String[] colsName = {"ID san pham", "Ten san pham", "Don gia", "So luong", "Thanh tien"}; // tên của các cột trong table
      //  new MyJTable(colsName, Integer.valueOf(id), Integer.valueOf(soluong), table, 5, diaphim); 

    }

    // hàm xóa 1 hàng trong table
    public static void deletesp(javax.swing.JTable myTable) {
        // TODO add your handling code here:
        ((DefaultTableModel) myTable.getModel()).removeRow(myTable.getSelectedRow());
    }

    // hàm xuất hóa đơn thành pdf
    public static void exportBill(javax.swing.JTable myTable, JFileChooser chooser,String tongtien) {
        try {
            Document document = new Document(); // tạo mới một document pdf
            File file = chooser.getSelectedFile(); // file là vị trí lưu file đã được chọn ở dailog
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(file + ".pdf"));

                document.open(); 

                try {

                    Font f = new Font(BaseFont.createFont("C:/Windows/Fonts/Tahoma.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                    f.setStyle(Font.BOLD);

                    Font f1 = new Font(BaseFont.createFont("C:/Windows/Fonts/Tahoma.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED));
                    f1.setStyle(Font.BOLD);
                    f1.setSize(20);

                    Paragraph paragraph1 = new Paragraph("MEDIA ONE", f1);
                    paragraph1.setAlignment(Element.ALIGN_CENTER);
                    document.add(paragraph1);

                    Paragraph paragraph2 = new Paragraph("Hóa đơn thanh toán", f1);
                    paragraph2.setAlignment(Element.ALIGN_CENTER);
                    document.add(paragraph2);

                    Paragraph paragraph9 = new Paragraph(" ", f1);
                    paragraph9.setAlignment(Element.ALIGN_CENTER);
                    document.add(paragraph9);

                    //Paragraph paragraph = new Paragraph("Tìm kiếm sách",f1);
                    //paragraph.setAlignment(Element.ALIGN_CENTER);
                    //document.add(paragraph);
                    PdfPTable t = new PdfPTable(5); // tạo mới 1 bảng trong pdf
                    t.setSpacingBefore(50);
                    t.setSpacingAfter(50);
                    t.setWidthPercentage(100);
                    t.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);

                    PdfPCell j1 = new PdfPCell(new Phrase("ID ", f));
                    j1.setBackgroundColor(BaseColor.GREEN);
                    j1.setHorizontalAlignment(Element.ALIGN_CENTER);
                    t.addCell(j1);

                    PdfPCell j2 = new PdfPCell(new Phrase("Tên sản phẩm", f));
                    j2.setBackgroundColor(BaseColor.GREEN);
                    j2.setHorizontalAlignment(Element.ALIGN_CENTER);
                    t.addCell(j2);

                    PdfPCell j3 = new PdfPCell(new Phrase("Đơn giá", f));
                    j3.setBackgroundColor(BaseColor.GREEN);
                    j3.setHorizontalAlignment(Element.ALIGN_CENTER);
                    t.addCell(j3);

                    PdfPCell j4 = new PdfPCell(new Phrase("Số lượng", f));
                    j4.setBackgroundColor(BaseColor.GREEN);
                    j4.setHorizontalAlignment(Element.ALIGN_CENTER);
                    t.addCell(j4);

                    PdfPCell j5 = new PdfPCell(new Phrase("Thành tiền", f));
                    j5.setBackgroundColor(BaseColor.GREEN);
                    j5.setHorizontalAlignment(Element.ALIGN_CENTER);
                    t.addCell(j5);

                    int n = myTable.getRowCount(); // đếm số lượng hàng của bảng hóa đơn
                    System.out.print(n);

                    int q;
                    for (int j = 0; j < n; j++) {
                        for (q = 0; q < 5; q++) {
                            t.addCell(myTable.getValueAt(j, q).toString());
                        }
                    }

                    document.add(t);
                    Calendar c = Calendar.getInstance(); // hàm lấy thời gian hiện tại của hệ thống
                    int year = c.get(Calendar.YEAR);
                    int month = c.get(Calendar.MONTH) + 1;
                    int day = c.get(Calendar.DAY_OF_MONTH);

                    Paragraph paragraph10 = new Paragraph("Tổng tiền:  "+tongtien, f);
                    paragraph10.setAlignment(Element.ALIGN_LEFT);
                    document.add(paragraph10);
                    
                    Paragraph paragraph3 = new Paragraph("Ngày " + day + " tháng " + month + " năm " + year, f);
                    paragraph3.setAlignment(Element.ALIGN_RIGHT);
                    document.add(paragraph3);

                    Paragraph paragraph4 = new Paragraph("Người lập bảng      ", f);
                    paragraph4.setAlignment(Element.ALIGN_RIGHT);
                    document.add(paragraph4);

                    Paragraph paragraph6 = new Paragraph(" ", f1);
                    paragraph6.setAlignment(Element.ALIGN_CENTER);
                    document.add(paragraph6);

                    Paragraph paragraph5 = new Paragraph("   ", f);
                    paragraph5.setAlignment(Element.ALIGN_RIGHT);
                    document.add(paragraph5);

                } catch (IOException ex) {
                    
                }
                document.close(); 

            } catch (DocumentException ex) {
                
            }
            document.open();

        } catch (FileNotFoundException ex) {
            //Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
