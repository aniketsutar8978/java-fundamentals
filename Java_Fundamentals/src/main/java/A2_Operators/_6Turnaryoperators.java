package A2_Operators;

public class _6Turnaryoperators {
	
	public static void main(String[] args)
	{
//  Turnary operator ( This is the shortcut of the if else statement) It is conditional expression 
//  Syn.===>   Datatype variable = (condition)? First expression : Second expression 		
//             System.out.println(variable);------> Output=  if the condition is fulfill then first expression otherwise second expression.
      
// Rules ===> 
		// 1) both expression should have same datatype. 
		// 2) Ternary operator statement result should be store in expression value datatype.
		 
		int age= 19;
		String result = (age>=18)?"Yes":"No";
		System.out.println("Eligible For vote="+ result); // We have to print that result.	
		System.out.println("=====================================================");
		
		
		int exp= 3; double salary = 40000;
		double finalsalary = (exp>=5)? salary+5000:salary+2000;
		System.out.println("Finaly Salary="+ finalsalary);
		System.out.println("=====================================================");
   
		
		int g=29, n=40;
		boolean Result1 = (g<=n)? true: false;
		System.out.println(Result1);
		System.out.println("=====================================================");

		
        int a=10; int b=20;
		int max = (a>b)? a:b;
		System.out.println(max);
		System.out.println("=====================================================");

		int marks = 90; 
	    char res = (marks>90)? 'A': (marks>70)? 'B' : (marks>60)? 'c': 'F';
	    System.out.println(res);
		
		 	
  }
}