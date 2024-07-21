
package first;
public class Swapmorethantwo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1;
		int b=2;
		int c=3;
		System.out.println("Before change: "+"a is "+ a+" b is "+b +" c is "+c);
		System.out.println("with temp");
		int t=a;
		a=c;
		c=b;
		b=t;
		
		System.out.println("After change: "+"a is "+ a+" b is "+b +" c is "+c);
		System.out.println("without temp");	
		int m=1,n=2,o=3;
		System.out.println("Before change: "+"m is "+ m+" n is "+n +" o is "+o);
		n=n+o;
		o=n-o;
		n=n-o;
		m=m+n;
		n=m-n;
		m=m-n;
		System.out.println("After change: "+"m is "+ m+" n is "+n +" o is "+o);
		

	}

}
