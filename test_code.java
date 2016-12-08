/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanh.Control;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import thanh.Model.*;
import java.util.ArrayList;

/**
 *
 * @author Do Chi Thanh
 */
public class test_code {
    public static void main(String[] args) {
        // Test ObjectInPutStream

        ObjectInputStream ob = null;
        try {
            FileInputStream in = new FileInputStream(new File("C:\\Users\\Do Chi Thanh\\Documents\\NetBeansProjects\\hello,world\\Data.txt"));
            ob = new ObjectInputStream(in);
            ArrayList<ChiPhiPhatSinh> listSanPham = new ArrayList<ChiPhiPhatSinh>();
            ChiPhiPhatSinh chiPhiPhatSinh = new ChiPhiPhatSinh();
            do{
                chiPhiPhatSinh = (ChiPhiPhatSinh)ob.readObject();
                listSanPham.add(chiPhiPhatSinh);
                System.out.println(chiPhiPhatSinh.toString() );
            }
            while(chiPhiPhatSinh != null);

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
    }
 
}
