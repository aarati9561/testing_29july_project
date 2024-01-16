package inheritance;

public class SingleInherit 
{

	public static void main(String[] args)
	{
	
		FirstClass f=new FirstClass();
		f.myname();
		
		SecondClass s=new SecondClass();
		s.sirname();
		
		s.myname();//calling method from superclass using subclass object
		
		FirstClass.mark1();
		SecondClass.mark1();
		SecondClass.mark2();
	}

}
