package userdefinedobjectsinArraylist;

import java.util.ArrayList;
import java.util.Iterator;
class country
{
String country_name;
int GDP;
country(String country_name,int GDP)
{
this.country_name=country_name;
this.GDP=GDP;
}
void Display_Data()
{
System.out.println("Country Name="+country_name);
System.out.println("GDP="+GDP);
}
}


public class UserDefinedObjectInArryList {

	public static void main(String[] args) {
	country ref1=new country("Argentina", 1200);
	country ref2=new country("India", 1400);
	country ref3=new country("Spain", 1800);
	country ref4=new country("U.S", 12900);
	country ref5=new country("Pakistan", 12);
	//ArrayList <country> lst=new ArrayList<country>();
	ArrayList <country> lst=new ArrayList<>();//Diamond syntax
	lst.add(ref1);
	lst.add(ref2);
	lst.add(ref3);
	lst.add(ref4);
	Iterator itr=lst.iterator();
	while(itr.hasNext())
	{
		country obj=(country)itr.next();
		obj.Display_Data();
	}
System.out.println("-------------------");
for(country Myref:lst)
{
Myref.Display_Data();	
}
System.out.println("************************");
lst.add(4,ref5);
for(country Myref:lst)
{
Myref.Display_Data();	
}
System.out.println("************************");
lst.remove(2);
while(itr.hasNext())
{
	country obj=(country)itr.next();
	obj.Display_Data();
}
	}

}
