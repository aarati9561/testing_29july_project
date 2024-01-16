package controlStatements;

public class SwitchControl {

	public static void main(String[] args)
	{
		char value='a';
		
		switch(value)
		{
		case 'A':
			System.out.println("You Entered capital character value");
			break;
		case 'a':
			System.out.println("You Entered Small character value");
			break;
		default:
			System.out.println("please enter value between Small or capital alphabets");
		}

	}

}
