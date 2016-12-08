package thanh.Model;

import java.util.ArrayList;

public class HangDaBan {

    private int id, soLuong;
    private String ten;
    private double giaMua, giaBan;
    private int ngayBan, thangBan, namBan;

    public int getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(int ngayBan) {
        this.ngayBan = ngayBan;
    }

    public int getThangBan() {
        return thangBan;
    }

    public void setThangBan(int thangBan) {
        this.thangBan = thangBan;
    }

    public int getNamBan() {
        return namBan;
    }

    public void setNamBan(int namBan) {
        this.namBan = namBan;
    }
        
    public HangDaBan() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGiaMua() {
        return giaMua;
    }

    public void setGiaMua(double giaMua) {
        this.giaMua = giaMua;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public ArrayList<HangDaBan> getHangDaBan() {
        return hangDaBan;
    }

    public void setHangDaBan(ArrayList<HangDaBan> hangDaBan) {
        this.hangDaBan = hangDaBan;
    }
	
    ArrayList<HangDaBan> hangDaBan = new ArrayList<HangDaBan>();

    public HangDaBan(int id, String ten, int soLuong, double giaMua, double giaBan,int ngayBan, int thangBan, int namBan) {
		this.id = id;
		this.ten = ten;
		this.soLuong = soLuong;
		this.giaMua = giaMua;
		this.giaBan = giaBan;
                this.ngayBan = ngayBan;
                this.thangBan = thangBan;
                this.namBan = namBan;
	}

    public ArrayList<HangDaBan> add() {
		hangDaBan.add(new HangDaBan(2100, "Tình khúc không tên", 3, 100000, 120000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2101, "Còn thương góc bếp trái hè", 9, 87300,970000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2102, "Vùng tóc nhớ", 8, 126000, 141000,10, 4, 2016));
		hangDaBan.add(new HangDaBan(2103, "Kiếp đam mê", 9, 99000, 110000,10, 4, 2016));
		hangDaBan.add(new HangDaBan(2104, "Kỷ niệm xanh xao", 7,126900, 141000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2105, "Gọi giấc mơ xưa", 10, 99000, 110000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2106, "Nhịp phố thị", 8,149000, 166000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2107, "Tâm sự ngày đông", 13,97200, 110000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2108, "Cook-Tail", 11, 63000, 70000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2109, "Chủ nhật buồn",14,118000,132000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2110, "Bên đời hiu quạnh", 9, 118800, 132000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2111, "Tình khúc thứ nhất",6 , 72000, 89000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2112, "Run", 12, 63000, 70000, 10, 4, 2016));
		hangDaBan.add(new HangDaBan(2113, "Xuân Thênh Thang", 11, 99000,110000, 10, 4, 2016));
                
                return hangDaBan;
        }
}

