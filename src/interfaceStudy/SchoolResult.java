package interfaceStudy;

public class SchoolResult implements sports,Study
{

	public static void main(String[] args) 
	{
		SchoolResult s=new SchoolResult();
		s.maths();
		s.science();
		s.running();
		s.swimming();

	}

	@Override
	public void maths() 
	{
		System.out.println("student is pass in subject maths");
	}

	@Override
	public void science() 
	{
		System.out.println("student is pass in subject Science");
	
	}

	@Override
	public void running() 
	{
		System.out.println("student is Good in Running");

		
	}

	@Override
	public void swimming() 
	{
		System.out.println("student is Good in Swimming");

		
	}

}
