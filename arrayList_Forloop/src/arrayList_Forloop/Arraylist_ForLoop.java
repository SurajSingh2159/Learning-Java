package arrayList_Forloop;

import java.util.*;

public class Arraylist_ForLoop {

	public static void main(String[] args) {
		ArrayList <String> subjects=new ArrayList<String>();
		subjects.add("A");
		subjects.add("B");
		subjects.add("C");
		subjects.add("D");
		subjects.add("E");
		subjects.add("F");
		subjects.add("G");
		subjects.add("H");
		subjects.add("I");
		subjects.add(3,"Z");// Replaces the element at position at 3
		for(String ref:subjects)
		{
			System.out.println(ref);
		}
       System.out.println("-------------------------");
       subjects.remove(3);
       for(String ref:subjects)
		{
			System.out.println(ref);
		}
       
	}

}
