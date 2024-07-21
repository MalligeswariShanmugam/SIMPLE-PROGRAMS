/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * 
 */
public class Sumaverage {

	/**
	 * 
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the size of array");
		 int n=sc.nextInt();
		 int a[]=new int[n];
		 int sum=0;
		 System.out.println("enter the elements of array");
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
			 sum+=a[i];
		 }
		 System.out.println("the sum is :"+sum);
		 System.out.println("the average is :"+(sum/n));
		 sc.close();
	}

}
