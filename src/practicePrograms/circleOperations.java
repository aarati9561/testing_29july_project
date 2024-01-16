package practicePrograms;

public class circleOperations 
{

	public static void main(String[] args) 
	{
		double pi=3.14159;
		double radius=7.5;
		
		double area=pi*radius*radius;
		System.out.println("area "+area);
		
		double perimeter=2*Math.PI*radius;
		
		System.out.println("perimeter= "+perimeter);
		
		
		//swapping number
		int a=10;
		int b=20;
		System.out.println("a= "+a+"b= "+b);
		
		int c=a;
		a=b;
		b=c;
		System.out.println("a= "+a+"b= "+b);
	}

}
