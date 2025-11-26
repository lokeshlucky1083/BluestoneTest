package java_Learning;

public class Bluestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bluestone Obj = new Bluestone();
		Obj.addition();
		Obj.substraction();
	}
	
	public Bluestone() {
		System.out.println("Hi iam a Constructor");
		
	}
	
	public void addition() {
		
		int a = 30;
		int b = 20;
		int sum = a+b;
		System.out.println("Addition is " + sum);
	}
	
	public void substraction() {
		
		int a = 30;
		int b = 20;
		int diff = a-b;
		System.out.println("Substraction is " + diff);
	
}
	
}
