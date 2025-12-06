package java_Learning;

public class Bookwith {

	public static void main(String[] args) {
		
		Book b1 = new Book("Maths");
		
		Book b2 = new Book("Physics ", 500);
		
	}
	
	static class Book{
		
		String title;
		int price;
		
		Book(String title){
			this.title = title;
			System.out.println("Title is : " + title);
		}
		
		  Book(String title, int price) {
		        this.title = title;
		        this.price = price;
		        System.out.println("Title: " + title + ", Price: " + price);
		    }
		
	}

}
