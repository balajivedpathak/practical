package BookSystem;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		BookService bService=new BookService();
		
		System.out.println("Welcome to THE HOUSE OF BOOKS");
		System.out.println("==============================");
		do {
			System.out.println("Chose the option :");
			System.out.println("1) Create book details \n"
							  +"2) Display all book details");
			System.out.println("============================");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				bService.createBook();
				break;
				
			case 2:
				bService.getAllBookDetails();
				break;
			}
		}while(true);
	}
}
