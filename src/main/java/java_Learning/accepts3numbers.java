package java_Learning;

public class accepts3numbers {

	public static void main(String[] args) {
		 int highest = findHighest(10, 45, 32);
		 System.out.println("Highest number: " + highest);

	}
	
	public static int findHighest(int a, int b, int c) {
	    int max = a;
	    if (b > max) max = b;
	    if (c > max) max = c;
	    return max;
	}

}
