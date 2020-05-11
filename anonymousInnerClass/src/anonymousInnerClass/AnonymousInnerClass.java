package anonymousInnerClass;

abstract class laptops
{
abstract void message();	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
	laptops lp=new laptops()
			{
		void message()
		{
			System.out.println("Suraj Singh");
		}
			};
lp.message();
	}

}
