package constructors;

public class Demo
{
	int a;
	int b;
	
	public Demo()
	{
		a=4;
		b=7;
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.display();
		
		 Demo d2=new Demo();
		 d2.values();
	}

	public void display()
	{
		System.out.println(" this is non static method");
	}
	
	public void values()
	{
		System.out.println("value of a is "+a);
		System.out.println("value of b is "+b);
	}
}
