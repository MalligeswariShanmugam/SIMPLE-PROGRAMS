package first;
/* runtime polymorphism!*/
 class College{
	void name() {
		System.out.println("R.M.K college of engineering and technology");
	}
}
class Departments extends College{
	void name() {
		System.out.println("there are 5 departments");
	}
}
class  Students extends College{
	void name(){
		System.out.println("there are  totally 1600 students");
	}
}
class  Faculty extends College{
	void name() {
		System.out.println("there are  totally  20 faculty in each departments");
	}
}
public class  Mainclass {
	 public static void main(String[] args) 
	 {
		 College a,b,c,d ;
		 a = new College();
		 a.name();
		 b=new Departments();
		 b.name();
		 c=new Students();
		 c.name();
		 d =new Faculty();
		 d.name();
		  
		  }
}
/*
 Hierarchical inheritance
class Company{
	void name() {
		System.out.println("the legend!");
	}
}
class Branch1 extends Company{
	void clothes() {
		System.out.println("this consist of clothes collection");
	}
}
class Branch2 extends Company{
	void jewllery() {
		System.out.println("this consist of jewllery collection");
	}
}
public class Inheritanceexample {
	 public static void main(String[] args) 
	 {
		 Branch2 b2=new Branch2();
		 b2.name();
		 b2.jewllery();
		// b2.clothes(); throws error
	 }
}
*/
/* single inheritance!
class Bank {
	void bankinfo(int branchcode, String bankname)
	{
		System.out.println(branchcode+" "+bankname);
	}
	
}
class Customerinfo extends Bank
{
	void info(int id,String name) 
	{
		System.out.println( id +" "+ name );
	}
}
public class Inheritanceexample {
	 public static void main(String[] args) 
	 {
		 Customerinfo c=new Customerinfo();
		    c.info(2,"malli");
			c.bankinfo(6021,"IOB"); 
	 }
}
*/
/* Multiple inheritance!
class Bank {
	void bankinfo(int branchcode, String bankname)
	{
		System.out.println(branchcode+" "+bankname);
	
}
class Account extends Bank{
	void accountdetails() {
		System.out.println("Saving acc");
	}
}
class Customerinfo extends Account
{
	void info(int id,String name) 
	{
		System.out.println( id +" "+ name );
	}
}
public class Inheritanceexample {
 
	public static void main(String[] args) {
    Customerinfo c=new Customerinfo();
    c.info(2,"malli");
	c.bankinfo(6021,"IOB");
	c.accountdetails();
	}

}
*/
