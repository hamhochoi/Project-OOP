package tuan.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import thanh.Model.*;
import tuan.IO.IO;
import tuan.login.JFLogin;

import tuan.function.Function;

public class Main {
	public static void main(String[] args){
		Function fc = new Function();
		ArrayList<SanPham> oSP = null;
                try {
                    oSP = fc.RandomProduct(50, 50, 50);
                } catch (IOException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
		ArrayList<SanPham> iSP = new ArrayList<SanPham>();
		IO io = new IO();
                
		try {
			io.WriteFile(oSP, "Data1.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			iSP = (ArrayList<SanPham>)io.ReadFile("Data.txt");
		} catch (Exception e) {
			e.printStackTrace();
		}
//		for(int i = 0; i < iSP.size(); i++){
//			System.out.println("Ten SP: " + iSP.get(i).getTen());
//			System.out.println("ID: " + iSP.get(i).getId());
//			System.out.println("The loai: " + iSP.get(i).getTheLoai());
//		}
		
		fc.CreateAccount();
		JFLogin jfl = new JFLogin();
	}
}
