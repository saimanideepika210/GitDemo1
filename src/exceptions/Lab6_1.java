package exceptions;

import java.util.Scanner;

import com.cg.entity.Person;
import com.cg.except.ValidationException;

public class Lab6_1 {
	public static void validPerson(String str1, String str2) throws ValidationException {
		if (str1 == null || str2 == null) {
			throw new ValidationException();
		}
	}



	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("First Name : ");
		String fname = sc.nextLine();
		System.out.println("Last Name : ");
		String lname = sc.nextLine();
		try {
			validPerson(fname, lname);
			Person p = new Person(fname, lname, 'F');
			System.out.println(p);

		} catch (ValidationException e) {
			e.printStackTrace();
		}

		sc.close();

	}

}
