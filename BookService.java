package BookSystem;
import java.util.Scanner;

public class BookService {
	static Book book[]=new Book[10];
	static Scanner sc=new Scanner(System.in);
	static int index=0;
	
	//create book method 
	public static void createBook() 
	{
		System.out.println("Enter book ID:");
		int id=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter book name:");
		String bname=sc.nextLine();
		
		System.out.println("Enter book price:");
		double price=sc.nextDouble();
		
		//book[index].setBookId(id);
		//book[index].setBookName(bname);
		//book[index].setBookPrice(price);
		
		book[index]=new Book(id,bname,price);
		index++;
		System.out.println("Books details created sucessfully");	
	}
	//display all books details methode
	public static void getAllBookDetails() {
		int i;
		for(i=0;i<index;i++)
		{
			System.out.println("Book id:"+book[i].getBookId());
			System.out.println("Book Name:"+book[i].getBookName());
			System.out.println("Book Price:"+book[i].getBookPrice());
		}
		
	}
	
}
