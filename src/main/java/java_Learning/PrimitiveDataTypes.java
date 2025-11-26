package java_Learning;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimitiveData();
		printname();
		Percentage();
		

	}

	private static void Percentage() {
		
		int Math = 89;
		int Science = 82;
		int English = 79;
		int Social = 76;
		int sum= Math+Science+English+Social;
		float average = sum/4f;
		System.out.println("Total marks is " +sum);
		System.out.println ("The average is "+average);
	}

	private static void printname() {
		String yourname = "Lokesh";
		String borndate = "11-06-1999";
		String bornday = "Friday";
		System.out.println("Hi my Name is " +yourname+" and i was born on " +borndate+ " and my born day is "+bornday); 
		
		
	}

	private static void PrimitiveData() {
		
		byte bytevalue = 121;
		short shortvalue = 32761;
		int intvalue = 1324272;
		long longvalue = 12325233;
		float floatvlaue = 3.145f;
		double doublevalue = 3.123425d;
		char c = 'M';
		boolean booleanvalue = true;
		
		System.out.println("bytevalue:"+bytevalue);
		System.out.println("shortvalue:"+shortvalue);
		System.out.println("intvalue:"+intvalue);
		System.out.println("longvalue:"+longvalue);
		System.out.println("floatvlaue:"+floatvlaue);
		System.out.println("doublevalue:"+doublevalue);
		System.out.println("c:"+c);
		System.out.println("booleanvalue:"+booleanvalue);
		
	}

}
