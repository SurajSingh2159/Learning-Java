package arrayProjectLearning10;

import java.util.Scanner;

public class ArrayProject {

	public static void main(String[] args) {
		System.out.print("Enter the size of diamond: ");
		Scanner rd=new Scanner(System.in);
		int size = rd.nextInt();
		System.out.print("You entered : "+ size);
		rd.close();
		
		System.out.println();

		for(int i=0; i< size; i++) {
			
			for(int j=0; j< (i-2); j++) {
				System.out.print("1 ");
			}
			System.out.println();
		}

	}

}
