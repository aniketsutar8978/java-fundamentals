package A3_Conditionalstatement;
import java.util.Scanner;
public class _1_If_statement {
	
	public static void main(String[] args)
	{
		// Conditional statements 
		// Conditional statements are used to control the normal flow of program execution on the basics of given condition
		
		// 1) if Statement:=
		// In if statement if the condition is true then only we will get output otherwise we will not get 

		
		int age = 15;   
				
		if (age>=18) {System.out.println("Young");}
		if(age<18) {System.out.println("Minor");}
		
		int num = 15;
		if(num%2==0) {System.out.println("Even num");}
		if(num%2!=0) {System.out.println("Odd num");}
		
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter your Marks");
		int marks= sc.nextInt();
		
		if (marks>=35) {System.out.println("Pass");}
		if(marks<35) {System.out.println("Fail");}
		
	    
		System.out.println("Enter Username");
		String username= sc.next();
		
		if (username.length()<5) {System.out.println("Invallid username");return;}// Return is used to stop code if this condition is true then this code will stop here and if this condition is not true then  moves on next statement. 
		if (username.length()>=5) {System.out.println("Vallid username"); 
		
		System.out.println("Enter Password");
		String password = sc.next();
		if (password.length()<5) {System.out.println("Invallid Password");}
		if (password.length()>=5) {System.out.println("Vallid Password");} 
		
		if(username.equals("Aniket") && password.equals("12345")) {System.out.println("Login Succesful");}
		if(!username.equals("Aniket") || !password.equals("12345")) {System.out.println("Incorrect Password/ Incorrect Username");}

		} 
	  }
	}


