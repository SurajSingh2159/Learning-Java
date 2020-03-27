package samePackage;
class Medicines
{
	String Name;
	float Price;
	int Expiry_Date;
	Medicines(String Name, float Price, int Expiry_Date)
	{
		this.Name=Name;
		this.Price=Price;
		this.Expiry_Date=Expiry_Date;
	}
	void Show_Details()
	{
		System.out.println("Medicine name="+Name+"\nPrice="+Price+
				"\nExpiry Date="+Expiry_Date);
	}
}

