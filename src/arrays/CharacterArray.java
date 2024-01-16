package arrays;

import java.util.Arrays;

public class CharacterArray 
{

	public static void main(String[] args) 
	{
 char c1[]= {'f','g','c','j','s','r','l'};
 Arrays.sort(c1);
 System.out.println("size of array is "+c1.length);
 
 for (int i=0;i<=c1.length-1;i++)
 {
	 
	 System.out.println(c1[i]);
 }

	}

}
