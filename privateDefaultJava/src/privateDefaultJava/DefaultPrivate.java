package privateDefaultJava;
class Doctors
{
String	Name;
String Specialisation;
int Number_Patients;
/*private*/ Doctors(String	Name,String Specialisation,int Number_Patients)// Default Constructor
{
this.Name=Name;
this.Specialisation=Specialisation;
this.Number_Patients=Number_Patients;
}
}

public class DefaultPrivate {

	public static void main(String[] args) {
		Doctors dref=new Doctors("David", "Radiologist", 1200);

	}

}
