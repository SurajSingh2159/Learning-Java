package scannerLearing4;
import java.util.*;

public class Scanner2 {

	public static void main(String[] args) {
		String emp_id;
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter the name of employee");
		emp_id=rd.nextLine();
		System.out.println("The name of the employee="+emp_id);
		String comp_name;
    	Scanner cd=new Scanner(System.in);
    	System.out.println("Enter the name company name");
    	comp_name=cd.next();
    	System.out.println("The name of the company="+comp_name);
		}

}
