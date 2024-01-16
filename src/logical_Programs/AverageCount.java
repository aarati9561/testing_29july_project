package logical_Programs;

public class AverageCount 
{
	public static void main(String[] args)
	{

		int num[]={4,5,3,7,8,2};
		int sum=0;

		for(int i=0;i<=num.length-1;i++)
			{
				 sum=sum+num[i];
			}
			
			System.out.println("Sum of the numbers in array: "+sum);

			System.out.println("Number of elememts present in array: "+num.length);
			
			int avg=sum/num.length;

			System.out.println("Average of numbers resent in array: "+avg);



	}
}
