package polymorphism;

public class RunTimePolymorphismClass2 extends RunTimePolymorphismClass1
{
	public void superclassMethod(String name )
	{
		name="anuradha";
		System.out.println(name);
	}

	public static void main(String[] args) 
	{
		RunTimePolymorphismClass1 r1=new RunTimePolymorphismClass1();
		r1.superclassMethod(null);
		
		RunTimePolymorphismClass2 r2=new RunTimePolymorphismClass2();
		r2.superclassMethod(null);
	}

}
