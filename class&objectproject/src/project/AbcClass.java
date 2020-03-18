	package project;
	
	class calc
	{
	int a;
	int b;
	int r;
	public void perform()
	{
	r=a+b;	
	}
	}
	public class AbcClass {
	
		public static void main(String[] args)
		{
			// TODO Auto-generated method stub
	/*calc obj;//reference
	obj= new calc();//object*/
			calc obj=new calc();// object knows something and object does something
			obj.a=3;
			obj.b=7;
			
			obj.perform();
			
			System.out.print(obj.r);
		}
	
	}
