package Selenium_Bluestone;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArthematicOperators();
		LogicalOperators();
		LogicalOperators1();

	}

	public static void ArthematicOperators () {
		
		int a =5;
		int b =7;
		
		//addtion
		int sum = a+b;
		
		//Subtraction
		int sub= b-a;
		
		//multiplication
		
		int mul = a*b;
		
		//division----->Quotient
		
		int div= b/2;
		
		//Modulous
		
		int rem= b%2;
		
		System.out.println (sum);
		System.out.println (sub);
		System.out.println (mul);
		System.out.println (div);
		System.out.println (rem);
		
	}
	
	public static void LogicalOperators() {
		
		int a= 5;
		int b= 9;
		int c= 3;
		
		if (a<=b && c<a && b>c)
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println ("Fail");
		}
		
		
	}
	
	public static void LogicalOperators1() {
		
		int a= 5;
		int b= 9;
		int c= 3;
		
		if (a>b || c>a || b>c)
		{
			System.out.println ("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}
