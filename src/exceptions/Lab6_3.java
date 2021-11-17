package exceptions;

import java.util.Scanner;

import com.cg.eis.except.EmployeeException;
import com.cg.entity.Employee;



public class Lab6_3 {
	public static void validateEmployee(int salary) throws EmployeeException{
		if (salary<30000) {
			throw new EmployeeException();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
			try {
				System.out.println("Emp ID : ");
				int id=sc.nextInt();
				System.out.println("Salary : ");
				int salary=sc.nextInt();
				validateEmployee(salary);
				System.out.println("Emp Name : ");
				String name=sc.nextLine();
				Employee e=new Employee(id,name,salary);
				System.out.println(e);
			}catch(EmployeeException a) {
				a.printStackTrace();
			}
			sc.close();
		
		}
	}


