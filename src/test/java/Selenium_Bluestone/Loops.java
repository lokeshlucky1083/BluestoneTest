package Selenium_Bluestone;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print values upto 10
		
		for_loop();
		while_loop();
		do_while_loop();
		/*
		int x =10;
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
		*/
		
		//if we want to print values upto n number of times we need to use Increment/Decrement along with Loop concept

		// in Any loop we have 3 conditions-->intilization, condition, Increment/Decrement, Statement (piece of code)
	
		
	}

	private static void do_while_loop() {
		// TODO Auto-generated method stub
		
		System.out.println("Iam inside do-while loop");
		int i = 1;
		do {
			System.out.println(i);
			i++;
		}while(i>=10);
		
		
	}

	private static void while_loop() {
		// TODO Auto-generated method stub
		
		System.out.println("Iam inside while loop");
		int i =1;
		
		while(i<10)
		{
			System.out.println(i);
		    i++;
		}
		
	}

	private static void for_loop() {
		
		System.out.println("Iam inside for loop");
		int i =10;
		
		for(i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
	}
	
	

	
	
}
