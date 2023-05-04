package batchapplication;
import java.util.Scanner;

public class BatchMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BatchService batch=new BatchService();
		int ch;
		
		System.out.println("Welcome to Anudip Foundations");
		System.out.println("=============================");
	
		do {
			System.out.println("press:\n 1)JAVA 2)AWS 3)Other 4)Exit");
			int choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				do {
				System.out.println("-----JAVA-----");
				System.out.println("1) To save student details \n" 
								 + "2) To get student details using Id \n"
								 + "5) Main Menu");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					batch.saveJavaStudentDetails();
					break;
				
				case 2:
					try {
						batch.getJavaStudentDetailsByID();
						}
					
						catch(StudentNotFoundException e)
						{
							System.out.println(e.getMessage());
						} 
					break;
					
				case 5:
					break;
				}
			}	while(ch!=5);		
		}						
	 }while (true);
  }
}
