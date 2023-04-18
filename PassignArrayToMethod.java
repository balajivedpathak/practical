package Array;

public class PassignArrayToMethod {
	//creating a method which pass an array as a parameter
	static void maximumNo(int array[]) { //method name maximumNo
		int max=array[0]; //5
		for(int i=1;i<array.length;i++)
			if(max<array[i]) //7
				max=array[i];
		System.out.println(max);
	}
	
	static void MinimumNo(int array[]) { //method name maximumNo
		int min=array[0]; //5 7 9
		for(int i=1;i<array.length;i++)
			if(min>array[i]) //7
				min=array[i];
		System.out.println(min);
	}
	
	public static void main(String[] args) {
		//declaration and initialization of array
		int a[]= {5,7,9,2,10};
		maximumNo(a);//passing array to a method max
		MinimumNo(a);//passing array to a method min
	}

}
