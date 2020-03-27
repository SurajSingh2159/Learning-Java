package staticMembers;
class Salespersons
{
	int Salesman_code;
	float Sales_amount;
	float Commision;
	static float Total_commision;
	Salespersons(int Salesman_code,float Sales_amount,Float Commision)
	{
		this.Salesman_code=Salesman_code;
		this.Sales_amount=Sales_amount;
		this.Commision=Commision;
		Total_commision+=Commision;
	}
	Salespersons()
	{}
	static void Show_Total_commision()
	{
		System.out.println("Total commision earned by all "
				+ "salesperson="+Total_commision);
	}
}

public class StaticMembers {

	public static void main(String[] args) {
		Salespersons sref1=new Salespersons(101,5000.0f,300.0f);
		Salespersons sref2=new Salespersons(102,6000.0f,300.0f);
		Salespersons sref3=new Salespersons(103,100000.0f,3000.0f);
		Salespersons.Show_Total_commision();
		

	}

}
