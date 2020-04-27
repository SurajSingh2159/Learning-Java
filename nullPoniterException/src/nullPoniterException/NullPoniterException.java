package nullPoniterException;

public class NullPoniterException {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10};
		for(int i=0;i<=4;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);;
		}
      arr=null;
      try
      {
      System.out.println(arr[0]);
      }
      catch(NullPointerException nr)
      {
    	  System.out.println(nr);
      }
      System.out.println("Coronavirus Error");      }

}
