/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Long;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import thanh.Model.DiaNhac;
import thanh.Model.DiaPhim;
import thanh.Model.Sach;
import thanh.Model.SanPham;
import tuan.IO.IO;

/**
 *
 * @author admin
 */

public class SaleGuys extends javax.swing.JFrame {

//    public static Map<Integer, DiaNhac> dianhac = new HashMap();
//    public static Map<Integer, DiaPhim> diaphim = new HashMap();
//    public static Map<Integer, Sach> sach = new HashMap();
    public static Map<Integer, SanPham> sanPham = new HashMap();
    DefaultTableModel tableModel = new DefaultTableModel();
    String[] colsName = {"ID san pham", "Ten san pham", "Don gia","So luong","Thanh tien"};

    /**
     * Creates new form SaleGuys
     */
    public SaleGuys() {
        initComponents();
        nhap();
        tableModel.setColumnIdentifiers(colsName);
        hoadon.setModel(tableModel);
        setVisible(true);
        setResizable(false);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(320, 60);
    }



    public void tinhTien() {
        hoadon.getRowCount();
        Double tong = 0.0;
        for (int i = 0; i < hoadon.getRowCount(); i++) {
            Object s = hoadon.getValueAt(i, 4);
            String s1 = String.valueOf(s);
            tong = tong + Double.parseDouble(s1);
        }
        tongtien.setText(String.valueOf(tong));

    }

//    public static void nhapPhim() {
//        // hàm nhập dừ liệu phim từ file
//        
//        try {
//            FileInputStream file = new FileInputStream("C:\\Users\\Do Chi Thanh\\Documents\\NetBeansProjects\\LongFINAL\\LongFINAL\\database_diaphim.txt"); // duong dan file phim
//            DataInputStream dataFile = new DataInputStream(file);
//            String temp = dataFile.readLine();
//            while (temp != null) {
//                DiaPhim obj = new DiaPhim();
//                obj.setTen(dataFile.readLine());
//                obj.setId(Integer.valueOf(dataFile.readLine()));
//                obj.setTheLoai(dataFile.readLine());
//                obj.setNam(Integer.valueOf(dataFile.readLine()));
//                obj.setGiaMua(Double.valueOf(dataFile.readLine()));
//                obj.setGiaBan(Double.valueOf(dataFile.readLine()));
//                obj.setSoLuong(Integer.valueOf(dataFile.readLine()));
//                obj.setDaoDien(dataFile.readLine());
//                obj.setDienVien(dataFile.readLine());
//                obj.setDinhDang(dataFile.readLine());
//                diaphim.put(obj.getId(), obj);// dia nhạc thì lưu vào dianhac, sách lưu vào sach
//                temp = dataFile.readLine();
//
//            }
//            file.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
//    public static void nhapNhac() {
//        try {
//            FileInputStream file = new FileInputStream("C:\\Users\\Do Chi Thanh\\Documents\\NetBeansProjects\\LongFINAL\\LongFINAL\\database_dianhac.txt"); //duong dan file nhac
//            DataInputStream dataFile = new DataInputStream(file);
//            String temp = dataFile.readLine();
//            while (temp != null) {
//                DiaNhac obj = new DiaNhac();
//                obj.setTen(dataFile.readLine());
//                obj.setId(Integer.valueOf(dataFile.readLine()));
//                obj.setTheLoai(dataFile.readLine());
//                obj.setNam(Integer.valueOf(dataFile.readLine()));
//                obj.setGiaMua(Double.valueOf(dataFile.readLine()));
//                obj.setGiaBan(Double.valueOf(dataFile.readLine()));
//                obj.setSoLuong(Integer.valueOf(dataFile.readLine()));
//                obj.setCaSi(dataFile.readLine());
//                obj.setSoBaiHat(Integer.valueOf(dataFile.readLine()));
//                obj.setDinhDang(dataFile.readLine());
//                dianhac.put(obj.getId(), obj);
//                temp = dataFile.readLine();
//
//            }
//            file.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
//    public static void nhapSach() {
//        try {
//            FileInputStream file = new FileInputStream("C:\\Users\\Do Chi Thanh\\Documents\\NetBeansProjects\\LongFINAL\\LongFINAL\\database_sach.txt"); //duong dan file sach
//            DataInputStream dataFile = new DataInputStream(file);
//            String temp = dataFile.readLine();
//            while (temp != null) {
//                Sach obj = new Sach();
//                //String ten, int id, String theLoai, int nam, double giaMua, double giaBan
//                //  int soLuong, String tacGia, int soTrang
//                obj.setTen(dataFile.readLine());
//                obj.setId(Integer.valueOf(dataFile.readLine()));
//                obj.setTheLoai(dataFile.readLine());
//                obj.setNam(Integer.valueOf(dataFile.readLine()));
//                obj.setGiaMua(Double.valueOf(dataFile.readLine()));
//                obj.setGiaBan(Double.valueOf(dataFile.readLine()));
//                obj.setSoLuong(Integer.valueOf(dataFile.readLine()));
//                obj.setTacGia (dataFile.readLine());
//                obj.setSoTrang(Integer.valueOf(dataFile.readLine()));
//                sach.put(obj.getId(), obj);
//                temp = dataFile.readLine();
//
//            }
//            file.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
//    
    public void nhap(){
            IO io = new IO();

            ArrayList<thanh.Model.SanPham> listSanPham = new ArrayList<thanh.Model.SanPham>();
            
            try {
                listSanPham = (ArrayList<thanh.Model.SanPham>) io.ReadFile("Data.txt");
            } catch (Exception ex) {
                Logger.getLogger(thanh.Control.Test.class.getName()).log(Level.SEVERE, null, ex);
            }
        
//            SanPham sp = new SanPham();
            int i=0;
            while(i<listSanPham.size()){
                SanPham sp = listSanPham.get(i);
                sanPham.put(sp.getId(), sp);
                i++;
            }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idfield = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        Printbill = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        hoadon = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numberfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tongtien = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idfieldActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Printbill.setText("In");
        Printbill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintbillActionPerformed(evt);
            }
        });

        hoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên", "Đơn giá", "Số lượng", "thành tiền"
            }
        ));
        jScrollPane2.setViewportView(hoadon);

        jLabel1.setText("Mã ID");

        jLabel2.setText("Số lượng");

        numberfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberfieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Tổng tiền cần thanh toán:");

        tongtien.setText("                                                                           ");

        jButton1.setText("Xóa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        edit.setText("Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addComponent(tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(numberfield, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edit)
                            .addComponent(Printbill, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Printbill, edit, jButton1});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numberfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(idfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(Printbill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Printbill, edit, jButton1});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {idfield, jButton2, jLabel1, jLabel2, numberfield});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idfieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SanPham obj = new SanPham();
        String idField=null;
        try{
            idField = idfield.getText();
            
            if (sanPham.containsKey(Integer.valueOf(idField ))) {
                obj=new DiaPhim();
                obj = sanPham.get(Integer.valueOf(idField ));
                String rows[] = new String[5];
                rows[0] = String.valueOf(obj.getId());
                rows[1] = String.valueOf(obj.getTen());
                rows[2] = String.valueOf(obj.getGiaBan());
                rows[3] = numberfield.getText();
                rows[4] = String.valueOf(obj.getGiaBan() * Integer.valueOf(numberfield.getText()));
                DefaultTableModel model = (DefaultTableModel) hoadon.getModel();
                model.addRow(rows);
                tinhTien();
            }
            else if (sanPham.containsKey(Integer.valueOf(idField))) {
                obj=new DiaNhac();
                obj = sanPham.get(Integer.valueOf(idField ));
                String rows[] = new String[5];
                rows[0] = String.valueOf(obj.getId());
                rows[1] = String.valueOf(obj.getTen());
                rows[2] = String.valueOf(obj.getGiaBan());
                rows[3] = numberfield.getText();
                rows[4] = String.valueOf(obj.getGiaBan() * Integer.valueOf(numberfield.getText()));
                DefaultTableModel model = (DefaultTableModel) hoadon.getModel();
                model.addRow(rows);
                tinhTien();
            }
            else if (sanPham.containsKey(Integer.valueOf(idField ))) {
                obj=new Sach();
                obj = sanPham.get(Integer.valueOf(idField ));
                String rows[] = new String[5];
                rows[0] = String.valueOf(obj.getId());
                rows[1] = String.valueOf(obj.getTen());
                rows[2] = String.valueOf(obj.getGiaBan());
                rows[3] = numberfield.getText();
                rows[4] = String.valueOf(obj.getGiaBan() * Integer.valueOf(numberfield.getText()));
                DefaultTableModel model = (DefaultTableModel) hoadon.getModel();
                model.addRow(rows);
                tinhTien();
            }
            else {
                JOptionPane.showMessageDialog(null, "Khong co san pham trong co so du lieu!");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Nhap sai , vui long nhap lai");   
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void numberfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberfieldActionPerformed

    private void PrintbillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintbillActionPerformed
        // TODO add your handling code here
        JFileChooser chooser = new JFileChooser(); // gọi lên dailog chọn vị trí lưu file
        int i = chooser.showSaveDialog(this); // làm hiện dailog save
        if (i == JFileChooser.APPROVE_OPTION) { // nếu vị trí đã được chọn
            Controller.exportBill(hoadon, chooser,tongtien.getText());
        }
    }//GEN-LAST:event_PrintbillActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (hoadon.getSelectedRowCount() > 0) {

            int realIndex = hoadon.convertRowIndexToModel(hoadon.getSelectedRow());

            ((DefaultTableModel) hoadon.getModel()).removeRow(realIndex);

            hoadon.repaint();
            tinhTien();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) hoadon.getModel();
        int soluong=hoadon.getRowCount();
        if(soluong>0){
            for (int i=0;i<soluong;i++){
                double gia=Double.valueOf(String.valueOf(model.getValueAt(i, 2)));
                double num=Double.valueOf(String.valueOf(model.getValueAt(i, 3)));
                model.setValueAt(num*gia, i, 4);
                hoadon.repaint();
                tinhTien();
            }
        
        }
    }//GEN-LAST:event_editActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleGuys();
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Printbill;
    private javax.swing.JButton edit;
    private javax.swing.JTable hoadon;
    private javax.swing.JTextField idfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numberfield;
    private javax.swing.JLabel tongtien;
    // End of variables declaration//GEN-END:variables
}
