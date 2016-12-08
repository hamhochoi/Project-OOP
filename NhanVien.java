package thanh.Model;

import java.util.ArrayList;

/**
 * Created by hamhochoi on 24/10/2016.
 */
public class NhanVien {

    private String ten;
    private double heSoLuong;
    private final double LUONG_CO_BAN = 3000000;
    
    public NhanVien(){
        this.ten = null;
        this.heSoLuong = 0;
    }
    
    public NhanVien(String ten, double heSoLuong){
        this.ten = ten;
        this.heSoLuong = heSoLuong;
    }
    
    ArrayList<NhanVien> nhanVien = new ArrayList<NhanVien>();
    
    public ArrayList<NhanVien> add(){
        nhanVien.add(new NhanVien("Nguyen Van A", 1.5));
        nhanVien.add(new NhanVien("Nguyen Van B", 2.5));
        nhanVien.add(new NhanVien("Nguyen Van C", 3.5));
        nhanVien.add(new NhanVien("Nguyen Van D", 1.5));
        nhanVien.add(new NhanVien("Nguyen Van E", 2.5));
        nhanVien.add(new NhanVien("Nguyen Van F", 1.5));
        nhanVien.add(new NhanVien("Nguyen Van G", 3.5));
        
        return nhanVien;
    }
    
    public double getHeSoLuong() {
        return heSoLuong;
    }

    public double getLuongCoBan() {
        return LUONG_CO_BAN;
    }

    public String getTen() {
        return ten;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    
    
    
    
    
}
