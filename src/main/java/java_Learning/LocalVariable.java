package java_Learning;

public class LocalVariable {

	// Instance variable
	
	int a = 10;
	int b = 5;
	
	// Static variable
	static int x = 20;
	static int y = 2;
	public static void main(String[] args) {
	
		LocalVariable mathsoperations = new LocalVariable();
		mathsoperations.addition();
		mathsoperations.Substraction();
		mathsoperations.Multiplication();
		division();
		
	}

	public static void division() {
		int div = x/y;
		System.out.println("Division is " +div);
		
	}
	
	public void addition() {
		
		int a = 10;
		int b = 5;
		int sum = a+b;
		System.out.println("Addition is " + sum);
	}
	
     public void Substraction() {
		int diff = a-b;
		System.out.println("Substraction is " + diff);

}
     public void Multiplication() {
 		int mul = a*b;
 		System.out.println("multiplication is " + mul);
}
}