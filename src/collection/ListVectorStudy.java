package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ListVectorStudy 
{

	public static void main(String[] args) 
	{
		Vector<Object> vct=new Vector<Object>();
		vct.add(100);
		vct.add("anuradha");
		vct.add(true);
		vct.add('s');
		vct.add(100);//Duplicates are allowed
		vct.add(null);//allowes any no of null values
		
		System.out.println(vct);
		System.out.println("===================================");
		//Adding element at the end & increases capacity by 1
		System.out.println("Adding element at the end & increases capacity by 1");
		vct.addElement(null);
		System.out.println(vct);
		System.out.println("===================================");

		//current capacity
		System.out.println("current capacity");
		System.out.println(vct.capacity());	
		System.out.println("===================================");
		
		//clone()
		System.out.println("Clone creates duplicate of vector List");
		System.out.println(vct.clone());
		System.out.println("===================================");
		
		System.out.println("Contains returns true if value exist in list");
		System.out.println(vct.contains('s'));
		System.out.println(vct.contains(120));
		System.out.println("===================================");
		
		System.out.println("elementAt returns value at given index");
		System.out.println(vct.elementAt(4));
		System.out.println("===================================");
		
		System.out.println("Equals compairs whole list with all elements and size");
		System.out.println(vct.equals(vct.clone()));
		System.out.println("===================================");
		
		System.out.println(vct.toString());
		System.out.println(vct);
		System.out.println("===================================");
		
		
		//4 ways traversing in vector list
		//1.For loop
		System.out.println("Traversing in vector List using for loop");
		for(int i=0;i<=vct.size()-1;i++)
		{
			System.out.println(vct.get(i));
		}
		
		
		//2.for each loop
		System.out.println("===================================");

		System.out.println("Traversing in vector List using for Each loop");
		for(Object vct1:vct)
		{
			System.out.println(vct1);
		}
		
		//3.iterator
		System.out.println("===================================");
		System.out.println("Traversing in vector List using Iterator cursor");
		Iterator it=vct.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}

		//4.ListIterator
		System.out.println("===================================");
		System.out.println("Traversing in vector List using List Iterator cursor");
		ListIterator li=vct.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println();
		
		System.out.println("Backword Traversing Using List Iterator Cursor");
		while (li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		//5.enumeration
		System.out.println("===================================");
		System.out.println("Traversing in vector List Using Enumeration Cursor");
		System.out.println("to use enumeration cursor we have to user elements method");
		System.out.println("to check is there next element use hasMoreElements method");
		System.out.println("to print next element use nextElements method");
		System.out.println();

		
		Enumeration<Object> enu=vct.elements();
		while (enu.hasMoreElements()) 
			{
				System.out.println(enu.nextElement());
				
			}
	
		
		


		
	}

}
