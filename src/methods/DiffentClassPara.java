package methods;

public class DiffentClassPara {

	public static void main(String[] args) 
	{
		totalMarks();//Static method without parameters
		
		DiffentClassPara d=new DiffentClassPara();//Non static method with parameters
		d.details('F', 987654367);
		d.details('M',6754346);
	}
	//Static Method calling without parameters
	public static void totalMarks()
	{
		int a=30;
		int b=54;
		int c=43;
		int sum=a+b+c;
		System.out.println("Total Marks of Student is "+sum);
	}
	
	//Static Method calling with parameters
		public static void totalMarks2(int a2,int b2,int c2)
		{
			
			int sum2=a2+b2+c2;
			System.out.println("Total Marks of Student with parameterised method is "+sum2);
		}
	
	//Non Static method with parameters
	public void details(char gender,int mobNo)
	{
		System.out.println("Students Gender is "+gender);
		System.out.println("Students Mobile number is "+mobNo);
	}

}
