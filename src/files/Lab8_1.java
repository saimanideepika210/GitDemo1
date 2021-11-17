package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab8_1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("C:\\Users\\sai manideepika\\eclipse-workspace\\java_assign\\src\\files\\file_demo.txt");
			fw = new FileWriter("C:\\Users\\sai manideepika\\eclipse-workspace\\java_assign\\src\\files\\file_demo.txt",
					true);
			int n = 0;
			while ((n = fr.read()) != -1) {
				sb.append((char) n);
			}
			fw.write(sb.reverse().toString());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
	}
}
