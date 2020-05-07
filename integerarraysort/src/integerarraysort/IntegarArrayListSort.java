package integerarraysort;
import java.util.*;
public class IntegarArrayListSort {

	public static void main(String[] args) {
	ArrayList <Integer> number=new ArrayList <Integer>();
	number.add(new Integer(1000));
	number.add(new Integer(100));
	number.add(new Integer(900));
	number.add(new Integer(200));
	number.add(new Integer(800));
	number.add(new Integer(300));
	number.add(new Integer(700));
	number.add(new Integer(400));
	Collections.sort(number);
Iterator ltr=number.iterator();
while(ltr.hasNext())
{
System.out.println (ltr.next());	
}
System.out.println("________________________________");
ArrayList <String> Mystring=new ArrayList <String>();
Mystring.add(new String("G"));
Mystring.add(new String("A"));
Mystring.add(new String("D"));
Mystring.add(new String("S"));
Mystring.add(new String("C"));
Mystring.add(new String("P"));
Mystring.add(new String("Q"));
Mystring.add(new String("Z"));
Mystring.add(new String("E"));
Mystring.add(new String("F"));
Mystring.add(new String("B"));
Collections.sort(Mystring);
Iterator ltr1=Mystring.iterator();
while(ltr1.hasNext())
{
System.out.println (ltr1.next());	
}
	}

}
