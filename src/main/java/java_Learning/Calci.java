package java_Learning;

public class Calci {
	
	int a = 10;
	int b = 20;
	
	//Non Static
	
	static int x = 10;
	static int y = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//classname Objectname = new classname
		Calci operations = new Calci();
		operations.addition();
		operations.Substrcation();
		operations.Multipliation();
		operations.Divison();
		
	}
	
	public void addition() {
		
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Addtion is " +sum);
		
	}
	
	public void Substrcation() {
		int diff = a-b;
		System.out.println("Substraction is " + diff);
	}

	public void Multipliation() {
		int Mul = a-b;
		System.out.println("Multiplication is " + Mul);

}
	public static void Divison() {
		
		int div = x/y;
		System.out.println("Division is " +div);
	}
	
}
