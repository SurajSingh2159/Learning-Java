package toarraymethod;

import java.util.*;

public class ToArrayMethod {

	public static void main(String[] args) {
	ArrayList<Double> Accounts=new ArrayList<Double>();
	Accounts.add(10000.00);
	Accounts.add(20000.00);
	Accounts.add(30000.00);
	Accounts.add(40000.00);
	Accounts.add(50000.00);
	Accounts.add(60000.00);
	//Printing the values of arraylist objects Accounts
	for(Double n:Accounts)
	{
		System.out.println(n);
	}// End of loop
	
	// USING TOARRAY() METHOD OF ARRAYLIST CLASS TO COPY ELEMENTS OF ARRAYLIST OBJECT INTO AN ARRAY
	Double arr[]=new Double[Accounts.size()];
	Accounts.toArray(arr);// Copies all the element of Arraylist object Account into array arr
	//Printing the values of array arr
	System.out.println("----------------------");
	for(Double n:arr)
		System.out.println(n);
	}//End of Loop

}//End of Method main
