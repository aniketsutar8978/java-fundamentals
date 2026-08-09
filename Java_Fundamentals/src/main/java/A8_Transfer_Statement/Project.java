package A8_Transfer_Statement;
import java.util.Scanner;
public class Project {
	
	public static void main(String[] args) {
		
		// MINI BANKING SYSTEM USING SWITCH CASE
		
		Scanner sc =  new Scanner(System.in);
		double balance = 50000;
		
		int a = 1;
		while (a < 3) {
			System.out.println("1) Cheack Balance");
			System.out.println("2) Depodit Money");
			System.out.println("3) Withodraw Money");
			System.out.println("4) Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			double amount = 0;
			double final_balance = 0;

			switch (choice) {

			case 1:
				System.out.println("your balance is: " + balance);
				System.out.println("========================================================");
				break;

			case 2:
				System.out.println("Enter the amount to deposit");
				amount = sc.nextDouble();
				if (amount > 0) {
					final_balance = balance + amount;
					System.out.println("Deposit successful");
				} else {
					System.out.println("Invalid amount please enter the valid amount");
				}
				break;

			case 3:
				System.out.println("Enter the amount to withdraw");
				amount = sc.nextDouble();
				if (amount > 0) {
					if (amount < balance) {
						final_balance = balance - amount;
						System.out.println("Withdraw successful");

					} else {
						System.out.println("Insufficint funds");
					}
				} else {
					System.out.println("Invalid amount please enter the valid amount");
				}
				break;

			case 4:
				System.out.println("Thank you for visiting, visit again...");
				break;
				
			default:
				System.out.println("Invalid choice pleas enter the valid choice");
				System.out.println("========================================================");
				a++;
			}
			System.out.println("Yor acout balnce was: " + balance);
			System.out.println("Withdraw amount is  : " + amount);
			System.out.println("Final Balance is    : " + final_balance);
			System.out.println("========================================================");
		}
		
		
		
		
	}

}
