package Array;

public class ArrayMethod {
	static int[]get() { //method wich return an array
		return new int[] {10,20,30}; //initiation and initialization
	}
	
	public static void main(String[] args) {
		int arr[]=get(); //calling the SAME WHICH RETURN AN ARRAY
		for(int i=0;i<arr.length;i++)//PRINT THE VALUE OF AN ARRAY
			System.out.println(arr[i]);
		
	}
		
}
