package anonymousInnerclassInterface;

interface First
{
void message();	
}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		First fr=new First()
				{
			public void message()
			{
				System.out.println("Suraj Singh");
			}
				};
fr.message();
	}

}
