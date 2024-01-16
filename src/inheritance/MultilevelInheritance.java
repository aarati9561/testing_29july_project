package inheritance;

public class MultilevelInheritance 
{

	public static void main(String[] args)
	{
		ThirdClass t=new ThirdClass();
		t.middlename();
		t.myname();
		t.sirname();
		
		ThirdClass.mark1();
		ThirdClass.mark2();
		ThirdClass.mark3();
	}

}
