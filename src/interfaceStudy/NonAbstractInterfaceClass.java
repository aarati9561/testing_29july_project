package interfaceStudy;

public class NonAbstractInterfaceClass implements NonAbstractInterface,NonAbstractInterface2
{

	public static void main(String[] args) 
	{
	NonAbstractInterfaceClass nac=new NonAbstractInterfaceClass();
	nac.test1();
	nac.test2();
	nac.test3();
	nac.test4();

	}

	

	@Override
	public void test4() 
	{
		
		System.out.println("this is test 4 method from interface 2");
	}

	@Override
	public void test1() 
	{
		System.out.println("this is test 1 method from interface 1");
		
	}

	@Override
	public void test2()
	{
		System.out.println("this is test 2 method from interface 1");
		
	}



	@Override
	public void test3()
	{
		NonAbstractInterface2.super.test3();
		NonAbstractInterface.super.test3();
	}

}
