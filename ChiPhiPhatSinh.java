/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanh.Model;

import java.util.ArrayList;

/**
 *
 * @author Do Chi Thanh
 */
public class ChiPhiPhatSinh extends ChiPhi implements java.io.Serializable{
    
    
    public ChiPhiPhatSinh(String ten, String loaiChiPhi, double soTien, int ngay, int thang, int nam){
        super.setTen(ten);
        super.setLoaiChiPhi(loaiChiPhi);
        super.setNgayChiPhi(ngay);
        super.setThangChiPhi(thang);
        super.setNamChiPhi(nam);
        super.setSoTien(soTien);
    }
    
    public ChiPhiPhatSinh(){
        super.setTen(null);
        super.setLoaiChiPhi(null);
        super.setNgayChiPhi(1);
        super.setThangChiPhi(1);
        super.setNamChiPhi(1);
        super.setSoTien(0);
    }
    
    ArrayList<ChiPhiPhatSinh> listPhatSinh = new ArrayList<ChiPhiPhatSinh>();
    
    public ArrayList<ChiPhiPhatSinh> add(){
        
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 1", "Chi phí phát sinh", 100000, 10, 4, 2016 ) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 2", "Chi phí phát sinh", 200000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 3", "Chi phí phát sinh", 300000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 4", "Chi phí phát sinh", 400000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 5", "Chi phí phát sinh", 500000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 6", "Chi phí phát sinh", 600000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 7", "Chi phí phát sinh", 700000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 8", "Chi phí phát sinh", 800000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 9", "Chi phí phát sinh", 900000, 10, 4, 2016) );
        listPhatSinh.add(new ChiPhiPhatSinh( "Tiền điện tháng 10", "Chi phí phát sinh", 1000000, 10, 4, 2016) );
        
        return listPhatSinh;
    }
    
    
}
