package tuan.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class IO implements java.io.Serializable{
	
	public void WriteFile(Object Obj, String fileName) throws Exception{
//		try {
			FileOutputStream f = new FileOutputStream(fileName);
			ObjectOutputStream output = new ObjectOutputStream(f);
			output.writeObject(Obj);
			output.close();
			f.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	}
	
	public Object ReadFile(String fileName) throws Exception{
		Object SP = null;
//		try {		
			FileInputStream f = new FileInputStream(fileName);
			ObjectInputStream input = new ObjectInputStream(f);
			SP = input.readObject();	
			input.close();
			f.close();
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		return SP;
	}
}
