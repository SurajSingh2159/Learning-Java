package projectSum;

public class ClassSum { 
	  
    public int Classsum(int x, int y) 
    { 
        return (x + y); 
    } 
  
    public int Classsum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
  
    public double Classsum(double x, double y) 
    { 
        return (x + y); 
    } 
  
    public static void main(String args[]) 
    { 
        ClassSum s = new ClassSum(); 
        System.out.println(s.Classsum(1, 2)); 
        System.out.println(s.Classsum(1, 2, 3)); 
        System.out.println(s.Classsum(1.5, 2.5)); 
    } 
} 