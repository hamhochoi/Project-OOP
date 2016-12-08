/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thanh.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Do Chi Thanh
 */
public class WriteObjectToFile implements java.io.Serializable{
    public void writeObjectToFile(Object object) throws IOException{
        FileOutputStream fileOut = new FileOutputStream("out.txt");
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        
        objectOut.writeObject(object);
        objectOut.flush();
    }
}
