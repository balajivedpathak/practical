package Array;
import java.util.Arrays;

public class RemoveArray {
	public static void main(String[] args) {
		int []my_array = {25,14,56,25,36,6,7,18,20};
		int Index_position=2;
		int newValue=5;
		System.out.println("origirnal Array:"+Arrays.toString(my_array));
		
		//int removeIndex =1; //remover second element from an array
		
		for(int i=my_array.length-1;i>Index_position; i--) {
			
			//for (int i=removeIndex; i<my_array.length-1; i++) {
			
			my_array[i] = my_array[i-1];
		}
		
		my_array[Index_position] = newValue;
		
		System.out.println("After removing the second element:"+Arrays.toString(my_array));

	}

}
