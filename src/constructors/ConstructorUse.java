package constructors;

public class ConstructorUse 
{
	int a,b,c;
	
	public ConstructorUse()
	{
		a=10;
		b=20;
		c=30;
	}
	public static void main(String[] args)
	{
		
		ConstructorUse u1=new ConstructorUse();
		u1.add();		
		
	}
	
	public void add()
	{
		int addition=a+b+c;
		System.out.println("addition is "+addition);
	}

}
