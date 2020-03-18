package newArray;
import java.util.*;
class Students
{
long Reg_Number;
int Marks1,Marks2;
void Read_Marks()
{
	Scanner rd=new Scanner(System.in);
	System.out.println("Enter the Registration Number , Marks1 and Marks2 of Students");
	Reg_Number=rd.nextLong();
	Marks1=rd.nextInt();
	Marks2=rd.nextInt();
}
float Percentage()
{
	float pc=(Marks1+Marks2)*100/200.0f;
	return pc;
}
}

public class NewArray {

	public static void main(String[] args) {
		Students sref1=new Students();
		Students sref2=new Students();
		sref1.Read_Marks();
		sref2.Read_Marks();
		System.out.println("Percentage of 1st Student="+sref1.Percentage());
		System.out.println("Percentage of 2nd Student="+sref2.Percentage());
}

}
