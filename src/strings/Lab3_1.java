package strings;

import java.util.Scanner;

public class Lab3_1 {
	
	public static String addString(String str) {
		return str+str;
	}
	private static String replacePositions(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i%2!=0) {
				sb.append(str.charAt(i));
			}else {
				
				sb.append("#");
			}
		}
		return sb.toString();
	}
	
	private static String removeDuplicates(String str) {
		String newstr = new String();   
        
        //calculate length of the original string  
        int length = str.length();   
            
        // Traverse the string and check for the repeated characters   
        for (int i = 0; i < length; i++)    
        {   
            // store the character available at ith index in the string  
            char charAtPosition = str.charAt(i);   
                
            // check the index of the charAtPosition. If the indexOf() method returns true add it to the resuting string  
            if (newstr.indexOf(charAtPosition) < 0)   
            {   
                newstr += charAtPosition;   
            }   
        }   
		return newstr;
	}
	private static String changeChars(String str) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				sb.append(Character.toString(str.charAt(i)).toLowerCase());
			}else {
				
				sb.append(Character.toString(str.charAt(i)).toUpperCase());
			}
		}
		return sb.toString();
	}

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any String");
	String input =sc.nextLine();
	int choice;
	do {
		System.out.println("\n1. Add the String to itself");
		System.out.println("2. Replace odd positions with #");
		System.out.println("3. Remove duplicate characters in the String");
		System.out.println("4. Change odd characters to upper case");
		System.out.print("\nChoose any option: ");
		choice = sc.nextInt();
		switch (choice) {
		case 1:System.out.println(addString(input));
			break;
		case 2:System.out.println(replacePositions(input));
			break;
		case 3:System.out.println(removeDuplicates(input));
			break;
		default:System.out.println(changeChars(input));
			if (choice != 4)
				System.out.println("Enter correct option, NOTE: press 4 to exit");
		}

	} while (choice != 4);
	sc.close();
}



}
