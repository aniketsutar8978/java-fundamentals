
package A2_Operators;

import java.util.Scanner;

public class _7TurnaryProject {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter you marks");
		int marks = sc.nextInt();
		
		String result = (marks>35)? "Pass" : "Fail";
		
		char grade = (marks>90)? 'A' : (marks>80)? 'B' : (marks>70)? 'c': (marks>35)? 'D' : 'F';
		
		String scl = (marks>85)? "Full Scholarship" : (marks>60)? "Half Scholarsjip" : "No Scholarship";
		
		String remark = (marks>95)? "Exlent" : (marks>80)? "Good" : "Need Improvement";
		
		System.out.println(marks);
		System.out.println(result);
		System.out.println(grade);
		System.out.println(scl);
		System.out.println(remark);
		
		
		
		
	}
}
