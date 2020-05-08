package multithreadingExtendingThread;

class Factorial extends Thread
{
private String Thread_name;
private int num;

Factorial(String Thread_name,int num)
{
this.Thread_name=Thread_name;
this.num=num;
start();
}
public void run()// overridden method
{
long FCT=1;
try
{
	while(num>=2)
	{
		FCT*=num;
		System.out.println("Intermediate Factorial of Child Thread="+FCT);
	     num++;
	  Thread.sleep(600);
	}// End of Loop
}	//End of Try block
catch(InterruptedException ir)
{
System.out.println(ir);	
}
}
}

public class Muktithreadingextendingthread {

	public static void main(String[] args) {
		Factorial ref1=new Factorial("First tab",100);
		int N=8;
		long FCT=1;
		try
		{
		while(N>=2)
		{
			FCT*=N;
			System.out.println("Intermediate Factorial of Main Thread="+FCT);
			N--;
			Thread.sleep(900);
		}//End of loop
		}//End of try block
		catch(InterruptedException ir)
		{
		System.out.println(ir);	
		}

	}

}
