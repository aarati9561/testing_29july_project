package methods;

public class WithPara {

	public static void main(String[] args) 
	{
		studentinfo("Mahesh",001);   //Static method calling from same class with parameters
		
		WithPara w=new WithPara(); //Non Static method calling from same class with parameters 
		w.studentResult(45,48);
		
		DiffentClassPara d=new DiffentClassPara();//non Static method calling with parameters from diff. class
		d.details('M',987654434);
		
		DiffentClassPara.totalMarks2(50, 50, 50);//Static method calling from diff. class with parameters
		
		DiffentClassPara.totalMarks();  //Static Method calling from diff. class without parameters

	}
	
	//Static Method declairation with parameter
	public static void studentinfo(String nm,int rollno)
	{
		System.out.println("Student's name is "+nm);
		System.out.println("Student's Roll number is "+rollno);
	};

	
	//Non static method declairation with parameter
	public void studentResult(int sub1,int sub2)
	{
		System.out.println("Marks of Subject1 is "+sub1);
		System.out.println("Marks of Subject2 is "+sub2);
	}
}
