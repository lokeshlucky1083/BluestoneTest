package oops_Concepts;

public class StaticVariables {
	
	    static int totalStudents = 100;           // integer type
	    static double averageMarks = 85.5;        // double type
	    static char grade = 'A';                  // character type
	    static boolean isOnlineClass = true;      // boolean type
	    static String schoolName = "Sunrise School"; // string type
	    static float passPercentage = 75.5f;      // float type
	    static long totalFees = 5000000L;         // long type
	    static byte section = 3;                  // byte type
	    static short year = 2025;                 // short type

	public static void main(String[] args) {
		
		    System.out.println("Total Students: " + StaticVariables.totalStudents);
	        System.out.println("Average Marks: " + StaticVariables.averageMarks);
	        System.out.println("Grade: " + StaticVariables.grade);
	        System.out.println("Is Online Class: " + StaticVariables.isOnlineClass);
	        System.out.println("School Name: " + StaticVariables.schoolName);
	        System.out.println("Pass Percentage: " + StaticVariables.passPercentage);
	        System.out.println("Total Fees: " + StaticVariables.totalFees);
	        System.out.println("Section: " + StaticVariables.section);
	        System.out.println("Year: " + StaticVariables.year);

	}

}
