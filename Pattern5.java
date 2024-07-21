/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * 
 */
public class Pattern5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the row");
		 int r=sc.nextInt();
		 for(int i=1;i<=r;i++)
		 {
			 if(i==1||i==r) {
				 for(int j=1;j<=r;j++) {
					 System.out.print("*");
				 }
			 }
			 else {
				 for(int j=1;j<=r;j++) {
					 if(j==1 || j==r) {
						 System.out.print("*");
					 }
					 else {
						 System.out.print(" ");
					 }
				 }
			 }
			 System.out.print("\n");
		 }

	}

}
