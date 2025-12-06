package java_Learning;

public class JavaTaskNov2703 {

	public static void main(String[] args) {
		
		String input = "Education";
	    int vowelCount = countVowels(input);
	    System.out.println("Number of vowels: " + vowelCount);
			
		}
	
	public static int countVowels(String text) {
	    int count = 0;
	    text = text.toLowerCase(); // convert once for easier checking

	    for (int i = 0; i < text.length(); i++) {
	        char ch = text.charAt(i);

	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	            count++;
	        }
	    }
	    return count;
	}

	}

