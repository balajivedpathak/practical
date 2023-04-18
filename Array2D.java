package Array;
//multidimensional array

public class Array2D {
	public static void main(String[] args) {
		//declaration and initialization of 2d Array
		int arr[][]= {{2,5,6},{4,6,8}};
		for (int i=0;i<2;i++) { //printing row
			for (int j=0;j<3;j++) { //printing column
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();
		}
 		}
}
