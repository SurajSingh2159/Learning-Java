package overloadproject;

public class Test { 
	  
    public static void main(String[] args) 
    { 
        System.out.println("H"); 
        Test.main("G"); 
    } 
  
    public static void main(String arg1) 
    { 
        System.out.println("Hi, " + arg1); 
        Test.main("D", "M"); 
    } 
    public static void main(String arg1, String arg2) 
    { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
} 