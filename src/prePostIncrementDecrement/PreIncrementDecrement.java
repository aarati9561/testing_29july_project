package prePostIncrementDecrement;

public class PreIncrementDecrement
{
	public static void main(String[] args)
	{
		int x=5;
		int y;
		
		y=++x;
		System.out.println(y);
		System.out.println(x);
		
		y=++x;
		System.out.println(y);
		System.out.println(x);
		
		y=++x;
		System.out.println(y);
		System.out.println(x);
		System.out.println("----DECREMENT----");
		//Decrement
		
		int c=8;
		int d;
		d=--c;
		System.out.println(d);
		System.out.println(c);
	}
}
