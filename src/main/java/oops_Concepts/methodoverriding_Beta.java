package oops_Concepts;

public class methodoverriding_Beta extends methodoverriding_Alpha {

	public static void main(String[] args) {
		methodoverriding_Beta obj = new methodoverriding_Beta();
		obj.home();
		obj.vehicle();
		obj.multiplication();

	}
	
	public void home(String a) {
		System.out.println("My Home");
	}
	
	public void vehicle() {
		System.out.println("Baleno");
	}
	
	public void multiplication() {
		int mul =4*4;
		System.out.println("Parent Multiplication "+mul);
	}
}
