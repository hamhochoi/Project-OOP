package tuan.product;

import java.io.Serializable;

public class SanPham implements Serializable{
	private String ten;
	private int id;
	private String theLoai;
	private int nam;
	private double giaMua;
	private double giaBan;
	private int soLuong;
	
	public String getTen(){
		return this.ten;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getTheLoai(){
		return this.theLoai;
	}
	
	public int getNam(){
		return this.nam;
	}

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
	
	public double getGiaMua(){
		return this.giaMua;
	}
	
	public double getGiaBan(){
		return this.giaBan;
	}
	
	public int getSoLuong(){
		return this.soLuong;
	}
}
