 
package first;

import java.util.Scanner;

public class Squareroot {
 
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		double n=sc.nextDouble();
		double t;
		double sq=n/2;
		System.out.println(sq);
		do {
			t=sq;
			sq=(t+(n/t))/2;
			System.out.println(sq);
			 
		}while((t-sq)!=0);
		System.out.println(sq);
		
		
	}

}
