package polymorphismArray;

import java.util.Scanner;

class Professionals // Super Class
{
	private long social_sec_no;
	private int age;

	void Read_Data() {
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter social security number and age");
		social_sec_no = rd.nextLong();
		age = rd.nextInt();
	}
	void Print_Data() {
		System.out.println("social_sec_no=" + social_sec_no);
		System.out.println("age=" + age);
	}
}// End of Super Class

class Doctors extends Professionals {
	private String specialization;
	private int no_of_patient;

	void Read_Data()// Overriding Method100
	{
		super.Read_Data();
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter specialization and no of patient");
		specialization = rd.nextLine();
		no_of_patient = rd.nextInt();
	}

	void Print_Data()// Overriding Method
	{
		super.Print_Data();
		System.out.println("specialization=" + specialization);
		System.out.println("no_of_patient=" + no_of_patient);
	}
}// End of sub class

class Engineers extends Professionals {
	private String branch;
	private int no_of_projects;


	void Read_Data()// Overriding Method100
	{
		super.Read_Data();
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter branch and no of projects");
		branch = rd.nextLine();
		no_of_projects = rd.nextInt();
	}

	void Print_Data()// Overriding Method
	{
		super.Print_Data();
		System.out.println("branch=" + branch);
		System.out.println("no_of_project=" + no_of_projects);
	}
}// End of sub class

class Professor extends Professionals {
	private String subject;
	private int gpa;

	void Read_Data()// Overriding Method100
	{
		super.Read_Data();
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter the subject and gpa");
		subject = rd.nextLine();
		gpa = rd.nextInt();
	}

	void Print_Data()// Overriding Method
	{
		super.Print_Data();
		System.out.println("subject=" + subject);
		System.out.println("gpa=" + gpa);
	}
}// End of sub class

class Programmers extends Professionals {
	private int no_of_software;

	void Read_Data()// Overriding Method100
	{
		super.Read_Data();
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter No Of Software");
		no_of_software = rd.nextInt();
	}

	void Print_Data()// Overriding Method
	{
		super.Print_Data();
		System.out.println("no_of_software=" + no_of_software);
	}
}// End of sub class

public class PolymorphismArray {

	public static void main(String[] args) {
	int n, count , option;
	Scanner rd=new Scanner(System.in);
	System.out.println("Enter the count of Professionals");
    n=rd.nextInt();
    Professionals pref[]=new Professionals[n];// Declaration of array of ref. of n number of objects
	for (count=0;count<n;count++)
	{
		System.out.println("1] Doctor \n 2]Engineer \n 3] Professor \n 4]Programmer \n 5] stop");
        option=rd.nextInt();
        switch(option)
        {
        	case 1:
        		pref[count]=new Doctors();
        		break;
        	case 2:
        		pref[count]=new Engineers();
        		break;
        	case 3:
        		pref[count]=new Professor();
        		break;
        	case 4:
        		pref[count]=new Programmers();
        		break;
        	case 5:
        		break;
        		}//End of switch case construct
        if(option==5)
        	break;//Jump out of the loop block
        pref[count].Read_Data();
	}//End of for loop Block
	
	
	//Displaying the report of all entered data
	
	for(n=0;n<count;n++)
	{
		pref[n].Print_Data();
		System.out.println("*************************");
	}
	}

}
