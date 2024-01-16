package logical_Programs;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArraylist 
{

	public static void main(String[] args) 
	{
		String s[]={"abs","cgdd","dfad","asdfe"}; 
		System.out.println(s[0]);
		
		 List<String>as=Arrays.asList(s);
		 System.out.println(as);
		 
		// traversing
		 
		 Iterator<String> it=as.iterator();
		while (it.hasNext()) 
		{
			System.out.println(it.next());
			
		} 

	}

}