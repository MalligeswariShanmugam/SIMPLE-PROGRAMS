package first;

import java.util.Scanner;

public class Reverseanum {
 
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int t=0;
		 while(n>0) {
			 int r=n%10;
			 t=(t*10)+r;
			 n=n/10;
		 }
		 System.out.print(t);

	}

}
