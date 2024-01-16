package loopingStatement;

public class DoWhile {

	public static void main(String[] args)
	{
		int a=10;
		do
		{
			System.out.println(a);
			a=a+10;
		}while(a<=100);
		
		System.out.println("=========");
		
		int y=100;
		do
		{
			System.out.println(y);
			y=y-10;
		}while(y>=10);
		System.out.println("=========");
		
		int x=3;
		do
		{
			System.out.println(x);
			x=x*3;
		}while(x<=30);
	}

}
