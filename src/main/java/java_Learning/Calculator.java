package java_Learning;

public class Calculator {

	public static void main(String[] args) {
		Substraction();
		Multiplication();
		
	Calculator sub = new Calculator();
	 sub.addition();
	 sub.division();

	}

	public void addition() {
		System.out.println("Non-Static : addition");
		
	}
	
	public static  void Substraction() {
		System.out.println("Static : substraction");
		
	}
	public static void Multiplication() {
		System.out.println("Static : Multiplication");
}
	public void division() {
		System.out.println("Non-Static : division");
}
	
}
