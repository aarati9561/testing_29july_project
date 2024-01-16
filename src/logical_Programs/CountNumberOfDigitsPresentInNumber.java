package logical_Programs;

import java.util.Scanner;

public class CountNumberOfDigitsPresentInNumber 
{

	//count Number od digits in a  number
	//dividing the number by 10 will eliminate last number
	//declare 1 variable which will store eliminated count and increase the count after each operation count=0
	//count+1
	//when number become o we will exit

	public static void main(String[] args)
		{
			//int number=64677889;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		
			int count=0;

			while(number>0)
				{
					number=number/10;//9  //8
					count=count+1;//1 2 3

				}
			System.out.println("Count of numbers are: "+count);
				}


}

