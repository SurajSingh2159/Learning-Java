package linkedList;
import java.util.Iterator;
import java.util.*;
public class LinkedList1 {

	public static void main(String[] args) {
	LinkedList <String> obj=new LinkedList<String>();
	obj.add("A");
	obj.add("AA");
	obj.add("AAA");
	obj.add("AAAA");
	obj.add("AAAAA");
	obj.add("AAAAAA");
	obj.add("AAAAAAA");
	obj.add("AAAAAAAA");
	obj.add("AAAAAAAAA");
	Iterator ltr=obj.iterator();
	while(ltr.hasNext())
	{
		System.out.println(ltr.next());
	}
System.out.println("--------------------------");
    for(String n:obj)
    {
    	System.out.println((n));
    }
    obj.add( 2, "zzzzzzzzzzzzzzz");
    System.out.println("--------------------------"); 
    for(String n:obj)
    {
    	System.out.println((n));
    }
    obj.remove(4);
	}

}
