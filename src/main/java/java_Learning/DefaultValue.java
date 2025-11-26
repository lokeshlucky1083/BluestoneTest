package java_Learning;

public class DefaultValue {
	
	//Primitive data Types
	byte value;
	short s;
	int b;
	long longvalue;
	float point;
	double dd;
	char M;
	boolean booleanvalue;
	
	//Non primitive data types
	String stringvalue;
	int[] r;
	

	public static void main(String[] args) {
		
		DefaultValue Non = new DefaultValue();
		Non.Substraction();

	}
	public void Substraction() {
		
		System.out.println("byte default value is " + value);
		System.out.println("short default value is " + s);
		System.out.println("int default value is " + b);
		System.out.println("long default value is " + longvalue);
		System.out.println("float default value is " + point);
		System.out.println("double default value is " + dd);
		System.out.println("char default value is " + M);
		System.out.println("boolean default value is " + booleanvalue);
		
		System.out.println("String default value is " + stringvalue);
		System.out.println("Integer default value is " + r);
	}

}
