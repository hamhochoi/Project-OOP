package thanh.Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;

/**
 * Created by hamhochoi on 24/10/2016.
 */
public class Manager extends NhanVien{
// Bo do khong dung database
    public double tinhTienLuong(int day1, int month1, int year1, int day2, int month2, int year2){
        TruyCapCoSoDuLieu csdl = new TruyCapCoSoDuLieu();
        ResultSet result;
        double tienLuong=0;
        
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 < day1){
                    return 0;
                }
            }
        }
        
        if (day1 > 15){             // Trên nửa tháng tính thêm 1 tháng
            month1 ++;
        }
        
//        System.out.printf("%-10s %-50s %-10s","ID","Ten nhan vien","Tien luong");
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------------");

        try{
            result = csdl.truyCapCoSoDuLieu().executeQuery("select * from NhanVien");
            int soThang =  (year2-year1-1)*12 + (12-month1)+month2;
            
            while (result.next()){
                tienLuong += result.getDouble(3)*result.getDouble(4)*soThang;
//                System.out.printf("%-10s %-50s %-10f \n",result.getString(1),result.getString(2),tienLuong);
            }

//            System.out.println("------------------------------------------------------------------------------");
            csdl.truyCapCoSoDuLieu().close();

        }
        catch (Exception e){
            System.out.println(e);
        }
    
        return tienLuong;
    }
// Dung ham nay
    public double tinhTienLuong(ArrayList<NhanVien> nhanVien, int day1, int month1, int year1, int day2, int month2, int year2){
        
        double tienLuong=0;
        
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 < day1){
                    return 0;
                }
            }
        }
        
        if (day1 > 15){             // Trên nửa tháng tính thêm 1 tháng
            month1 ++;
        }
        
        int soThang =  (year2-year1-1)*12 + (12-month1)+month2;
        
        int i=0;
        while (i<nhanVien.size() ){
            tienLuong += (nhanVien.get(i).getHeSoLuong()) * ( new NhanVien().getLuongCoBan() * soThang);
            i++;
        }
        
        
        return tienLuong;
    }
// Bo do khong dung database   
    public double tinhDoanhThu(int day1, int month1, int year1, int day2, int month2, int year2){
        TruyCapCoSoDuLieu csdl = new TruyCapCoSoDuLieu();
        ResultSet result;
        
        double tienBanHang = 0;
        double doanhThu=0;
        

        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 < day1){
                    return 0;
                }
            }
        }

        try{
            String message = "select *,Extract(day from Thời_gian),Extract(month from Thời_gian),Extract(year from Thời_gian) from hangdaban";
            result = csdl.truyCapCoSoDuLieu().executeQuery(message);

            while(result.next()){
                
                int day = result.getInt(7);
                int month = result.getInt(8);
                int year = result.getInt(9);
                
                if (year < year1){
                    continue;
                }
                else if (year == year1){
                    if (month < month1){
                        continue;
                    }
                    else if (month == month1){
                        if (day < day1){
                            continue;
                        }
                    }
                }

                if (year > year2){
                    continue;
                }
                else if (year == year2){
                    if (month > month2){
                        continue;
                    }
                    else if (month == month2){
                        if (day > day2){
                            continue;
                        }
                    }
                }
                   
                    
                tienBanHang = result.getDouble(3)*result.getDouble(5);
                doanhThu = doanhThu + tienBanHang;
            }
            result.close();          
        }
        catch (Exception e){
            System.out.println(e);
        }

        return doanhThu;
    }
// Dung ham nay
    public double tinhDoanhThu(ArrayList<HangDaBan> hangDaBan, int day1, int month1, int year1, int day2, int month2, int year2){
        
        double tienBanHang = 0;
        double doanhThu=0;
        

        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 <= day1){
                    return 0;
                }
            }
        }
        int i=0;
        while(i<hangDaBan.size() ){
            
            int day = hangDaBan.get(i).getNgayBan();
            int month = hangDaBan.get(i).getThangBan();
            int year = hangDaBan.get(i).getNamBan();
            
            if (year < year1){
                    continue;
                }
            else if (year == year1){
                if (month < month1){
                    continue;
                }
                else if (month == month1){
                    if (day < day1){
                        continue;
                    }
                }
            }

            if (year > year2){
                continue;
            }
            else if (year == year2){
                if (month > month2){
                    continue;
                }
                else if (month == month2){
                    if (day > day2){
                        continue;
                    }
                }
            }
                    
                tienBanHang = ( hangDaBan.get(i).getSoLuong() ) * ( hangDaBan.get(i).getGiaBan() );
                doanhThu = doanhThu + tienBanHang;
            
            i++;
        }
        
        return doanhThu;
    }
// Bo do khong dung database   
    public double tinhLoiNhuan(int day1, int month1, int year1, int day2, int month2, int year2){
        TruyCapCoSoDuLieu csdl = new TruyCapCoSoDuLieu();
        ResultSet result;

        double doanhThu = tinhDoanhThu(day1,month1,year1,day2,month2,year2);
        double loiNhuan=0;
        double tienMuaHang=0;
        double chiPhiMuaHang=0;
        
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 < day1){
                    return 0;
                }
            }
        }
        
        try{
            String message = "select *,Extract(day from Thời_gian),Extract(month from Thời_gian),Extract(year from Thời_gian) from hangdaban";
            result = csdl.truyCapCoSoDuLieu().executeQuery(message);

            while(result.next()){
                
                int day = result.getInt(7);
                int month = result.getInt(8);
                int year = result.getInt(9);
                
                if (year < year1){
                    continue;
                }
                else if (year == year1){
                    if (month < month1){
                        continue;
                    }
                    else if (month == month1){
                        if (day < day1){
                            continue;
                        }
                    }
                }

                if (year > year2){
                    continue;
                }
                else if (year == year2){
                    if (month > month2){
                        continue;
                    }
                    else if (month == month2){
                        if (day > day2){
                            continue;
                        }
                    }
                }
                
                tienMuaHang = result.getDouble(3)*result.getDouble(4);
                chiPhiMuaHang = chiPhiMuaHang + tienMuaHang;
            }
            result.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
        
        loiNhuan = doanhThu - chiPhiMuaHang; // - tinhChiPhiDinhKy(day1, month1, year1, day2, month2, year2) - tinhChiPhiPhatSinh(day1, month1, year1, day2, month2, year2);
        
        return loiNhuan;
    }
// Dung ham nay
    public double tinhLoiNhuan(ArrayList<HangDaBan> hangDaBan, int day1, int month1, int year1, int day2, int month2, int year2){
        double doanhThu = tinhDoanhThu(hangDaBan, day1, month1, year1, day2, month2, year2);
        double loiNhuan=0;
        double tienMuaHang=0;
        double chiPhiMuaHang=0;
        
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 <= day1){
                    return 0;
                }
            }
        }      
        
        int i = 0;
        while(i<hangDaBan.size() ){
            int day = hangDaBan.get(i).getNgayBan();
            int month = hangDaBan.get(i).getThangBan();
            int year = hangDaBan.get(i).getNamBan();
                
            if (year < year1){
                continue;
            }
            else if (year == year1){
                if (month < month1){
                    continue;
                }
                else if (month == month1){
                    if (day < day1){
                        continue;
                    }
                }
            }

            if (year > year2){
                continue;
            }
            else if (year == year2){
                if (month > month2){
                    continue;
                }
                else if (month == month2){
                    if (day > day2){
                        continue;
                    }
                }
            }
                
            tienMuaHang = ( hangDaBan.get(i).getSoLuong() ) * ( hangDaBan.get(i).getGiaMua()) ;
            chiPhiMuaHang = chiPhiMuaHang + tienMuaHang;
            
            i++;
        }
        
        loiNhuan = doanhThu - chiPhiMuaHang;
        
        return loiNhuan;
    }
// Bo do khong dung database  
    public double tinhChiPhiPhatSinh(int day1, int month1, int year1, int day2, int month2, int year2){
        TruyCapCoSoDuLieu csdl = new TruyCapCoSoDuLieu();
        ResultSet result;
        
        double chiPhi=0;
        double chiPhiCuaHang=0;
       
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 < day1){
                    return 0;
                }
            }
        }
        
        try{
            
            // Lấy ra ngày tháng của dữ liệu
            String message = "select *,Extract(day from Thời_gian),Extract(month from Thời_gian),Extract(year from Thời_gian) from chiphi";
            result = csdl.truyCapCoSoDuLieu().executeQuery(message);

            while(result.next()){
                
                int day = result.getInt(5);
                int month = result.getInt(6);
                int year = result.getInt(7);
                
                if (year < year1){
                    continue;
                }
                else if (year == year1){
                    if (month < month1){
                        continue;
                    }
                    else if (month == month1){
                        if (day < day1){
                            continue;
                        }
                    }
                }

                if (year > year2){
                    continue;
                }
                else if (year == year2){
                    if (month > month2){
                        continue;
                    }
                    else if (month == month2){
                        if (day > day2){
                            continue;
                        }
                    }
                }
                
                chiPhi = result.getDouble(3);
                chiPhiCuaHang = chiPhiCuaHang + chiPhi;
            }
            result.close();
        }
        catch (Exception e){
            System.out.println(e);
        }

        return chiPhiCuaHang;
    }
// Dung ham nay
    public double tinhChiPhiPhatSinh(ArrayList<ChiPhiPhatSinh> listPhatSinh, int day1, int month1, int year1, int day2, int month2, int year2){
        double chiPhi=0;
       
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 <= day1){
                    return 0;
                }
            }
        }
        
        int i=0;
        while(i<listPhatSinh.size()){
            int day = listPhatSinh.get(i).getNgayChiPhi();
            int month = listPhatSinh.get(i).getThangChiPhi();
            int year = listPhatSinh.get(i).getNamChiPhi();
                
            if (year < year1){
                continue;
            }
            else if (year == year1){
                if (month < month1){
                    continue;
                }
                else if (month == month1){
                    if (day < day1){
                        continue;
                    }
                }
            }

            if (year > year2){
                continue;
            }
            else if (year == year2){
                if (month > month2){
                    continue;
                }
                else if (month == month2){
                    if (day > day2){
                        continue;
                    }
                }
            }
            chiPhi += listPhatSinh.get(i).getSoTien();
            i++;
        }
        
        return chiPhi;
    }
    
    public double tinhChiPhiDinhKy(int day1, int month1, int year1, int day2, int month2, int year2){
    
        double chiPhiDinhKy=0;
        
        if (year2 < year1){
            return 0;
        }
        else if (year2 == year1){
            if (month2 < month1){
                return 0;
            }
            else if (month2 == month1){
                if (day2 <= day1){
                    return 0;
                }
            }
        }
        
        if (day1 > 15){             // Trên nửa tháng tính thêm 1 tháng
            month1 ++;
        }
        
        int soThang =  (year2-year1-1)*12 + (12-month1)+month2;
        chiPhiDinhKy = soThang * ChiPhiCoDinh.getChiPhiCoDinh();
        return chiPhiDinhKy;
    }
// Bo ham nay vi khong dung database    
    /*
    public void themChiPhiPhatSinh(String tenChiPhi, double soTien, String loaiChiPhi,int ngay, int thang, int nam){
        TruyCapCoSoDuLieu csdl = new TruyCapCoSoDuLieu();

        try{
            String message = "insert into chiphi(tên, Loại_chi_phí, Số_tiền, Thời_gian ) "  
                            + "values " + "(" + " \" " + tenChiPhi + " \" " + "," + " \" " + loaiChiPhi + " \" " + "," 
                            + soTien + "," + "\'" + nam+ "-" + thang + "-" + ngay + "\'" + ")" ; 
            csdl.truyCapCoSoDuLieu().executeUpdate(message);
           
        }
        catch(Exception e){
             System.out.println(e);
        }
    
    
    }
    */
    
    public ChiPhiPhatSinh themChiPhiPhatSinh(String tenChiPhi, double soTien, String loaiChiPhi, int ngay, int thang, int nam){ 
        return new ChiPhiPhatSinh(tenChiPhi, loaiChiPhi, soTien, ngay, thang, nam);
    }

}
