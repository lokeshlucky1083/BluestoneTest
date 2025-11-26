package java_Learning;

public class CalculatorRKT {

	public static void main(String[] args) {
		CalculatorRKT Obj = new CalculatorRKT();
		CalculatorRKT Obj1 = new CalculatorRKT(10, 20);
		CalculatorRKT Obj2 = new CalculatorRKT("Lokesh","Lucky");

	}
	
	public CalculatorRKT() {
	System.out.println("Empty value");
	}
	
	
	public CalculatorRKT(int x, int y) {
	System.out.println(x+y);
	}
	
	public CalculatorRKT (String FirstName, String Lastname) {
	System.out.println(FirstName + " " +Lastname);
	}
	

	
}
