package java_Learning;

public class Student {
	    int marks;
	    String name;

	    Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }

	    void printGrade() {
	        if (marks >= 90) {
	            System.out.println(name + "'s Grade: A");
	        } else if (marks >= 75) {
	            System.out.println(name + "'s Grade: B");
	        } else if (marks >= 50) {
	            System.out.println(name + "'s Grade: C");
	        } else {
	            System.out.println(name + "'s Grade: Fail");
	        }
	    }
	

	public static void main(String[] args) {
		Student s1 = new Student("Lokesh", 95);
        Student s2 = new Student("Lucky", 80);
        Student s3 = new Student("Lol", 45);

        s1.printGrade();
        s2.printGrade();
        s3.printGrade();

	}

}
