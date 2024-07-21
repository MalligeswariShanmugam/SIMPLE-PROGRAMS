
package first;
 
public class Sum {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		System.out.println("a is"+a);
		System.out.println("b is"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("this is after change");
		System.out.println("a is"+a);
		System.out.println("b is"+b);
		
		int m=4;
		int n=5;
		System.out.println("m is"+m);
		System.out.println("n is"+n);
		int t=m;
		m=n;
		n=t;
		System.out.println("this is after change");
		System.out.println("m is"+m);
		System.out.println("n is"+n);

	}

}
