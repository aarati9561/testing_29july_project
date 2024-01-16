package logical_Programs;
/*natural number>1 which has two factors 1 and itself
19 divisible by 1 and 19 only
but 28 is divisible by multiple numbers like 1,2,4,7 etc
means the number divisible by only that number is prime*/

import java.util.Scanner;

/*check num>1
if num>1 then check number is divisible by how many numbers increase count value 
if count value is more than 2 i.e. 1 and num itself then number is not prime  */


public class PrimeOrNot
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		//int num=13;
		
		int num=sc.nextInt();
		int count=0;

		if (num>1)
		{
			for(int i=1;i<=num;i++)   
				{
					if(num%i ==0)
					count++;
				}
			if(count==2)
			{
				System.out.println("Number is prime number");
			}	

			else
			{
				System.out.println("Number is not prime number");
			}
	
		}
		else
		{
			System.out.println("Number is not valid number");
			
		}
	
	}


}