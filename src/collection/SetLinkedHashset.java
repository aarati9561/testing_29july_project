	package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedHashset 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("aarati");
		lhs.add("latika");
		lhs.add("Neha");
		lhs.add("aamreen");
		
		System.out.println("------------Contains()---------");
		System.out.println(lhs.contains("Sneha"));
		
		System.out.println("------------Remove()---------");
		System.out.println(lhs.remove("neha"));
		System.out.println(lhs.remove("Neha"));
		
		System.out.println("------------size()---------");
		System.out.println(lhs.size());
		
		lhs.add("velocity");
		
		System.out.println("------------Traversing ---------");

		//1.for each loop
		System.out.println("-----For Each Loop------");
		for(String lhsfor:lhs)
		{
			System.out.println(lhsfor);
		}

		//2.Iterator
		System.out.println("-------Iterator------");
		Iterator<String>lhsit=lhs.iterator();
		while(lhsit.hasNext())
		{
			System.out.println(lhsit.next());
		}

	}

}
