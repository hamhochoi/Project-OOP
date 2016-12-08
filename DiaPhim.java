package tuan.product;

public class DiaPhim extends SanPham{
	private String dienVien;
	private String daoDien;
	private String dinhDang;
	
	public DiaPhim(String ten, int id, String theLoai, int nam, double giaMua, double giaBan, int soLuong, String daoDien, String dienVien, String dinhDang){
		super.setTen(ten); 
                super.setId(id);
		super.setTheLoai(theLoai); 
		super.setNam(nam); 
		super.setGiaMua(giaMua); 
		super.setGiaBan(giaBan); 
		super.setSoLuong(soLuong); 
		this.dienVien = dienVien;
		this.daoDien = daoDien;
		this.dinhDang = dinhDang;
	}
	
	public String getDienVien(){
		return this.dienVien;
	}
	
	public String getDaoDien(){
		return this.daoDien;
	}
	
	public String getDinhDang(){
		return this.dinhDang;
	}
}
