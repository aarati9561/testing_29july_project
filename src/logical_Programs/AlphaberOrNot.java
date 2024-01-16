package logical_Programs;

import java.util.Scanner;

public class AlphaberOrNot 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter any character: ");
	Scanner sc=new Scanner(System.in);
	char c= sc.next().charAt(0);
	
	if(c>='a'&&c<='z' || c>='A'&& c<='Z')
	{
		System.out.println("Entered character is alphabet");
	}
	else
	{
		System.out.println("Entered character is not an alphabet");
	}
	}

}
