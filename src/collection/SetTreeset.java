package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeset
{

	public static void main(String[] args)
	{
		TreeSet<Object> ts=new TreeSet<Object>();
		ts.add(100);
		ts.add(600);
		ts.add(456);
		//ts.add('a');
		//ts.add("ameer");
		//ts.add(null);
		//ts.add(null);
		ts.add(200);
		//ts.add('a');
		
		ts.add(300);
		
		
		
		System.out.println(ts);
		System.out.println("--------ceiling() Retuns value greater than or equal to given value-----");
		System.out.println(ts.ceiling(90));
		System.out.println(ts.ceiling(601));
		
		System.out.println("---First() returns fist or lowest element from list---");
		System.out.println(ts.first());
		
		System.out.println("---floor() returns value less than or equal to given value---");
		System.out.println(ts.floor(460));
		
		System.out.println("------last() returns last element or higher element from list");
		System.out.println(ts.last());
		
		System.out.println("--------lower()------------");
		System.out.println(ts.lower(300));
		
		System.out.println("------PollFirst() Retrieve and remove-------");
		System.out.println(ts.pollFirst());
		
		System.out.println("------remove() removes element if present and if not gives false-----");
		System.out.println(ts.remove(100));
		
		System.out.println("------descending Set() returns set in descending order------");
		System.out.println(ts.descendingSet());
		
		System.out.println();
		
		//Traversing through set
		
		System.out.println("Traversing with for each loop");
		
		for(Object tsfor:ts)
		{
			System.out.println(tsfor);
		}
		System.out.println();
		System.out.println("Traversing with Iterator");
		Iterator<Object> tsit=ts.iterator();
		
		while (tsit.hasNext())
		{
			System.out.println(tsit.next());
		}

	}

}
