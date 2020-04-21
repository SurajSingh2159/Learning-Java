package abstractMethod;
import java.util.Scanner;
abstract class Professionals
{
private long social_sec_no;
private int age;
abstract void performance();
void Read_Data()
{
Scanner rd=new Scanner(System.in);
System.out.println("Enter social security number and age");
social_sec_no=rd.nextLong();
age=rd.nextInt();
}
void Show_DaTa()
{
System.out.println("social_sec_no="+social_sec_no);
System.out.println("age="+age);
}
}// End of Super Class
class Doctors extends Professionals
{
private String specialization;
private int no_of_patient;
void Read_Data()//Overriding Method100
{
super.Read_Data();
Scanner rd= new Scanner(System.in);
System.out.println("Enter specialization and no of patient");
specialization=rd.nextLine();
no_of_patient=rd.nextInt();
}
void Show_Data()//Overriding Method
{
super.Show_DaTa();
System.out.println("specialization="+specialization);
System.out.println("no_of_patient="+no_of_patient);
}
void performance()
{
	if(specialization.equals("heart")&& no_of_patient>=10000)
		System.out.println("Fit to be called a senior doctor");
	else
		System.out.println("He is a average doctor");
}
}//End of SubClass Laptops


public class AbstractMethod {

	public static void main(String[] args) {
	Doctors dref=new Doctors();
	dref.Read_Data();
	dref.Show_Data();
	dref.performance();

	}

}
