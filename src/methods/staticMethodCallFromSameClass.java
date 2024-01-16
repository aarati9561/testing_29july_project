package methods;

public class staticMethodCallFromSameClass {

	public static void main(String[] args) {
		test();
		test1();

	}
	
	
	public static void test()
	{
		System.out.println("this is COMPLETE STATIC REGULAR TEST method..");
	}
	
	
	public static void test1()
	{
		
		System.out.println("this is COMPLETE STATIC REGULAR TEST 1 method..");
	}
}
