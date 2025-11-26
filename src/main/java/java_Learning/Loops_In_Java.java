package java_Learning;

public class Loops_In_Java {

	public static void main(String[] args) {
		ForLoop();
		WhileLoop();
		DowhileLoop();

	}

	private static void DowhileLoop() {
		int i = 8;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=8);
		
		
	}

	private static void WhileLoop() {
		int a = 1;
		while (a<=10)
		{
			System.out.println(a);
			a++;
		}
		
		
	}

	private static void ForLoop() {
		int x = 10;
		for (int i= 1; i<=10; i++)
		{
			System.out.println("Forloop");
			System.out.println(i);
		}
	}

}
