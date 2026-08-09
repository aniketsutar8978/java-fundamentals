package A5_Array;
import java.util.Scanner;
public class _1Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		   Array is used to store multiple values of same data type in single variable at time.
//
//		   Data type variableName[]=new Data type[size]; ===> array indexing starts from 0


		    int marks[] = new int[5];      // Create empty array with size.
		
//         if we try to print this array using indexing we will get 0 output (Default value of int is 0)
		   System.out.println(marks[0]);   // 0
		   System.out.println(marks[1]);   // 0
		   System.out.println(marks[2]);   // 0
		   System.out.println(marks[3]);   // 0
		   System.out.println(marks[4]);   // 0

		// by default values are 0 but we can reinitialize values according to there
		// position by using array indexing.
		   marks[0] = 50;
		   marks[1] = 100;
		   marks[2] = 78;
		   marks[3] = 98;
		   marks[4] = 85;	
//	      We print values in array according to there position not according to length.		
		   System.out.println(marks[0]);   // 50
		   System.out.println(marks[1]);   // 100
		   System.out.println(marks[2]);   // 78
		   System.out.println(marks[3]);   // 98
		   System.out.println(marks[4]);   // 85
//		

		// default values of int, short, byte, long is 0;
		// default values of float and double is 0.0
		// default values of boolean is false
		// default values of char is single space
		// String is class and by default values of any class will be null so by default
		// values of String will be null.

		System.out.println("===== How to print arry values =====");
		
//                             0         1       2         3    ========>    Position of values in array
		String names[] = { "Aniket", "Anjali", "Amit", "Asmita" };  
//                             1         2       3         4  	========>	 Length of array (how many values in array)

		System.out.println("Print this array using loop");
		for (int a = 0; a < 4; a++) {   // Our loop should starts from 0 (Indexing)
			System.out.println(names[a]);
		}
		System.out.println("=======================================================");

		

//                       0  1  2  3  4  5   6   7  8  9 		   
		int rollno[] = { 7, 3, 9, 5, 2, 6, 10, 12, 9, 6 };
		System.out.println("Print all rollno using loop");
		for (int a = 0; a < rollno.length; a++) {
			System.out.println(rollno[a]);}
		System.out.println("=======================================================");


		
		

		int amount[] = { 10, 20, 30, 40 };
		for (int a = 0; a < amount.length; a++) {
			System.out.println(amount[a]);
		}
		System.out.println("=======================================================");


		
		
			
		System.out.println("===== How to get input from user for array =====");

		int amo[] = new int[5];
		System.out.println("Enter your amount");
		for (int a = 0; a < 5; a++) {
			System.out.println("Enter your amount for position of " + a);
			amo[a] = sc.nextInt();
			System.out.println(amo[a]);
		}
		System.out.println("=======================================================");

		
	
		
		
		int mrk[] = new int[5];
		System.out.println("Enter your marks");
		for (int a = 0; a < 5; a++) {
			System.out.println("Enter your marks for=" + a);
			mrk[a] = sc.nextInt();
			System.out.println("Marks at index " + a + "=" + mrk[a]);
		}
		System.out.println("=======================================================");

		

		
		
		String name[] = new String[5];
		System.out.println("Enter your names according to there positions");
		for (int a = 0; a < 5; a++) {
			System.out.println("Enter your name for the position of " + a);
			name[a] = sc.next();
			System.out.println("Name at index " + a + " = " + name[a]);
    	System.out.println("=======================================================");
		}

	}

}
