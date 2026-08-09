package A3_Conditionalstatement;
import java.util.Scanner;
public class _3_If_elseif_elseif_statement {
	public static void main(String []args)   
	{   
		// if elseif elseif else....Statement:=
		
		//  In this statement if the  (if condition) is true then if block output, if false then check next else if condition 
		//  if that is true will get that block output, if wrong will check next else if condition if that true will get that 
		//  block output in the end if all condition false then we will get else block output. 
		
		Scanner sc= new Scanner(System.in);    
		System.out.println("Enter your marks");
		double marks = sc.nextDouble();
		if(marks>100 || marks<0) {System.out.println("Invallied marks");}
		else if(marks>=90) {System.out.println("Grade=a+");}
		else if(marks>=70) {System.out.println("Grade=b+");}
		else if(marks>=50) {System.out.println("Grade=c+");}
		else if(marks>=35) {System.out.println("Grade=d+");}
		else {System.err.println("Fail");}
		System.out.println("===================================================================");
		
		
		
		 
		System.out.println("Enter your Pprice");
		double Pprice=sc.nextDouble();
				
		if(Pprice>=10000)
		{
			System.out.println("Discount=10%");
			double discount =Pprice*0.1;
			System.out.println("You got discount of="+discount+"Rs");
			System.out.println("Final Price="+(Pprice-discount));
		}
		else if(Pprice>=7000)
		{
			System.out.println("Discount=5%");
			double discount= (Pprice*0.05);
			System.out.println("You got discount of="+discount+"Rs");
			System.out.println("Final Price="+(Pprice-discount));
		}
		else if(Pprice>=5000)
		{
			System.out.println("Discount=2%");
			double discount=(Pprice*0.02);
			System.out.println("You got discount of="+discount+"Rs");
			System.out.println("Final Price="+(Pprice-discount));
		}
		else
		{
	        System.err.println("No Discount");
		}
	}

}


