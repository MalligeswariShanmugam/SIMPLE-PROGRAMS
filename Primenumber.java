/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * 
 */
public class Primenumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the num");
		 int n=sc.nextInt();
		 int c=0;
		 if(n==1) {
			 c=1;
		 }
		 else {
		 for(int i=2;i<=n;i++)
		 {
			 if(n%i==0) {
				 c++;
			 }
		 }
		 }
		 if(c==1) {
			 System.out.printf("the given number %d is a prime number",n);
		 }
		 else {
			 System.out.printf("the given number %d is not a prime number",n);
		 }
	}

}
