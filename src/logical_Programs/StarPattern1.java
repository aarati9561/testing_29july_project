package logical_Programs;

public class StarPattern1
{

	public static void main(String[] args) 
	{
//		1  2  3  4
//	1	*	(11)
//	2	**	(21)(22)
//	3	***	(31)(32)(33)
//	4	****(41)(42)(43)(44)
		
		
		
		for(int i=1;i<=4;i++)//row
		{
			for(int j=1;j<=i;j++)//coloumns
			{
				System.out.print(j+"  ");
				// System.out.print(i+"   ");
				//System.out.print("*   ");
			}
			System.out.println();
		}

	}

}
