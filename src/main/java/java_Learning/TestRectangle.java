package java_Learning;

import org.openqa.selenium.devtools.v140.dom.model.Rect;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 5);
		Rectangle r2 = new Rectangle(7, 4);
		
		r1.printarea();
		r2.printarea();
		

	}
	
	static class Rectangle{
		int length;
		int breadth;
		int area;
		
		Rectangle(int length, int breadth){
			this.length = length;
			this.breadth = breadth;
			this.area = length*breadth;
		}
		
		void printarea() {
			System.out.println("Area: " + area);
		}
	}

}
