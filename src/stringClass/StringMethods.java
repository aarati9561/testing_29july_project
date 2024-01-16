package stringClass;

public class StringMethods 
{

	public static void main(String[] args)
	{
		String s1=new String ("ClassMate");
		String s3=new String ("ClassMate");

		String s2=new String ("NavNeet");
		String s4=new String ("navneet");
//if u want to store multiple strings you want to use array[]
		
		System.out.println("Length of string1 <ClassMate> is "+s1.length());
		System.out.println("=========================");
		
		
		System.out.println("Converting string1 ClassMate to uppercase "+s1.toUpperCase());
		System.out.println("Converting string2 NavNeet to Lowercase "+s2.toLowerCase());

		System.out.println("=========================");
		
		System.out.println("Checking equality of strings");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println(s2.equalsIgnoreCase(s4));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println("=========================");

		System.out.println("checking string contains specified sequence of characters");
		System.out.println(s4.contains("net"));
		System.out.println(s1.contains("Clas"));
		
		System.out.println("=========================");
		
		System.out.println("checking isEmpty method");
		String s5="";
		String s6=new String(" ");
		String s7=new String("av");
				
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		System.out.println("=========================");
		
		System.out.println("Checking is Blank method");
		System.out.println(s5.isBlank());
		System.out.println(s6.isBlank());
		System.out.println(s7.isBlank());

		System.out.println("=========================");
		System.out.println("characterAt method");
		//s2=NavNeet
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(5));
	//	System.out.println(s2.charAt(7));

		System.out.println("=========================");
		System.out.println("endsWith method");
		String s8=new String("Monday");
		System.out.println(s8.endsWith("da"));
		System.out.println(s8.endsWith("day"));
		
		System.out.println("=========================");
		System.out.println("StartsWith method");
		System.out.println(s8.startsWith("Mond"));
		System.out.println(s8.startsWith("mo"));
		System.out.println(s8.startsWith("nda", 2));
		
		System.out.println("=========================");
		System.out.println("substring method");
		System.out.println(s8.substring(2));
		System.out.println(s8.substring(2, 4));
		
		System.out.println("=========================");
		System.out.println("concatination operation");
		String s11= "java";
		String s12="Selenium";
		System.out.println(s11.concat(s12));
		
		System.out.println("=========================");
		System.out.println("Index of method");
		System.out.println(s12.indexOf('u'));
		System.out.println(s12.indexOf("nium"));
		//		String s2=new String ("NavNeet");

		System.out.println(s2.indexOf('e', 2));
		System.out.println(s2.indexOf("eet", 1));
		
		System.out.println("=========================");
		System.out.println("Last Index of method");
		System.out.println(s2.lastIndexOf('N'));
		
		System.out.println("=========================");
		System.out.println("replace method");
		System.out.println(s2.replace('N', 'L'));
		System.out.println(s2.replace("Nav", "Jeev"));
		String s13="CanBan";
		System.out.println(s13.replace("an", "AR"));
		
		System.out.println("=========================");
		System.out.println("Split Method");
		//System.out.println(s2.split(s13));
		
	}

}
