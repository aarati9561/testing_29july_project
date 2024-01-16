package abstractConcrete;

public abstract class ConcreteClass1 extends AbstractClass
{

	
	@Override
	public void abstractMethod2() {
		System.out.println("Abstract Method2 completed in Concrete class1");
		
	}
	
	public void concreteClassMethod()
	{
		System.out.println("Complete Method feom concrete class");
	}
	
	public abstract void concreteClassMethod2();
	
	public void substraction()
	{
		int sub=a-b;
		System.out.println(sub);
	}

}
