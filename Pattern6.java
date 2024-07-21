/**
 * 
 */
package first;

import java.util.Scanner; 
/**
 * 
 */
public class Pattern6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the row in odd number:");
		 int r=sc.nextInt();
		 for(int i=1;i<=(r/2)+1;i++)
		 {
			 for(int j=1;j<=i;j++) {
				 System.out.print("*");
			 }
			 for(int k=i+1;k<=(r-i)+1;k++) {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++) {
				System.out.print("*");
			 } 
			  
			 System.out.print("\n");
		 }
		 
	    for(int m=(r/2)+2;m<=r;m++) {
			for(int n=(r-m)+1;n>=1;n--) {
				System.out.print("*");
			}
			for(int p=(r/2)+1;p<=m;p++) {
				System.out.print(" ");
			}
			for(int p=(r/2)+1;p<m-1;p++) {
				System.out.print(" ");
			}
			for(int n=(r-m)+1;n>=1;n--) {
				System.out.print("*");
			}
		
			
			System.out.print("\n");
		}
		 		 
	
	}
	}


