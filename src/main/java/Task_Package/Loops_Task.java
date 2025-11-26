package Task_Package;

import java.util.Arrays;

public class Loops_Task {

	
	public static void main(String[] args) {
		int [] numbers = {12, 5, 3, 6, 2, 9, 1, 8, 7, 11, 4, 10};
		Arrays.sort(numbers);
		System.out.println("Sorted in Ascending Order: " + Arrays.toString(numbers));
		
		for (int i=1; i<12; i++)
		{
			System.out.println(i);
		}
		
		anyinteger();
		Multiplication();
		Format();

	}

	private static void Format() {
		for(int i = 1; i<=5; i++) {
			for(int j = 1;j<=i;j++) {
				System.out.print("B");}
			System.out.println();
		}
		
	}

	private static void Multiplication() {
		int number = 9;
		System.out.println("Multiplication of " + number + ":");
		for(int i=1; i<=10; i++)
		{
			int result = number*i;
			System.out.println(number + " x " + i + " = " + result);
		}
		
	}

	private static String numbers(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void anyinteger() {
		
		for (int i=1; i<=12; i++) 
		{
			if (i%2==0)
			{
				System.out.println("Even Numbers: " +i);
			}
		}
		
		
	}

}
