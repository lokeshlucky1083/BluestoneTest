package Task_Package;

public class ReturnType {

	public static void main(String[] args) {
		int total = addition();
		String x = myName();
		String y = myName();
		char gender = myGender();
		int sumoftwo = additionofTwoNumbers(5,15);
		int[] array = arrayReturn();
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(total);
		System.out.println(x);
		System.out.println(y);
		System.out.println(gender);
		System.out.println(sumoftwo);
		

	}
	
	//AccessModifier Static/NonStatic ReturnType Methodname () {}

	
	public static int addition() {
		int sum = 10+20;
		return sum;
	}
	
	public static String myName() {
		String name = "Lokesh";
		return name;
	}
	
	public static String myCity() {
		return "Kurnool";
	}
	
	public static char myGender() {
		return 'M';
	}
	
	public static int additionofTwoNumbers(int p, int q) {
		int sum = p+q;
		return sum;
	
}
	public static int[] arrayReturn() {
		int [] x = {2,3,4};
		return x;
	}
	
}
