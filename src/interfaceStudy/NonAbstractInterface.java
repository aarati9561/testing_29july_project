package interfaceStudy;

public interface NonAbstractInterface 
{
	public void test1();
	public void test2();
	
	default void test3()
	{
		System.out.println("this method is completed in interface 1");
	}
	
}
