package java_Learning;

import java.util.ArrayList;

public class array_java {

	public static void main(String[] args) {
		//Syntax to create an ArrayList
		ArrayList<String> alist = new ArrayList<>();
		
		//Adding values to the ArrayList
		
		alist.add("Apple");
		alist.add("Boy");
		alist.add("girl");
		alist.add("girl");
		alist.add("Lokesh");
		
		//Directly Printing the Arraylist
		
		System.out.println(alist);
		
		//Getting the Size of the Arraylist
		
		int length = alist.size();
		
		for(int i=0;i<length;i++)
		{
			String temp = alist.get(i);
			System.out.println(temp);
		}
		
		/*
		System.out.println("Size of the Arraylist is:" +length);
		
		//Using for each loop for getting the values from ArrayList
		
		for(String x : alist) {
			System.out.println(x);
		}
		
		//Printing the values of the Required index
		System.out.println();
		String temp = alist.get(3);
		System.out.println("Printing by Giving the Index " +temp);
		
*/
	}

}
