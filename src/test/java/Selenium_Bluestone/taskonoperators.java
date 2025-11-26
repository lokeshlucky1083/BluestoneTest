package Selenium_Bluestone;

public class taskonoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Increment_Operator();
		Decrement_Operator();

		int Number = 2;
		int Number1 = 5;
		
		if (Number % 2 == 0 ) 
		{
			System.out.println ("The Given Number is Even");
		}
		else 
		{
			System.out.println( "The Guven Number1 is Odd");
		}
		

		
	}

	public static void Increment_Operator() {
		
		int i = 10;
		
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(i++);
		
		
	}
	public static void Decrement_Operator() {
		
		int i =12;
		
		System.out.println(i--);
		System.out.println(--i);
	}
}
