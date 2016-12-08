package thanh.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Created by hamhochoi on 24/10/2016.
 */
public class TruyCapCoSoDuLieu {

    public Statement truyCapCoSoDuLieu(){

        String URL = "jdbc:mysql://localhost:3306/OOP";
        String USER = "root";
        String PASS = "admin";

        Connection connect=null;
        Statement statement=null;

        try{
            // Buoc 1: Them Driver

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            // Buoc 2: Tao doi tuong connection

            connect = DriverManager.getConnection(URL,USER,PASS);

            // Buoc 3: Tao doi tuong Statement de gui lenh SQL sang database

            statement = connect.createStatement();


        }
        catch (Exception e){
            System.out.println(e);
        }

        return statement;
    }

}
