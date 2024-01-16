package quiz;

public class OverridingClass2 extends OverridingClass1
{
	public void test(int a,int b)
	{
		int add1=a+b;
		System.out.println(add1);
	}

	public static void main(String[] args) 
	{
		OverridingClass1 o1=new OverridingClass1();
		o1.test(10, 20);
		
		OverridingClass2 o2=new OverridingClass2();
		o2.test(50, 40);
	}

}
