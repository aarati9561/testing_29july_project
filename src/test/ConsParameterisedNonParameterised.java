package test;

public class ConsParameterisedNonParameterised
{
	int rollNo;
	String name;
	String DOB;
	double MobNo;

public ConsParameterisedNonParameterised()
{
//non parameterised

rollNo=10;
name="aarati";
DOB="25 dec";
MobNo=876787679;
}


public ConsParameterisedNonParameterised(int rno,String nm,String db,double mb)
{
rollNo=rno;
name=nm;
DOB=db;
MobNo=mb;

}

public static void main(String[] args)
{
ConsParameterisedNonParameterised cs1=new ConsParameterisedNonParameterised(100,"neha","30 jan",987656756);
cs1.valprint();

ConsParameterisedNonParameterised cs2=new ConsParameterisedNonParameterised();
cs2.valprint();

}

public void valprint()
{
System.out.println("your ROll number= "+rollNo);
System.out.println("your name= "+name);
System.out.println("your date of birth= "+DOB);
System.out.println("your mobile number= "+MobNo);
}



}
