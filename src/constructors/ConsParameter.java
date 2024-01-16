package constructors;

public class ConsParameter
{
int a;
int b;
float c;
	
public ConsParameter() 
{
	a=10;
	b=20;
	c=33.24f;
}
 
public ConsParameter(int x)
{
	a=x;
}

public ConsParameter(int x,int y)
{
	a=x;
	b=y;
}

public static void main(String[] args) 
{
	ConsParameter cs1=new ConsParameter();
	cs1.addition();
	
	ConsParameter cs2=new ConsParameter(100);
	cs2.addition();
	
	ConsParameter cs3=new ConsParameter(45,56);
	cs3.addition();
}

public void addition()
{
	float add=a+b+c;
	System.out.println("====================");
	System.out.println("addition is "+add);
	System.out.println("value of a is "+a);
	System.out.println("value of b is "+b);
	System.out.println("value of c is "+c);
}
}