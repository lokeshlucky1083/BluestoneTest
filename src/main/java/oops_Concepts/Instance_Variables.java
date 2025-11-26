package oops_Concepts;

public class Instance_Variables {
	
	int age;                 // integer type
    double height;           // double type
    char gender;             // character type
    boolean isStudent;       // boolean type
    String name;             // string type
    float weight;            // float type
    long phoneNumber;        // long type
    byte rating;             // byte type
    short yearOfBirth;       // short type

	public static void main(String[] args) {
		Instance_Variables p = new Instance_Variables();
		   p.name = "Lokesh";
	        p.age = 25;
	        p.height = 5.9;
	        p.weight = 68.5f;
	        p.gender = 'M';
	        p.phoneNumber = 9876543210L;
	        p.isStudent = true;
	        p.rating = 5;
	        p.yearOfBirth = 2000;

	        // Display values
	        p.displayInfo();
	    }

	public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Gender: " + gender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Rating: " + rating);
        System.out.println("Year of Birth: " + yearOfBirth);
    }

}
