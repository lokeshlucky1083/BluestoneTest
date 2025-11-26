package Selenium_Bluestone;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Irctc(65);

	}

	public static void Irctc(int age) {
		
		//int age = 55;
		
		if (age>=65)
		{
			System.out.println("You are Eligible for free ticket");
			
		}
		
		else
			
		{
			System.out.print("You have to pay for the Ticket");
		}
		
		

	}
	
}
