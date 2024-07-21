package first;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Reversealoop {
	public static void main(String[] args) {
		/** Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the size of array :");
		 int n=sc.nextInt();
		  
		 int arr[]=new int[n];**/
		 int arr[]=new int[] {1,2,3,4,5};
		/** for(int i=0;i<n;i++)
		 {
			 arr[i]=sc.nextInt();
		 }
		 **/
		 System.out.println("the reversed array is:");
		  
		 
		 for(int i=arr.length-1;i>=0;i--) {
			 System.out.println(arr[i]);
		 }
		 

	}

}
