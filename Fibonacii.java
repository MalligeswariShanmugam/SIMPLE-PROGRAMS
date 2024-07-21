 
package first;

import java.util.*;

public class Fibonacii {
 
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Number of terms:");
		 int n=sc.nextInt();
		 int t1=0;
		 int t2=1;
		 int k=0;
		 int l=1;
		 int arr1[]=new int[n];
		 arr1=fibi(l,n,t1,t2,k,arr1);
		 for(int i=0;i<n;i++) {
			 System.out.print(arr1[i]+" ");
		 }
		 sc.close();
		 }
	
	static int[] fibi(int l,int num,int t1,int t2,int i,int arr[]) {
		
		if(l==num+1) {
			return arr;
		}
		else {
			if(l==1) {
				  arr[i]=t1;
				  i=i+1;
				  l++;
				  fibi(l,num,t1,t2,i,arr);
			}
			else if (l==2) {
				
				 arr[i]=t2;
				 i=i+1;
				 l++;
				 fibi(l,num,t1,t2,i,arr);
				
			}
			else if(l>2) {
					int t3=t1+t2;
					
					arr[i]=t3;
					i=i+1;
					t1=t2;
					t2=t3;
					l++;
					fibi(l,num,t1,t2,i,arr);
				}
			
		}
		
		
		
		
		
		
		return arr;
	}

}
