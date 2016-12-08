package tuan.product;

public class DiaNhac extends SanPham{
	private String caSi;
	private int soBaiHat;
	private String dinhDang;
	
	public DiaNhac(String ten, int id, String theLoai, int nam, double giaMua, double giaBan, int soLuong, String caSi, int soBaiHat, String dinhDang){
		super.setTen(ten); 
                super.setId(id);
		super.setTheLoai(theLoai); 
		super.setNam(nam); 
		super.setGiaMua(giaMua); 
		super.setGiaBan(giaBan); 
		super.setSoLuong(soLuong); 
		this.caSi = caSi;
		this.soBaiHat = soBaiHat;
		this.dinhDang = dinhDang;
	}
	
	public String getCaSi(){
		return this.caSi;
	}
	
	public int getSoBaiHat(){
		return this.soBaiHat;
	}
	
	public String getDinhDang(){
		return this.dinhDang;
	}
}
