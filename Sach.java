package tuan.product;

public class Sach extends SanPham{
	private String tacGia;
	private int soTrang;
	

    public Sach(String ten, int id, String theLoai, int nam, double giaMua, double giaBan, int soLuong, String tacGia, int soTrang){
		super.setTen(ten); 
                super.setId(id);
		super.setTheLoai(theLoai); 
		super.setNam(nam); 
		super.setGiaMua(giaMua); 
		super.setGiaBan(giaBan); 
		super.setSoLuong(soLuong); 
		this.tacGia = tacGia;
		this.soTrang = soTrang;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
	
	public String getTacGia(){
		return this.tacGia;
	}
	
	public int getSoTrang(){
		return this.soTrang;
	}
}
