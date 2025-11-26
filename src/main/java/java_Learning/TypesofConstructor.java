package java_Learning;

public class TypesofConstructor {

	public static void main(String[] args) {


		TypesofConstructor obj = new TypesofConstructor();
		TypesofConstructor obj1 = new TypesofConstructor(26, "Lokesh", 75000);
		TypesofConstructor obj2 = new TypesofConstructor("Lucky");
		TypesofConstructor obj3 = new TypesofConstructor(26);
		TypesofConstructor obj4 = new TypesofConstructor(26, "Lokesh");

	}
	
	public TypesofConstructor() {
	System.out.println("Default constructor");
	
	}
	
	public TypesofConstructor(int age, String Name, double salary) {
    System.out.println("Parametrized Constructor: " + age+ " " + Name+ " " +75000);
		
		}
	
	public TypesofConstructor (String name) {
    System.out.println("Parametrized Constructor "+ name);
	}
    
    public TypesofConstructor (int age) {
	System.out.println("Parametrized Constructor "+ age);
	
}
    
        public TypesofConstructor (int age, String name) {
		System.out.println("Parametrized Constructor "+ age + " " +name);
}
        
}


