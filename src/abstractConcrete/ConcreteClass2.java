package abstractConcrete;

public class ConcreteClass2 extends ConcreteClass1
{

	public static void main(String[] args) 
	{
		
		ConcreteClass2 c2= new ConcreteClass2();
		c2.abstractMethod1();
		c2.abstractMethod2();
		c2.concreteClassMethod();
		c2.concreteClassMethod2();
		c2.sum();
		c2.substraction();
		int mul=c2.a*c2.b;
		System.out.println(mul);
		System.out.println("value of a is "+c2.a+ " value of b is "+c2.b);
	}

	@Override
	
	public void concreteClassMethod2() 
	{
		System.out.println("concrete class method completed in second concrete class");
		
	}

}
