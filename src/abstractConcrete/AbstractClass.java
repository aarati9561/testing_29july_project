package abstractConcrete;

public abstract class AbstractClass 
{
 int a=10;
  int b=20;
public void abstractMethod1()
{
	System.out.println("Complete method1 from Abstract class");
}

	public abstract void abstractMethod2();
	
	public void sum()
	{
		int sum=a+b;
		System.out.println(sum);
	}

}
