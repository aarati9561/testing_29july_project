
public class MultidiamArray
{

	public static void main(String[] args) 
	{
		//10 20 
		//40 50 
		
		int [][]mular=new int[2][2];
		
		System.out.println("Printing Multidiamentional array");
		mular[0][0]=10;
		mular[0][1]=20;
		mular[1][0]=40;
		mular[1][1]=50;
		System.out.print(mular[0][0]+" ");
		System.out.println(mular[0][1]);
		System.out.print(mular[1][0]+" ");
		System.out.print(mular[1][1]);
		System.out.println();
		System.out.println("Printing Multidiamentional arrayusing for loop");
		for (int i=0;i<=mular.length-1;i++)
		{
			for (int j=0;j<=mular.length-1;j++)
			{
				System.out.print(mular[i][j]+" ");
		}
			System.out.println();
		
	}
	}

}
