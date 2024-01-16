package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListLinkedList 
{

	public static void main(String[] args) 
	{
		LinkedList<Object> li=new LinkedList<>();
		
		//Adding elements in LikedList
		li.add("Sangli");
		li.add(350);
		li.add("avi");
		li.add(null);
		li.add(350);
		System.out.println(li);
		System.out.println("-----------contaions-----------");
		System.out.println(li.contains(350));
		
		System.out.println("-----------element() retrieves first element-----------");
		System.out.println(li.element());
		
		System.out.println("-----------equals() compairs whole list-----------");
		System.out.println(li.equals(li.clone()));
	
		System.out.println("-----------get()-----------");
		System.out.println(li.get(3));
		
		System.out.println("-----------getFirst()-----------");
		System.out.println(li.getFirst());
		
		System.out.println("-----------getLast()-----------");
		System.out.println(li.getLast());
		
		System.out.println("-----------indexOf()-----------");
		System.out.println(li.indexOf(350));
		
		System.out.println("-----------lastIndexof()-----------");
		System.out.println(li.lastIndexOf(350));
		
		System.out.println("-----------Offer() adds value to the last of list returs boolean-----------");
		System.out.println(li.offer(8999889));
		System.out.println(li);
		
		System.out.println("-----------peek() retrieves first element but doesnt remove-----------");
		System.out.println(li.peek());
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		
		System.out.println("-----------poll() retrieves and removes the element reurns null if empty list-----------");
		System.out.println(li.poll());
		System.out.println(li);
		System.out.println(li.pollFirst());
		System.out.println(li.pollLast());
		System.out.println(li);
		
		System.out.println("-----------pop() retrieves and removes the element reurns NoSuchElementExceptio if empty list-----------");
		System.out.println(li.pop());
		System.out.println(li);
		
		System.out.println("-------------------size()--------------");
		System.out.println(li.size());
	
		System.out.println("-------------------push()--------------");
		
		
		System.out.println("Traversing through LinkesdList");
		//1.For Loop
		System.out.println(li.add('a'));
		System.out.println();
		System.out.println("----------traversing with for loop-----------");
		for(int i=0;i<=li.size()-1;i++)
		{
			System.out.println(li.get(i));
		}
		System.out.println();
		
		//2.For Each Loop
		System.out.println("-----------For Each Loop---------------");
		for(Object fel:li)
		{
			System.out.println(fel);
		}
		System.out.println();
		
		//3.Iterator
		System.out.println("-----------Iterator(Moves only forward)---------------");
		Iterator<Object> it1=li.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		System.out.println();
		
		
		//4.ListIterator
		System.out.println("-----------List Iterator(Moves forward and backward)---------------");
		ListIterator<Object> li1=li.listIterator();
		
		while (li1.hasNext())
		{
			System.out.println(li1.next());
		}
		
		System.out.println("----------Backward Move--------------");
		
		while(li1.hasPrevious())
		{
			System.out.println(li1.previous());
		}
	}

}
