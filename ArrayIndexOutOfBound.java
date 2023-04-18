package Array;
/*JVm throws an "array index out of bound exception" if length of array is 
-ve, equal to the array size or greater than the array size */

public class ArrayIndexOutOfBound {
	public static void main(String[] args) {
		int a[]= {2,5,4,8,9};
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
