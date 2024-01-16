package logical_Programs;

import java.util.Scanner;

public class CountEvenAndOddDigitsInNUmber 
{

	public static void main(String[] args) 
	{
		//number input
		//evenCount and oddCount
		
		//Get every last digit check if it is even or odd 
		//num%10 give last digit i.e. reminder we are uding to chech odd or even
		//to eliminate the digit from number we use num/10
		//if num/2=0 num is even
		//if num/2=1 num is odd
		//increase odd or even count accordingly
		//Extract that digit
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num=sc.nextInt();
		
		int num=45367;
		int evenCount=0;
		int oddCount=0;
		System.out.println("number is 45367");
		while(num>0)
		{
			int rem=num%10;//7
			if(rem%2==0)
			{
				evenCount++;
			}
			
			else
			{
				oddCount++;
			}
			
			//eliminating last digit
			num=num/10;
		}
		
		System.out.println("odd numbers count: "+oddCount);
		System.out.println("Even numbers count: "+evenCount);
}

}
