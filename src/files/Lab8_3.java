package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cg.entity.Employee;

public class Lab8_3 {

	public static void main(String[] args) throws Exception {
		try {
	
		File f=new File("Employee.txt");
		String path=f.getAbsolutePath();
		FileOutputStream out=new FileOutputStream(path);
		Employee e1=new Employee(12,"deepika",55000);
		Employee e2=new Employee(14,"sai",50000);
		FileOutputStream fileOut = new FileOutputStream(path);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(e1);
        objectOut.writeObject(e2);
        out.flush();
        FileInputStream fileIn=new FileInputStream(path);
        ObjectInputStream objectIn=new ObjectInputStream(fileIn);
        System.out.println(objectIn.readObject());
        System.out.println(objectIn.readObject());
        objectOut.close();
        out.close();
        objectIn.close();
        
		}catch (IOException e) {
			System.out.println(e);
		}

}
}
