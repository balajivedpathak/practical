package Array;
import java.util.Scanner;

public class Array_UsingScanner {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter lenght of array:");
	int arrLength=s.nextInt();
	int []anArray=new int[arrLength];
	System.out.println("Enter the element:");
	for (int i=0;i<arrLength;i++)
	{
		anArray[i]=s.nextInt();
	}
	System.out.println("Display the array list");
	for(int i=0;i<arrLength;i++)
	{
		System.out.println(anArray[i]+" ");
	}
}
}
