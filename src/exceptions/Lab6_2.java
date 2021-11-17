package exceptions;

import java.util.Scanner;

import com.cg.entity.PersonClass;
import com.cg.except.*;

public class Lab6_2 {

	public static void validateAge(float age) throws AgeValidationException{
		if (age<15) {
			throw new AgeValidationException();
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Name : ");
	String name=sc.nextLine();
	System.out.println("Age : ");
	float age=sc.nextFloat();
	
		try {
			validateAge(age);
			PersonClass p=new PersonClass(name,age);
			System.out.println(p);
		}catch(AgeValidationException a) {
			a.printStackTrace();
		}
		sc.close();
	
	}

}
