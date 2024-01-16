package variables;

public class LoclAndGlobal 
{
	
	static int standard=10;//static global variable declared and initiate
	char gen='f';	//non static global variable
	
	public LoclAndGlobal()
	{
		String name="Aarati";//Local variable declairation
		System.out.println("student name is "+name);
		System.out.println("student gender is "+gen);//calling non static global variable in main
		System.out.println("student Standard is "+standard);
		
	}
	
	public static void main(String[] args) 
	{
		LoclAndGlobal l=new LoclAndGlobal();
		System.out.println("student gender is "+l.gen);//calling non static variable in main
		System.out.println("student Standard is "+standard);//calling static variable in main
		System.out.println("----from another class----");
		anoterClassDeclaire ac=new anoterClassDeclaire();
		System.out.println("new class statandard is "+anoterClassDeclaire.standard1);
		System.out.println("new class student roll no is "+ac.rollno);
	}
}
