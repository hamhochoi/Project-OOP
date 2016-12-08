/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quang.core.other;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author lequangbkhn
 */
public class TimeSystem {
     public static String getTimeSystem(){
       Date today=new Date(System.currentTimeMillis());
       SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
       String str =ft.format(today.getTime());
       return str;
   }
}
