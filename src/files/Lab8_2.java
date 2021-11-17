package files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab8_2 {
	public static void main(String[] args) {
		
		File text = new File("C:\\Users\\sai manideepika\\eclipse-workspace\\java_assign\\src\\files\\numbers.txt");
		try {
		Scanner sc= new Scanner(text);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] chars = line.split(",");
			for(String c : chars){
		         int num=Integer.parseInt(c);
		         if(num%2==0) {
		        	 System.out.print(num+" ");
		         }
		      }
			
		}sc.close();
		}catch (IOException e) {
			System.out.println(e);
		} 
		
	}
}
