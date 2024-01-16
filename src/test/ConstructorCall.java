package test;

public class ConstructorCall
{
	int a,b;
	public ConstructorCall()
{
	 a=10;
	 b=20;
}

public static void main(String[] args)
{
	ConstructorCall call=new ConstructorCall();
	call.addition();
}

	public void addition()
{
	int add;
	add=a+b;
	System.out.println("addition is "+add);
}
}