package thissuperKeyword;

public class SuperKeyword extends ThisKeywordUse
{
	int x=2000;//non static global variable
	public static void main(String[] args) 
	{
		SuperKeyword s=new SuperKeyword();
		s.display2();
		
		ThisKeywordUse t2=new ThisKeywordUse();
		System.out.println("global variables with same name calling in different class main method "+t2.a);
	}
	
	public void display2()
	{
		int a=1000;//local variable
		
		System.out.println("calling local variables a "+a);
		System.out.println("calling global variable from same clas "+this.x);
	
		System.out.println("global variables with same name from different class "+super.a);
		
		
	}

}
