package A2_Operators;
import java.util.Scanner;  // Scanner class is available in java.util package. so first import that from 
public class Scannerclass {
	public static void main(String[] args)
	{
		// Scanner class is used to get vales from user
		// To use the Scanner class we need to create object of scanner class
	    // (Create object of scanner class )
		 Scanner sc = new Scanner(System.in); //(Scanner= class, sc= object name, new= will allocate memory to object, System.in= to get information from system)
		
		 System.out.println("Enter your name:");
		 String  name = sc.next();
	     System.out.println("Your name is:"+ name);
	     
	     
	     System.out.println("Enter your age:");
	     int age = sc.nextInt();
	     String result= (age>=18)? "Eligible for vote": "Not eligible for vote";
	     System.out.println("Vote="+ result);
	    
	     
	     // Scanner class Methods (To read the different types of data from console we need to use scanner class method)
	     //sc.nextByte()
	     //sc.nextShort
	     //sc.Int()
	     //sc.nextLong()
	     //sc.nextFloat()
	     //sc.nextduble()
	     //sc.nextBoolean
	     //sc.next()  // For String
	     //sc.next().CharAt(0) // To get first cahr we have to write 0 for second 1...... (It follows indexing)
	}

}
