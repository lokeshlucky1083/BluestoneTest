package java_Learning;

public class Methodoverloading {

	public static void main(String[] args) {
		Methodoverloading obj = new Methodoverloading();
		obj.display();
		obj.display("Lokesh");
		obj.display("Lokesh", 26);
		

	}
	public void display() {
		System.out.println("No data");
	}
	public void display(String name) {
		System.out.println("Name: " +name);
	}
	public void display(String name, int age) {
		System.out.println("Name: " +name + ", Age: " +age);
	}

}
