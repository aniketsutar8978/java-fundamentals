package A3_Conditionalstatement;
import java.util.Scanner;
public class _2_If_else_statement {
	public static void main(String[] args)
	{ 
		// If else statement:=
		// If else statement is faster than if statement
		// in this statement if the condition is true then if block output will print and if the condition is false then els block output will print.

		
		int age = 27;                                    
		if (age>=18) {System.out.println("Young");}     
		else {System.out.println("Teen");}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Exp");
		int exp= sc.nextInt();
		if(exp>=5) {System.out.println("Salary Hike=30%");}
		else {System.out.println("Salary Hike=10%");}
		
	   }
		
	}


