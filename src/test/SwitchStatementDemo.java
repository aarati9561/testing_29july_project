package test;

public class SwitchStatementDemo 
{
	public static void main(String[] args) 
	{
		
	String day;
	day="Saturday";
	
	switch(day)
	{
	case "Sunday":
		System.out.println("Today is Weekend");
		break;
	case "Monday":
		System.out.println("Today is Week Day");
		break;
	case "Tuesday":
		System.out.println("Today is Week Day");
		break;
	case "Wednesday":
		System.out.println("Today is Week Day");
		break;
	case "Thursday":
		System.out.println("Today is Week Day");
		break;
	case "Friday":
		System.out.println("Today is Week Day");
		break;
	case "Saturday":
		System.out.println("Today is Weekend");
		break;
		
	default:System.out.println("please enter day between week days");
	}
	}
}