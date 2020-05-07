/*ListIterator extends iterator interface. It can help us traverse the element in both the direction*/
package listiterator;

import java.util.*;
class universities
{
String University_Name;
int Enrolled_Students;

universities(String University_Name,int Enrolled_Students)
{
	this.University_Name=University_Name;
	this.Enrolled_Students=Enrolled_Students;
}
void Show_Data()
{
System.out.println("University Name="+University_Name);
System.out.println("Enrolled Students="+Enrolled_Students);
}
}
public class Listiterator {

	public static void main(String[] args) {
	ArrayList<universities> obj=new ArrayList <universities>();
	universities uref1=new universities("oxford",10000);
	universities uref2=new universities("iit",15000);
	universities uref3=new universities("Cambridge",20000);
	obj.add(uref1);
	obj.add(uref2);
	obj.add(uref3);
	ListIterator litr=obj.listIterator();
	//////////////////// Traversing in Forward direction ///////////////
	
	
	System.out.println("*************Traversing in forward direction*****");
	while(litr.hasNext())
	{
		universities ref=(universities)litr.next();
		ref.Show_Data();
		System.out.println("_________________________________________");
	}
	
	System.out.println("*************Traversing in reverse direction*****");
	while(litr.hasPrevious())
	{
		universities ref=(universities)litr.previous();
		ref.Show_Data();
		System.out.println("_________________________________________");
	}
	}

}
