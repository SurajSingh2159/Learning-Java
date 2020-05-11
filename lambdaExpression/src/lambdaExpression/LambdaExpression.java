package lambdaExpression;

interface table
{
public void display();	
}
interface first
{
public void message();	
}
interface second
{
public float calc(float var);	
}



public class LambdaExpression {

	public static void main(String[] args) {
		int num=200;
		
		table ref=()->
		{
			for (int c=1;c<=10;c++)
			{
				System.out.println(num+" * "+c+" = "+(num*c));
			}
		};
		ref.display();
		first fr=()->
		{
			System.out.println("Suraj Singh");
		};
		fr.message();
		second ft=(var)->
		{
			var*=10;
			return var;
		};
		System.out.println(ft.calc(115.0f));
	}

}
