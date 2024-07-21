/**
 * 
 */
package first;

import java.util.Scanner;

/**
 * 
 */
public class Noofdaysinmonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the month from 1 to 12");
		 int m=sc.nextInt();
		 System.out.println("Enter the year ");
		 int year=sc.nextInt();
	     if(m==1||m==3||m==5||m==7||m==8||m==10||m==12) {
				 System.out.println("the no of days is 31");
			 }
	     else if(m==2) {
	    	 if(year%4==0 ||year%4==0) {
				 System.out.println("the no of days is 29");
			 }
	    	 else {
	    		 System.out.println("the no of days is 28");

	    	 }
		 }
		 else {
			 System.out.println("the no of days is 30");
		 }
		 

	}

}
