/*length  concat  toUppercase  toLowercase  trim
  substring  replace  startswith endswith  isEmpty indexOf charAt */

package someStringMethod;

import java.util.*;
public class SomeStringMethods {

	public static void main(String[] args) {
		int i;
		String Myname;
		String name="     ricks        ";
		String k= "Suraj kumar singh";
		Scanner rd=new Scanner(System.in);
		System.out.println("Enter your Name");
		Myname=rd.nextLine();
		i=Myname.length();
        System.out.println("The length of the name="+i);
	    System.out.println(Myname.concat(" CONDEMNED"));
	    System.out.println(Myname.toUpperCase());
	    System.out.println(Myname.toLowerCase());
	    System.out.println(name.trim());// TRIM METHOD WILL ELIMINATE ALL THE LEADING AND TRAILING WHITE SPACES
	    System.out.println(Myname.trim()+" is my sister");
	    System.out.println(k.substring(4));
	    System.out.println(k.substring(4,9));
	    System.out.println(k.replace("kumar", "Prasad"));
	    System.out.println(k.replace("s", "R"));
	    System.out.println(k.startsWith("Suraj"));//Returns Boolean Valur
	    System.out.println(k.endsWith("Ring"));//Returns Boolean Value
	    System.out.println(k.isBlank());//Returns Boolean Value
	    System.out.println(k.isEmpty());//Returns Boolean Value
	    System.out.println(k.indexOf("i"));
	    System.out.println(k.charAt(13));
	    
	}

}
