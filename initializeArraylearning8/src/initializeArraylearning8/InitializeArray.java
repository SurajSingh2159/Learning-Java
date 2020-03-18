package initializeArraylearning8;

public class InitializeArray {

	public static void main(String[] args) {
		int codes[] = {1,2,3,4,5,6,7,8,9};
		double temperatures[]= {37.0,37.1,37.4,37.9,38,38.9,40,40.3};
		int salaries[]= {1000,12000,13000,14000,15000,30000,40000,50000};
	for(int c=0;c<=codes.length;c++)
	{
		System.out.println("codes["+c+"]="+codes[c]);
	}
	/*for(int c=0; c<=temperatures.length;c++)
	{
		System.out.println("temperatures["+c+"=]+temperatures[c]");
	}*/
	for(int c=0; c<=salaries.length;c++)
	{
		System.out.println("salaries["+c+"=]+salaries[c]");
	}
	}

}
