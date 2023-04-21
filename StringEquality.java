package String;

import java.util.Scanner;

public class StringEquality {
		
		public static void main(String[] args) {
			String str1, str2; 
			Scanner ab=new Scanner(System.in);
			
			System.out.println("Enter First String:");
			str1=ab.nextLine();
			
			System.out.println("Enter Second String:");
			str2=ab.nextLine();
			
			//comparing two input string (java string compare)
			
			//method 1
			if(str1.equals(str2))//equals()-compare original content of string
				
			//method 2	
			//if(str1==str2) //==reference not value
				
			//method 3
			//if(str1.compareTo(str2)>0) //compare lexicographiacally
				
				System.out.println("Equal String");
			else
				System.out.println("UnEqual String");
		}
	}

