package nullPointerException2;

class student
{
private int admn_id;
private int roll_no;
void assign()
{
admn_id=1234;
roll_no=12;
}
void show()
{
System.out.println("admn id="+admn_id);	
System.out.println("Roll Number="+roll_no);	
}
}

public class NullPointerException {

	public static void main(String[] args) {
		student sref=new student();
		sref.assign();
		sref.show();
		
		sref=null;
		try {
			sref.assign();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Suraj Singh");
	}

}
