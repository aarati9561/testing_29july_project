package methods;

public class Arithmatic1 {

	public static void main(String[] args)
	{
		Arithmatic1 a =new Arithmatic1(); //Object creation of non static method 
		a.method1();  //non static method calling from same class
		
		//non static method calling from another class
		Arithmatic2 a2=new Arithmatic2();
		a2.method2();

	}

	//non static method declaration
	public void method1()
	{
		int a=10;
		int b=40;
		System.out.println("Value of two variables is "+a+" and " +b);
		System.out.println("Addition of two variables is "+(a+b));
		System.out.println("Multiplication of two variables is "+(a*b));
	};
	
	
	
}
