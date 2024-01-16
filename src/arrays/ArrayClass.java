package arrays;

public class ArrayClass 
{
public static void main(String[] args) 
{
//syntax to create array 
//datatype referance variable=new dataType[size od array]/

int a1[]=new int [3];
a1[0]=10;
a1[1]=20;
a1[2]=30;
//a1[4]=40;
//a1[5]=50;
System.out.println("printing array using printing statement");

System.out.println(a1[0]);
System.out.println(a1[1]);
System.out.println(a1[2]);

System.out.println("printing array using for loop");
for( int i=0;i<=a1.length-1;i++)
{
	System.out.println(a1[i]);
}

}
}
         