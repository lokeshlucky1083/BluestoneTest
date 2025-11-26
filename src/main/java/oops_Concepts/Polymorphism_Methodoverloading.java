package oops_Concepts;

public class Polymorphism_Methodoverloading {

	public static void main(String[] args) {
		Polymorphism_Methodoverloading obj = new Polymorphism_Methodoverloading();
		obj.addition(10);
		main(10);
		main("Lokesh");
		main(10,20);

	}
	
	public static void main (int a) {
		System.out.println(a);
	}

	public static void main (int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main (String x) {
		System.out.println(x);
	}
	
	public void addition (int a, int b) {
		int sum =a+b;
		System.out.println("Addition of 2 numbers "+sum);
	}
	
	public void addition (int a) {
		System.out.println(a+10);
	}
	
	public void addition (int a, int b, int c) {
		int sum =a+b+c;
		System.out.println("Addition of 3 numbers "+sum);
	}
	
	public void addition (String x, String y) {
		System.out.println(x+ " "+y);
	
	
	
}
	
}
