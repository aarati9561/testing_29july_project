package interfaceStudy;

public class MyInterfaceClass implements MyInterface
{
		int add;//non static global variables
		int sub;
		
	public static void main(String[] args) 
	{
	MyInterfaceClass m=new MyInterfaceClass();
	m.method1();
	m.method2();

	}

	@Override
	public void method1() 
	{
		add=a+b;
		System.out.println(add);
		
	}

	@Override
	public void method2() 
	{
		sub=a-b;
		System.out.println(sub);
	}

}
