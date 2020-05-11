/*By default method main() is a thread(Parent Thread)*/
package multithresdingusingRunnable;


class Table implements Runnable
{
private String Thread_name;
private int num;
private Thread tobj;

Table(String Thread_name,int num)
{
	//super(Thread_name); gives thread name priority and main in factorial programe
this.Thread_name=Thread_name;
this.num=num;
tobj=new Thread(this,Thread_name);
System.out.println(tobj);
System.out.println(tobj.getName());
System.out.println(tobj.getPriority());
tobj.setName(tobj.getName()+" Suraj");
System.out.println(tobj.getName());
tobj.start(); // run() method
}
public void run()
{
int count=1;
try
{
	while(count<=10)
	{
		System.out.println(num+" * "+count+" = "+(num*count));
	  count++;
	  Thread.sleep(750);
	}// End of Loop
}	//End of Try block
catch(InterruptedException ir)
{
System.out.println(ir);	
}
}
}


public class MultiThreadingUsingRunnable {

	public static void main(String[] args) {
		Table ref1=new Table("First tab",100);
		Table ref2=new Table("Second tab",33);
		Table ref3=new Table("Third tab",51);
		int N=200;
		try
		{
			for(int n=1;n<=10;n++)
			{
				System.out.println(N+" * "+n+" = "+(N*n));
				Thread.sleep(950);
			}//End of loop
		}//End of try block
		catch(InterruptedException ir)
		{
		System.out.println(ir);	
		}

	}

}
