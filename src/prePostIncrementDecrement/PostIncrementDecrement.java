package prePostIncrementDecrement;

public class PostIncrementDecrement 
{
	public static void main(String[] args)
	{
		int a=10;
		int b;
		
		b=a++;
		System.out.println(b);
		System.out.println(a);
		
		b=a++;
		System.out.println(b);
		System.out.println(a);
		
		b=a++;
		System.out.println(b);
		System.out.println(a);
		System.out.println("----DECREMENT-----");
		//Decrement
		int m=20;
		int n;
		n=m--;
		System.out.println(n);
		System.out.println(m);
		n=m--;
		System.out.println(n);
		System.out.println(m);

	}
}
