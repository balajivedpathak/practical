package Array;

public class ClonningAnArray {
	public static void main(String[] args) {
		int arr[]= {44,4,5,6}; //declar and initialize array
		System.out.println("print the actual array");
		for(int i:arr)//for each loop for print 
			System.err.println(i);//print
		
		System.out.println("print the clone array");
		
		int carr[]=arr.clone(); //creating clone
		for(int i:carr) //for each loop for cloning array
			System.out.println(i);
		System.out.println("both are equal o not?");
		System.out.println(arr==carr); //checking
		
	}

}
 //the output will be show "False" becasue the memory location is not same/different.