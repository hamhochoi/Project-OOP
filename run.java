/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quang.run;

//import it3100.core.user.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import quang.core.user.User;
import quang.view.manager.NhanVienView;

/**
 *
 * @author lequangbkhn
 */
class randomData {

    public static int randInt(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static double randDouble(double rangeMin, double rangeMax) {
        Random r = new Random();
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    public String randomChucVu() {
        String[] cvList = {"Bán hàng", "Nhập kho"};
        String cv = cvList[randInt(0, 1)];
        return cv;
    }

    public Double randomHSL() {
        double hsl=randDouble(1, 10);
        return hsl;
    }

    public String randomName() {
        String name;
        String[] listHo = {"Lê", "Nguyễn", "Trần", "Vũ"};
        String[] listTen = {"Khánh", "An", "Bình", "Hải", "Long", "Đức", "Trung", "Giang", "Trang", "Hoài", "Thu"};
        name = listHo[randInt(0,3)] +" "+ listTen[randInt(0,10)];
        return name;
    }

    public String randomNgaySinh() {
        Random random = new Random();
        int ngay = randInt(1,29);
        int thang = randInt(1,12);
        int nam = randInt(1990,2000);
        String ngayThang = String.valueOf(ngay)
                + "/" + String.valueOf(thang)
                + "/" + String.valueOf(nam);
        return ngayThang;
    }

    public String randomPassword() {
        Random random = new Random();
        String pass = "pass";
        String[] listA = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 4; i++) {
            pass += listA[randInt(0,9)];
        }
        return pass;
    }

    public String randomUsername() {
        Random random = new Random();
        String username = "user";
        String[] listA = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i = 0; i < 4; i++) {
            username += listA[randInt(0,9)];
        }
        return username;
    }

}

class CreateList {

    public List<User> getList(List<User> list) {
        randomData rand = new randomData();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setChucVu(rand.randomChucVu());
            user.setHeSoLuong(rand.randomHSL());
            user.setName(rand.randomName());
            user.setNgaySinh(rand.randomNgaySinh());
            user.setPassWord(rand.randomPassword());
            user.setUseName(rand.randomUsername());
            user.setType(1);
            list.add(user);
        }
        return list;
    }
}

public class run {

    public static void main(String args[]) {
        List<User> list = new ArrayList<User>();
        CreateList create = new CreateList();
        list = create.getList(list);
        NhanVienView nv = new NhanVienView();
        nv.setList(list);
    }
}
