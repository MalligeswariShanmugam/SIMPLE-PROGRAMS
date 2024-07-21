 
package first;
abstract class Phone{
	abstract void call();
}
class Dial extends Phone{
	int number=1234567891;
	void call() {
		System.out.println("Dialing "+number);
	}
}
public class Helloabstract {
 	public static void main(String[] args) {
		Phone p=new Dial();
		p.call();

	}

}
