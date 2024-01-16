package controlStatements;

public class Nested_If
{
public static void main(String[] args) 
{
	char id='t';
	char password='f';
	
	if(id=='t')
	{
		System.out.println("ID verified");
		
		if(password=='t')
		{
			System.out.println("Password is verified and you logged in successfully");
		}
		else
		{
			System.out.println("Enterd incorrect password");
		}
	}
	else
	{
		System.out.println("Enterd incorrect login id");
	}
}
}
