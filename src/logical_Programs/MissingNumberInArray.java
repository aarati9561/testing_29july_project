package logical_Programs;

public class MissingNumberInArray
{

	public static void main(String[] args) 
	{
		/*array should not have array
		it will not be in sorted order
		values should be in proper range*/

		//we need to find sum of elements in array
		//1+2+4+5=12 sum1
		//find sum of range including missing number
		//1+2+3+4+5=15 sum2

		//sum2-sum1==missing number


		int a[]={10,20,40,50};

		int sum1=0;

		for(int i=0;i<=a.length-1;i++)
		{
			sum1=sum1+a[i];
		}

		System.out.println("Sum of numbers present in array is :"+sum1);

		int sum2=0;

		for(int i=10;i<=50;i=i+10)
		{
			sum2=sum2+i;
		}
		
		System.out.println("sum of array including missing number is: "+sum2);

		int missnum=sum2-sum1;

		System.out.println(" missing number is: "+missnum);




	}

}
