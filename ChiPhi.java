/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanh.Model;

/**
 *
 * @author Do Chi Thanh
 */
public class ChiPhi {
    private String ten; 
    private String loaiChiPhi;
    private int ngayChiPhi, namChiPhi, thangChiPhi;
    private double soTien;
    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoaiChiPhi() {
        return loaiChiPhi;
    }

    public void setLoaiChiPhi(String loaiChiPhi) {
        this.loaiChiPhi = loaiChiPhi;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public int getNgayChiPhi() {
        return ngayChiPhi;
    }

    public void setNgayChiPhi(int ngayChiPhi) {
        this.ngayChiPhi = ngayChiPhi;
    }

    public int getNamChiPhi() {
        return namChiPhi;
    }

    public void setNamChiPhi(int namChiPhi) {
        this.namChiPhi = namChiPhi;
    }

    public int getThangChiPhi() {
        return thangChiPhi;
    }

    public void setThangChiPhi(int thangChiPhi) {
        this.thangChiPhi = thangChiPhi;
    }
    
    public ChiPhi(){
        this.ten = null;
        this.loaiChiPhi = null;
        this.ngayChiPhi = 0;
        this.namChiPhi = 0;
        this.thangChiPhi = 0;
    }
    
    public ChiPhi(String ten, String loaiChiPhi, double soTien, ThoiGian thoiGian){
        this.ten = ten;
        this.loaiChiPhi = loaiChiPhi;
        this.ngayChiPhi = thoiGian.getNgay();
        this.thangChiPhi = thoiGian.getThang();
        this.namChiPhi = thoiGian.getNam();
        this.soTien = soTien;
    }

}


