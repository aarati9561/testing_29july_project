package interfaceStudy;

public interface NonAbstractInterface2 
{
	
	public void test4();
	
	default void test3()//common method in interface 1 and 2
	{
		System.out.println("this method is completed in interface 2");
	}
}
