package oops_Concepts;

public class VariablesType {
	
	int a= 20;
	int b= 30;
	
	 static int x = 10;
	 static int y = 20;
	

	public static void main(String[] args) {
		
		VariablesType p = new VariablesType();
		p.addition();
		p.Substarction();
		p.Multiplication();
		division();
		
	}
	
	// Local variable
	
	    public void addition() {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Addition of two numbers is :" +sum);
}

	    
	    public void Substarction() {
			int sub = a-b;
			System.out.println("Substraction of two numbers is :" +sub);
}
	    
	    public void Multiplication() {		
			int mul = a*b;
			System.out.println("multiplication of two numbers is :" +mul);
	    }
	    
	    public static void division() {
	    	int div = x/y;
	    	System.out.println("Division of 2 no: " +div);
	    }
	    
}