package numberFormatException;


public class NumberFormatException {

	public static void main(String[] args) {
	/*String value="b10001";
    int num;
    try
    {
    num=Integer.parseInt(value);
    int product=num*1000;
    
    System.out.println("integer number="+num);
    System.out.println("product="+product);
    }
    catch(java.lang.NumberFormatException nr)
    {
    	System.out.println(nr);
    }
    System.out.println("SuraJ Rathore");*/
		String value="b100.101";
	    float num;
	    try
	    {
	    num=Float.parseFloat(value);
	    float product=num*1000;
	    
	    System.out.println("integer number="+num);
	    System.out.println("product="+product);
	    }
	    catch(java.lang.NumberFormatException nr)
	    {
	    	System.out.println(nr);
	    }
	    System.out.println("SuraJ Rathore");
	}

}
