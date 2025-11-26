package java_Learning;

import java.util.HashSet;

public class HashSet_java {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		
		//Adding values to the ArrayList
		
		hset.add("Apple");
		hset.add("Boy");
		hset.add("girl");
		hset.add("girl");
		hset.add("Lokesh");
		
		//Directly Printing the Arraylist
		
		System.out.println(hset);
		
		int len = hset.size();
		//For each loop
		for(String temp: hset)
		{
			System.out.println(temp);
		}
				
				

	}

}
