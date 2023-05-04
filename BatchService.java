package batchapplication;
import java.util.Scanner;

public class BatchService {
	static Scanner sc=new Scanner(System.in);
	static Java java[]=new Java[50];
	static int jindex=0;
	
	public static void saveJavaStudentDetails() 
	{
		System.out.println("Enter student ID:");
		int id=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter student Name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter student mail id:");
		String email=sc.nextLine();
		
		System.out.println("Enter studetn Mobile No:");
		Long MobNo=sc.nextLong();
		
		java[jindex]=new Java (id, name, email, MobNo);
		jindex++;
		System.out.println("Student details save sucessfully...");			
	}
	public static void getJavaStudentDetailsByID() throws StudentNotFoundException 
	{
		boolean flag= false;
		System.out.println("Enter student id for search:");
		int id=sc.nextInt();
		for(int i=0; i<jindex; i++)
		{
			if(id==java[i].getStdId())
			{
				System.out.println("Studnet id:"+java[i].getStdId());
				System.out.println("Student name:"+java[i].getStdName());
				System.out.println("Student email:"+java[i].getStdMail());
				System.out.println("Student MobNo:"+java[i].getMobNo());
				flag=true;
				break;
			}
		}
		
			if(flag==false)
			{
				throw new StudentNotFoundException("Student details not found");
			}
	}
}
