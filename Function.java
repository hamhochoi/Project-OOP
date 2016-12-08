package tuan.function;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import thanh.Model.DiaNhac;
import thanh.Model.DiaPhim;
import thanh.Model.HangDaBan;
import thanh.Model.Sach;
import thanh.Model.SanPham;
import tuan.IO.IO;
import tuan.login.Account;



public class Function{
	public ArrayList<SanPham> RandomProduct(int dn, int dp, int s) throws IOException{
		Random rd = new Random();
		ArrayList<SanPham> SP = new ArrayList<SanPham>();
		
                String nameDN[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		int idDN = 20144854;
		String dinhDangDN[] = {".mp3", ".flac", ".wav"};
		String caSiDN[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		
                String nameDP[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		int idDP = 19542133;
		String daoDienDP[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		String dienVienDP[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		String dinhDangDP[] = {".avi", ".mov", ".mp4", ".rm", ".wmv", ".vob", ".asf"};
		
                String nameS[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
		int idS = 50041657;
		String tacGiaS[] = {"ABAD", "KAJD", "ASJD", "UCN", "ASNC", "SN", "SNaI", "UVH", "IHC", "BV"};
 
                for(int i = 0; i < dn; i++){
			DiaNhac diaNhac = new DiaNhac();
			new DiaNhac(nameDN[rd.nextInt(10)], idDN, "Dia Nhac", 2000 + rd.nextInt(16), 5000*rd.nextInt(10), 50000*rd.nextInt(5), 20 + rd.nextInt(100), caSiDN[rd.nextInt(10)], 10 + rd.nextInt(30), dinhDangDN[rd.nextInt(3)]);
			SP.add(diaNhac);
			idDN++;
		}
		for(int i = 0; i < dp; i++){
			DiaPhim diaPhim = new DiaPhim();
			new DiaPhim(nameDP[rd.nextInt(10)], idDP, "Dia Phim", 1990 + rd.nextInt(25), 5000*rd.nextInt(10), 50000*rd.nextInt(5), 20 + rd.nextInt(100), daoDienDP[rd.nextInt(10)], dienVienDP[rd.nextInt(10)], dinhDangDP[rd.nextInt(7)]);
			SP.add(diaPhim);
			idDP++;
		}
		for(int i = 0; i < s; i++){
			Sach sach = new Sach();
			new Sach(nameS[rd.nextInt(10)], idS, "Sach", 1950 + rd.nextInt(65), 50000*rd.nextInt(10), 500000 + 1000*rd.nextInt(100), rd.nextInt(100), tacGiaS[rd.nextInt(10)], 500 + rd.nextInt(2000));
			SP.add(sach);
			idS++;
		}
		return SP;
	}
	
	public void CreateAccount(){
		ArrayList<Account> AC = new ArrayList<Account>();
		Account acNVBH = new Account("Nhân viên bán hàng", "123", "123");
		Account acNVK = new Account("Nhân viên kho", "456", "456");
		Account acQL = new Account("Quản lý", "789", "789");
		AC.add(acNVBH);
		AC.add(acNVK);
		AC.add(acQL);
		IO io = new IO();
		try {
			io.WriteFile(AC, "Account.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
//        public ArrayList<HangDaBan> CreateDatabase(){
//            
//        }
}
