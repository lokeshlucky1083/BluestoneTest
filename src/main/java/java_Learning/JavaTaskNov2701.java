package java_Learning;

public class JavaTaskNov2701 {
	
	//1st Question
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum of two numbers is:" +sum);
		
		Studentsname("lokesh", 45);
		Studentsname("Rahul", 20);

		
	}
	
	//2nd Question

	public static void Studentsname(String name, int marks) {

		if(marks>=35) {
			System.out.println(name + " is passed");
		}
		else
		{
			System.out.println(name + " is failed" );
		}
		
	}
	
}


		
	
		
		
	
		
