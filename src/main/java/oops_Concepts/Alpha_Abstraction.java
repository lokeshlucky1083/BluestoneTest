package oops_Concepts;

abstract class Alpha_Abstraction extends Beta_Abstraction {

	public static void main(String[] args) {
		

	}
	
	//50% of Abstarction achived here
	
	//implemented Method
	
	public void addition() {
		int sum = 10+20;
		System.out.println("Addition is" +sum);
		
	}
	
	//umimplemented method
	
	public abstract void modulus();
	
	//implemented method
	
	public void multiplication() {
		int mul = 9*6;
		System.out.println("Multiplication is "+mul);
	}
	
	//umimplemented method
	
	public abstract void substraction();

}
