package java_Learning;

public class Biggernumber {

	public static void main(String[] args) {
		printBigger(20,30);
		printBigger(50,20);
		printBigger(10,10);
		
	}
	public static void printBigger(int a, int b) {
		if(a>b) {
			System.out.println("Bigger number :" +a);
		}
		else if(b>a) {
			System.out.println("Bigger number :" +b);
		}
		else {
			System.out.println("Both numbers are equal");
		}
		
	}

}
