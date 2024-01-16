//calling of local and global variables in same class

public class myClass
{
		int a=10;//non static
		
		static int b=20;

public void method1 ()
{
	int c=30;
	System.out.println("local variale c: "+c);
	System.out.println("Global Varialbe a: "+a);
	System.out.println("Global Varialbe b: "+b);

}
	
	public static void main(String[]args)
	{
	System.out.println("Global static variable b: "+b);
	
	myClass m=new myClass();
	System.out.println("Global non Static variable a: "+m.a);

m.method1();
	}



}
