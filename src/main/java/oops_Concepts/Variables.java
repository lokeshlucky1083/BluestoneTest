package oops_Concepts;

public class Variables {
	
	int a = 10;
	int b = 5;
	
	static int x= 10;
	static int y= 20;
	
	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.addition();
		obj.multiplication();
		obj.substarction();
	}
	
	public void addition() {
		int a = 10;
		int b= 20;
		int sum =a+b;
		System.out.println("Addition of 2 numbers is: " +sum);
		
	}
	
	public void multiplication() {
		int mul = a*b;
		System.out.println("Multiplication of 2 numbers is: " +mul);
	}
	
	public static void substarction() {
		int sub = x-y;
		System.out.println("Substraction of 2 numbers is :" +sub);
	}

}
