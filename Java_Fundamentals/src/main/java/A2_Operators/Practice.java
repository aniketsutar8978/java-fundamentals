package A2_Operators;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		 
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter your marks");
	   double marks = sc.nextDouble();
	   
	   String result = (marks>=35)? "Pass" : "Fail";
	   
	   char grade = (marks>=90)? 'A' : (marks>=80)? 'B' : (marks>=70)? 'C' : 'D';
	   
	   System.out.println(result);
	   System.out.println(grade);
	   
		
	

	}

}
