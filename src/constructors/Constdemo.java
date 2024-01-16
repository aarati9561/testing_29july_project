package constructors;

public class Constdemo {
	
	String name;
	String dob;
	int rollnum;
	int val1;
	
	public Constdemo()
	{
		name="aarati";
		dob="26apr";
	}
	
	
	public Constdemo(int a,int y)
	{
		rollnum=a;
		val1=y;
	}
	public void use()
	{
		System.out.println("name is "+name);
		System.out.println("date of birth is "+dob);
		System.out.println("Roll number "+rollnum);
		System.out.println("value "+val1);
	}
	
	public static void main(String[] args) 
	{
		
		Constdemo d1=new Constdemo();
		d1.use();
		
		Constdemo d2=new Constdemo(1,50);
		d2.use();
	}

}
