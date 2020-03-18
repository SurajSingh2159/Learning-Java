package boxproject;

public class BoxClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i, j; 
for (i = 1; i <= 10; i++) 
{ 
    for (j = 1; j <= 10; j++) 
    { 
        if (i == 1 || i == 10 ||  
            j == 1 || j == 10)             
            System.out.print("*");             
        else
            System.out.print(" ");             
    } 
    System.out.println(); 
} 
	}

}
