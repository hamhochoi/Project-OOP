package thanh.Control;

/**
 * Created by hamhochoi on 24/10/2016.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import thanh.Model.*;
import thanh.View.*;


import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import tuan.IO.IO;

public class Test {

    
    public static void main(String []args) throws IOException {
        
        IO io = new IO();
  
        ArrayList listSanPham = new ArrayList();
        try {
            listSanPham = (ArrayList) io.ReadFile("Data.txt");
            System.out.println(listSanPham.toString());
        } catch (Exception ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i=0; i<listSanPham.size(); i++){
            System.out.print(i + "    ");
            if(listSanPham.get(i) instanceof DiaNhac){
                System.out.println( ((DiaNhac)(listSanPham.get(i))).getDinhDang() );
            }
            else if(listSanPham.get(i) instanceof DiaPhim){
                System.out.println( ((DiaPhim)(listSanPham.get(i))).getDienVien() );
            }       
            else if(listSanPham.get(i) instanceof Sach){
                System.out.println( ((Sach)(listSanPham.get(i))).getSoTrang() );
            }
                    
        }
        
        
        SanPham diaNhac = new DiaNhac();
        ArrayList<DiaNhac> listhac = diaNhac.add();
        
        
        DiaPhim diaPhim = new DiaPhim();
        ArrayList<DiaPhim> listPhim = diaPhim.add();
        
        Sach sach = new Sach();
        ArrayList<Sach> listSach = sach.add();
        
        NhanVien nhanVien = new NhanVien();
        ArrayList<NhanVien> listNhanVien = nhanVien.add();
        
        HangDaBan hangDaBan = new HangDaBan();
        ArrayList<HangDaBan> listHangDaBan = hangDaBan.add();
        
        ChiPhiPhatSinh chiPhiPhatSinh = new ChiPhiPhatSinh();
        ArrayList<ChiPhiPhatSinh> listPhatSinh = chiPhiPhatSinh.add();

        thanh.View.ManagerViewer view = new thanh.View.ManagerViewer();
        
    
        view.getNgay1ComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.ngay1ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getThang1ComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.thang1ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getNam1ComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.nam1ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getNgay2ComboBox1().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.ngay2ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getThangComboBox1().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.thang2ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getNamComboBox1().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.nam2ComboBoxItemStateChanged(evt);
            }
        });
        
        view.getDoanhThuButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.doanhThuButtonActionPerformed(listHangDaBan ,evt);
            }
        });
            
        view.getLoiNhuanButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.loiNhuanButtonActionPerformed(listHangDaBan, evt);
            }
        });
        
        view.getChiPhiButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.chiPhiButtonActionPerformed(listPhatSinh, evt);
            }
        });
        
        view.getTienLuongButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.tienLuongButtonActionPerformed(listNhanVien, evt);
            }
        });
       
        view.getLoaiChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.loaiChiPhiComboBoxItemStateChanged(evt);
            }
        });
        
        view.getTenChiPhiTextField().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.tenChiPhiTextFieldActionPerformed(evt);
            }
        });
        
        view.getSoTienTextField().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.soTienTextFieldActionPerformed(evt);
            }
        });
        
        view.getThemChiPhiButton().addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.themChiPhiButtonActionPerformed(evt);
            }
        });
        
        view.getNgayChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.ngayChiPhiComboBoxItemStateChanged(evt);
            }
        });
        
        view.getThangChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.thangChiPhiComboBoxItemStateChanged(evt);
            }
        });
        
        view.getNamChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                view.namChiPhiComboBoxItemStateChanged(evt);
            }
        });
        
        view.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
                view.saveButtonActionPerformed(evt);
        }
    });
        
        
    }
    
    public void run(){

            IO io = new IO();
            
            ArrayList<SanPham> listSanPham = new ArrayList<SanPham>();
            try {
                listSanPham = (ArrayList<SanPham>) io.ReadFile("Data.txt");
                System.out.println(((DiaNhac) listSanPham.get(0)).getDinhDang());
            } catch (Exception ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            SanPham diaNhac = new DiaNhac();
            ArrayList<DiaNhac> listhac = diaNhac.add();
            DiaPhim diaPhim = new DiaPhim();
            ArrayList<DiaPhim> listPhim = diaPhim.add();
            Sach sach = new Sach();
            ArrayList<Sach> listSach = sach.add();
            NhanVien nhanVien = new NhanVien();
            ArrayList<NhanVien> listNhanVien = nhanVien.add();
            HangDaBan hangDaBan = new HangDaBan();
            ArrayList<HangDaBan> listHangDaBan = hangDaBan.add();
            ChiPhiPhatSinh chiPhiPhatSinh = new ChiPhiPhatSinh();
            ArrayList<ChiPhiPhatSinh> listPhatSinh = chiPhiPhatSinh.add();
            thanh.View.ManagerViewer view = new thanh.View.ManagerViewer();
            view.getNgay1ComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.ngay1ComboBoxItemStateChanged(evt);
                }
            });
            view.getThang1ComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.thang1ComboBoxItemStateChanged(evt);
                }
            });
            view.getNam1ComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.nam1ComboBoxItemStateChanged(evt);
                }
            });
            view.getNgay2ComboBox1().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.ngay2ComboBoxItemStateChanged(evt);
                }
            });
            view.getThangComboBox1().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.thang2ComboBoxItemStateChanged(evt);
                }
            });
            view.getNamComboBox1().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.nam2ComboBoxItemStateChanged(evt);
                }
            });
            view.getDoanhThuButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.doanhThuButtonActionPerformed(listHangDaBan ,evt);
                }
            });
            view.getLoiNhuanButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.loiNhuanButtonActionPerformed(listHangDaBan, evt);
                }
            });
            view.getChiPhiButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.chiPhiButtonActionPerformed(listPhatSinh, evt);
                }
            });
            view.getTienLuongButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.tienLuongButtonActionPerformed(listNhanVien, evt);
                }
            });
            view.getLoaiChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.loaiChiPhiComboBoxItemStateChanged(evt);
                }
            });
            view.getTenChiPhiTextField().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.tenChiPhiTextFieldActionPerformed(evt);
                }
            });
            view.getSoTienTextField().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.soTienTextFieldActionPerformed(evt);
                }
            });
            view.getThemChiPhiButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.themChiPhiButtonActionPerformed(evt);
                }
            });
            view.getNgayChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.ngayChiPhiComboBoxItemStateChanged(evt);
                }
            });
            view.getThangChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.thangChiPhiComboBoxItemStateChanged(evt);
                }
            });
            view.getNamChiPhiComboBox().addItemListener(new java.awt.event.ItemListener() {
                public void itemStateChanged(java.awt.event.ItemEvent evt) {
                    view.namChiPhiComboBoxItemStateChanged(evt);
                }
            });
            view.getSaveButton().addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    view.saveButtonActionPerformed(evt);
                }
            });

        
    }
    }
    
    

