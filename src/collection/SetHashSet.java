package collection;

import java.util.HashSet;
import java.util.Iterator;

public class SetHashSet
{

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(1);
		hs.add('a');
		hs.add("mina");
		hs.add(65.76);
		hs.add('a');
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println("---------------remove()---------------");
		
		System.out.println(hs.remove(1));
		System.out.println(hs);
		System.out.println("--------------size()--------------");
		System.out.println(hs.size());
		System.out.println("--------------isEmpty()--------------");
		System.out.println(hs.isEmpty());
		//System.out.println("--------------size()--------------");
		System.out.println(hs);
		
		System.out.println("Traversing through HashSet");
		//1.forEach
		System.out.println("------------forEach loop----------");
		for(Object hsfor:hs)
		{
			System.out.println(hsfor);
		}
		
		//2.Iterator
		System.out.println("----------Iterator----------");
		Iterator<Object> hsIt=hs.iterator();
		while(hsIt.hasNext())
		{
			System.out.println(hsIt.next());
		}
	}

}
