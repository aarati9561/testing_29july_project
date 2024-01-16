package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListMethods 
{

	public static void main(String[] args) 
	{
		ArrayList<String> meth=new ArrayList<>();
		meth.add("Sangli");
		meth.add("Pune");
		meth.add("Mumbai");
		meth.add("Satara");
	
		System.out.println(meth);
		
		System.out.println("-----------add element at index-------");
		meth.add(0, "Kolhapur");
		System.out.println(meth);
		System.out.println("-----------clone makes duplicate-------");
		meth.clone();
		System.out.println(meth);
		System.out.println("-----------contains-------");
		System.out.println(meth.contains("pune"));
		System.out.println(meth.contains("Pune"));
		
		System.out.println("-----------Ensure Capacity i.e. minimum capacity-------");
		meth.ensureCapacity(5);
		System.out.println(meth);

		meth.add("ladakh");
		meth.add("Karad");
		System.out.println(meth);
		
		System.out.println("-----------Equals-------");
		System.out.println(meth.equals(meth));
		System.out.println(meth.equals(meth.clone()));
		
		System.out.println("-----------Get-------");
		System.out.println(meth.get(4));

		System.out.println("-----------Index of-------");
		System.out.println(meth.indexOf(meth));
		System.out.println(meth.indexOf("Satara"));
		System.out.println(meth.indexOf("sangli"));
		
		System.out.println("-----------IsEmpty-------");
		System.out.println(meth.isEmpty());
		
		System.out.println("-----------Last Index of-------");
		meth.add(3, "Sangli");
		System.out.println(meth);
		System.out.println(meth.lastIndexOf("Sangli"));
		
		System.out.println("-----------Remove-------");
		meth.remove(3);
		System.out.println(meth);
		
		System.out.println("--------Set---------");
		meth.set(1, "Miraj");
		System.out.println(meth);
		
		System.out.println("----------Size------------");
		System.out.println(meth.size());
		System.out.println(meth);
	//	System.out.println("----------ToString------------");
		
		//Traversing in arrayList
		// Using For Loop
		System.out.println("______________________________");
		
		System.out.println("Array Traversing uing for loop");
		for (int i=0;i<=meth.size()-1;i++)
		{
			System.out.println(meth.get(i));
		}
		
		System.out.println("______________________________");
		
		System.out.println("Array Traversing using for-each loop");
		for (String s:meth)//String Type of arrayList 
		{
			System.out.println(s);
		}
		
		System.out.println("______________________________");
		
		System.out.println("Array Traversing using Iterator cursor which moves only forward");
		Iterator it= meth.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("______________________________");
		
		System.out.println("Array Traversing using ListIterator cursor which moves forward and Backward");	
		
		ListIterator<String> li=meth.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("______________________________");
		System.out.println("cursor backward moves");
		//backward moves
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
	}

}
