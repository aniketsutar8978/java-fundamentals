package A5_Array;
import java.util.Scanner;
public class _3Array2D {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("How to create 2d array");
		int value[][]= new int[3][4];
		// First value  ([3]) shows the row length/ number of row  and second value ([4]) is shows the number of column.
		System.out.println("======================================================================================");

	
//    	System.out.println("How to create 2d array with value");
//		int marks[][]= {{20,30,50,40},{25,58,65,45},{45,25,75,89}};

		
		System.out.println("How to get values from user for this 2d value array");
		for (int a = 0; a < value.length; a++) {
			for (int j = 0; j < value[a].length; j++) {
				System.out.println("Enter the value at position of: " + a + j);
				value[a][j] = sc.nextInt();
			}
		}
		System.out.println("======================================================================================");


		System.out.println("Hoe to print this value array");
		for (int a = 0; a < value.length; a++) {
			for (int j = 0; j < value[a].length; j++) {
				System.out.print(value[a][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("======================================================================================");

		
		
		
		
		

		
		

		
		
		
		
	}

}
