package Array;

public class ArrayEg1 {
	public static void main(String[] args) {
	
	int a[]=new int[5]; //declaration and initialization
	//initialization
	a[0]=1;
	a[1]=9;
	a[3]=5;
	a[4]=7;
		
	//traversing(printing one after another) an array using for each 1
	System.out.println("Traversing an array bu using for each loop");
	for(int i:a)
		System.out.println(i);
	//traversing(printing one after another) an array using for loop		
		System.out.println("Traversing an array  by using for loop");
			for(int i=0; i<a.length; i++) //length is one of the property of an 
				System.out.println(a[i]);
	}
}
