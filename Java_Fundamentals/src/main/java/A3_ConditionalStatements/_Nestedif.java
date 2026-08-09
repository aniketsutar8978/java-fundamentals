package A3_Conditionalstatement;

import java.util.Scanner;

public class _Nestedif {

	public static void main(String[] args) {
		double bankbalance = 40000;

		System.out.println("1.Deposit");
		System.out.println("2.Withdraw");
		System.out.println("3.Check balance");
		System.out.println("4.Exit");
		System.out.println("Enter your choice");

		Scanner sc = new Scanner(System.in);

		int choice = sc.nextInt();

		if (choice == 1) {
			System.out.println("Enter amount");
			double amount = sc.nextDouble();
			if (amount > 0) {
				bankbalance += amount;
				System.out.println("Deposit Successfull");
				System.out.println("Final bankbalance=" + bankbalance);
			} else {
				System.out.println("Invalid amount");
			}

		}

		else if (choice == 2) {
			System.out.println("Enter amount");
			double amount = sc.nextDouble();
			if (amount > 0) {
				if (amount < bankbalance) {
					System.out.println("Withdrawl Successfull");
					bankbalance -= amount;
					System.out.println("final balance=" + bankbalance);
				} else {
					System.err.println("Insufficint balance");
				}
			} else {
				System.err.println("Invallid amount");
			}
		}

		else if (choice == 3) {
			System.out.println("Enter Password");
			int password = sc.nextInt();
			if (password == 8978) {
				System.out.println("Your balance is=" + bankbalance);
			}

			else {
				System.err.println("Wrong Password");
			}
		}

		else if (choice == 4) {
			System.out.println("Exited");
		}

		else {
			System.err.println("Invallid choice");
		}
		System.out.println("==============================================================================");

		// Set user id and password
		System.out.println("Set your email ");
		String email = sc.next();
		System.out.println("Set your password");
		String pass = sc.next();
		if (email.contains("@gmail.com") || email.contains("@yahoo.com")) {
			if (pass.length() > 0) {
				System.out.println("Login successful");
			}
		}
	 
	
	}
	
}
