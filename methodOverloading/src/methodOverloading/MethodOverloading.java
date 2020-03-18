package methodOverloading;
import java.util.*;
class Calculation
{
	int multiply(int a, int b, int c)
	{
		int d=a*b*c;
		return d;
	}
	float multiply(float a, float b)
	{
		float c=a*b;
		return c;
	}
	float multiply(float a, int b)
	{
		float c=a*b;
		return c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
	 Calculation cref1=new Calculation();
	 System.out.println("output="+cref1.multiply(100,200,300));
	 System.out.println("output="+cref1.multiply(10.0f,25.6f));
	 System.out.println("output="+cref1.multiply(10.9f,12));

	}

}
