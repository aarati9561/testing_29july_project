package methods;

public class Arithmatic2 
{
	public static void main(String[] args) 
	{
		Arithmatic2 b = new Arithmatic2();//object creation of non static method
		b.method2();//non static method calling
	}
	
	//Non Static method declaration
	public void method2()
	{
		int x=25;
		int y=30;
		System.out.println("Value of new two variables is "+x+" and "+y);
		System.out.println("Addition of x and y is "+(x+y));
		System.out.println("Multiplication of x and y is "+(x*y));
	};

}
