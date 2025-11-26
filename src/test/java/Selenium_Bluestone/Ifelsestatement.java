package Selenium_Bluestone;

public class Ifelsestatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HorrorMovie();
	}

	
	
	public static void HorrorMovie() {
		
		int age= 65;
		
		if (age>18)
		{
			System.out.println("Kids are not allowed for HorrorMovie");
		}
		
		else if(age>18 && age<60)
		
		{
			System.out.println ("You are allowed for HorrorMovie");
			
		}
		
		else if(age>=60)
		
		{
			System.out.println ("Old age people are not allowed");
			
		}
		
		else
		{
			System.out.println("old age people are allowed");
		}
		
	}

		
	}
