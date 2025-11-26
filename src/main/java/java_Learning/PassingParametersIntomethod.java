package java_Learning;

public class PassingParametersIntomethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassingParametersIntomethod obj = new PassingParametersIntomethod();
		obj.addition(10, 20);
		obj.substraction(20, 10);
		obj.MyName("Lokesh", "Lucky");
		obj.MyDetails("Lokesh", 26, 'M');
		
	}
	
	public void addition(int a, int b) {
		int sum = a+b;
		System.out.println("Addition is: " + sum);
		
		
	}
	public void substraction(int a, int b) {
		int diff = a-b;
		System.out.println("Substraction is: " + diff);

}
	
	public void MyName(String Firstname, String Lastname) {
		String fullname = Firstname + " " +Lastname;
		System.out.println("myname is: " + fullname);
}
	
    public void MyDetails(String Name, int age, char gender) {
	System.out.println("name : " + Name);
	System.out.println("Age: " + age);
	System.out.println("Gender: " + gender);
	
}

}
	



