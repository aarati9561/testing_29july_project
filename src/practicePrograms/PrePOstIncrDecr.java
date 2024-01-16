package practicePrograms;

public class PrePOstIncrDecr 
{
	
		public static void main(String[]args)
		{
			//pre increment and decrement

			int a=10;
			int b;

			b=++a;
			System.out.println("value of a"+a);	//11
			System.out.println("value of b"+b);	//11

			b=++a;
			System.out.println("value of a"+a);	//12
			System.out.println("value of b"+b);	//12
			
			b=++a;
			System.out.println("value of a"+a);	//13
			System.out.println("value of b"+b);	//13
			
			System.out.println("===============================");

	//post increment and decrement
	int c=20;
	int d;

	d=c++;
	System.out.println("value of c "+c);	//21
	System.out.println("value of d  "+d);	//20

	d=c++;
	System.out.println("value of c "+c);	//22
	System.out.println("value of d  "+d);	//21

	d=c++;
	System.out.println("value of c "+c);	//23
	System.out.println("value of d  "+d);	//22



		}


}
