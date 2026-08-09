package A4_Looping_Statement;
import java.util.Scanner;
public class _9Do_While_loop {
	
	public static void main(String[] args)
	{   
		
		do
		{
			System.out.println("1) Sayara Rs200");
			System.out.println("2) Salar Rs400");
			System.out.println("3) KGF Rs500");
			System.out.println("4) Pushpa Rs400");
			System.out.println("5) Exit");			
			System.out.println("Enter your choice");
			Scanner sc = new Scanner(System.in);
			int choice= sc.nextInt();
			int amount =  0;
			double disc = 0;
			double final_amount = 0;
			int tprice=0;	
		
			if(choice==1)
			{
				System.out.println("You have selected Syara");
				tprice=200;	
			}
			
			else if(choice==2)
			{
				System.out.println("You have selected Salar");
				tprice=400;
			}
			else if(choice==3)
			{
				System.out.println("You have selected kgf");
				tprice=500;	
			}
			else if(choice==4)
			{
				System.out.println("You have selected Pushpa");
				tprice=400;
		    }
			else
			{
				System.out.println("Invalid choice");
			}
			
			System.out.println("Enter num of ticket");
			int nt=sc.nextInt();
			amount = tprice*nt;
			System.out.println("Your amount is = " +amount);
			
			
			if(amount>=2000)
			{
				System.out.println("Discount applied 10%");
				disc = amount*0.1;
			}
			else if( amount >=1000)
			{
				System.out.println("Discount applied 5%");
				disc = amount*0.05;
			}
			else if( amount>=500)
			{
				System.out.println("Discount applied 2%");
				disc = amount*0.02;
			}
			else
			{
				System.out.println(" No discount");
			}
			final_amount = amount-disc;
			System.out.println("Discount amount = "+ disc);
			System.out.println("Final amount = "+ final_amount);
			System.out.println("=======================================");
		}
		while(true);		
	}

}
