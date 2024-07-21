/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * 
 */
public class Pronicnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int f=0;
		 for(int i=0;i<=Math.sqrt(n);i++) {
			 if(n==i*(i+1)) {
				 f=1;
			 }
		 }
		 System.out.println(f==1? "yes":"no");
		 sc.close();
	}

}
