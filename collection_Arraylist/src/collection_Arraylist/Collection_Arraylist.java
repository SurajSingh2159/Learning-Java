package collection_Arraylist;

import java.util.*;

public class Collection_Arraylist {

	public static void main(String[] args) {
		ArrayList <String> cities=new ArrayList<String>();
		cities.add("A");
		cities.add("B");
		cities.add("C");
		cities.add("D");
		cities.add("E");
		cities.add("F");
		cities.add("G");
		cities.add("H");
		cities.add("I");
		cities.add(3,"Z");// Replaces the element at position at 3
		Iterator ref=cities.iterator();
		while(ref.hasNext())// Returns Boolean Values-->True,False
		{
			System.out.println(ref.next());// Retrieves the current element and points towards the next available element
		}
	}

}
