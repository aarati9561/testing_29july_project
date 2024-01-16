package thissuperKeyword;

public class ThisKeywordUse 
{
	
		int a=10;//non static global variable
		int b=20;//non static global variable
		static int c=30;//static global variable
		
	public static void main(String[] args)
	{
		ThisKeywordUse t=new ThisKeywordUse();
		t.display();
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(c);
	}
	
	public void display()
	{
		int a=100;
		int b=200;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("====calling static global variables in method using this keyword");
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println("====calling static and non static variables in main method");
	}
	
	
}
