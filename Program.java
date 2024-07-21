package first;

import java.util.Scanner;
public class Program { 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number of terms:");
		 int n=sc.nextInt();
		 
		 int t1=0;
		 int t2=1;
		 if(n==1) {
			 System.out.print(t1+" ");
		 }
		 else if(n<=2) {
		 System.out.print(t1+" "+t2+" ");
		 }
		 else {
			 System.out.print(t1+" "+t2+" ");
		 while(n>2) {
			 int t3=t2+t1;
			 System.out.print(t3+" ");
			 t1=t2;
			 t2=t3;
			 n--;
		 }
		 }
	}
}
