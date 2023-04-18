package Array;

import java.util.Scanner;

public class ArrayEg5 {
    int n;
    int[] s;
    
    public static void main(String[] args) {
    	ArrayEg5 obj = new ArrayEg5();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");

        int n = sc.nextInt();
        obj.n = n;
        obj.s = new int[obj.n];

        int sum = 0, avg = 0, multi = obj.s[0];
        for (int i = 0; i < obj.n; i++) {
            obj.s[i] = sc.nextInt();
            sum += obj.s[i];
            multi *= obj.s[i];
            	//OR
            //multi=multi*obj.s[i];
            	//OR 
            /* if (i > 0) {
                multi *= obj.s[i];
            } */
        }
        avg = sum / obj.n;

        System.out.println("Sum: " + sum); 
        System.out.println("Average: " + avg);
        System.out.println("Multi: " + multi);
    }
}




