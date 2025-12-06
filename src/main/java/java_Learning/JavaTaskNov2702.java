package java_Learning;

public class JavaTaskNov2702 {

	public static void main(String[] args) {
		Person p1 = new Person("Lokesh", 25);
		 
		 p1.printDetails();

	}
	
	static class Person {

	    String name;
	    int age;

	    // Parameterized Constructor
	    Person(String name, int age) {
	        this.name = name;   // assigning to instance variables
	        this.age = age;
	    }

	    // Method to print details
	    public void printDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	}

}
