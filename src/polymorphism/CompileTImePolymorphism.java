package polymorphism;

public class CompileTImePolymorphism 
{
	//int a=25;
	//int b=30;
	//int c=35;

		public void addition(int x, int y)
		{
			//x=a;
			//y=b;
			System.out.println(x);
			System.out.println(y);
			int add=x+y;
			System.out.println("addition of two numbers "+add);
			
		}
			public void addition(int x,int y,int z)
			{
				System.out.println("addition of three numbers "+(x+y+z));
			}
			
			
		
	public static void main(String[] args) 
	{
		
		CompileTImePolymorphism t=new CompileTImePolymorphism();
		t.addition(10, 20);
		t.addition(10, 20, 30);
	}

}
