package methods;

public class Student //Static Method Calling From Another Class
{
	
	public static void main(String[] args)
{
	stud();    //method calling from same class
	Marks.result();  //method calling from another class
}

	
public static void stud()
{
	String name="priya";
	System.out.println("Students name is "+name);
};
}