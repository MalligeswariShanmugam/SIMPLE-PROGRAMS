
package first;

import java.util.Scanner;

public class Guessanum {

	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num between 1-100:");
		 
		int n=20;
		do {
	    try {
		     int g=sc.nextInt();
		     print(g,n);
		     
			}
		catch(Exception e) {
				System.out.println("try again");
				break;
		}
		
		}while(true);
		 
		
		}
	static void print(int g,int n) {
		if(g==n) {
			System.out.println("You have guessed correctly");

		}
		 if(g>n) {
			System.out.println("OOPS! You have guessed higher");
		}
		if(g<n) {
			System.out.println("OOPS! You have guessed lower");
		}
		 if(g<1 || g>100) {
			System.out.println("Please! Enter the num between 1-100");
		}
		
	}
	}
	
	
	 


