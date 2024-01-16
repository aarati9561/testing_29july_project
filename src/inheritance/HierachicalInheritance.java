package inheritance;

public class HierachicalInheritance 
{
	public static void main(String[] args) 
	{
		FirstClass.mark1();
		FirstClass f=new FirstClass();
		f.myname();
		
		SecondHierachical.newsub();
		SecondHierachical.mark1();
		SecondHierachical s=new SecondHierachical();
		s.myname();
		s.name2();
		
		ThirdHierachical.newsub3();
		ThirdHierachical.mark1();
		
		ThirdHierachical t=new ThirdHierachical();
		t.name3();
		t.myname();
	}

}
