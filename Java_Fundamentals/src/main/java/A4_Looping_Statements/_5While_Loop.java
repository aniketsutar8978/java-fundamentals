package A4_Looping_Statement;
import java.util.Scanner;
public class _5While_Loop {
	
	public static void main(String[] args)
	{  
		System.out.println("Print Aniket 10 time using while loop");
		int i = 1;
		while (i <= 10) {
			System.out.println("Anikt");
			i++;
		}
		System.out.println("=========================================================");
		
		
		
		System.out.println("Print 1 to 10 no using while");
		int b = 1;
		while (b <= 10) {
			System.out.println(b);
			b++;
		}
		System.out.println("=========================================================");

		
		
		
		
		System.out.println("Print evan no between 1 to 10");
		int c = 1;
		while (c <= 10) {
			if (c % 2 == 0) {
				System.out.println(c);
			}
			c++;
		}
		System.out.println("=========================================================");

		
		
		System.out.println("Print odd nu between 1 to 10");
		int d = 1;
		while (d <= 10) {
			if (d % 2 != 0) {
				System.out.println(d);
			}
			d++;
		}
		System.out.println("=========================================================");

		
		
		System.out.println("Prnt the table of 5");
		int e = 1;
		while (e <= 10) {
			System.out.println(5 + "*" + e + "=" + 5 * e);
			e++;
		}
		System.out.println("=========================================================");

		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num of wich you want table");
		int tbl = sc.nextInt();
		if (tbl <= 0) {
			System.out.println("Invallid no");
		} else {
			int a = 1;
			while (a <= 10) {
				System.out.println(a * tbl);
				a++;
			}
		}
		System.out.println("=========================================================");

		
		
		System.out.println("Enter the sum of 1 to 10 num");
		int sum = 0;
		int f = 1;
		while (f <= 10) {
			sum = sum + f;
			f++;
		}
		System.out.println("Total sum is =" + sum);
		System.out.println("=========================================================");

		
		
		System.out.println("Enter the no of wich you want factorial");
		int num = sc.nextInt();
		int fact = 1;
		int g = 1;
		while (g <= num) {
			fact = fact * g;
			g++;
		}
		System.out.println(fact);
		System.out.println("=========================================================");

		
		System.out.println("Enter the number wich you want sum");
		int no = sc.nextInt();
		int sn = 0;
		int l = 1;
		while (l <= no) {
			sn = sn + l;
			l++;
		}
		System.out.println(sn);
		System.out.println("=========================================================");

	    
		int cpin = 1234;
		int a = 1;
		while (a <= 3) {
			System.out.println("Enter your pin");
			int ypin = sc.nextInt();
			if (ypin == cpin) {
				System.out.println("Access granted");
				break;
			} else {
				System.out.println("Incorrect passward atempts left" + "  " + (3 - a));
				if (a == 3) {
					System.out.println("Your ac has been blocked due to 3 wrong attempts");
				}
			}
			a++;
		}
		System.out.println("=========================================================");

	    
	    
	    
	    
		String uname = "aniket8978";
		String pass = "Aniket0102";

		int m = 1;
		while (m <= 3) {
			System.out.println("Enter your userid");
			String use = sc.next();
			System.out.println("Enter your password");
			String pwd = sc.next();

			if (use.equals(uname) && pwd.equals(pass)) {
				System.out.println("Logine successfull");
				break;
			} else {
				System.out.println("Invallid userid or password pleas try again ");
			}
			if (m == 3) {
				System.out.println("Your ac has been blocked due to 3 wrong attempts");
			}
			m++;
		}
		System.out.println("=========================================================");
 
	    
		
		int bankbalance = 50000;

		int nu = 1;
		while (nu <= 4) {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check balance");
			System.out.println("4. Exit");
			System.out.println("Select your choice");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the amount to deposit");
				int amount = sc.nextInt();
				if (amount > 0) {
					System.out.println("Deposit successful");
					bankbalance += amount;
					System.out.println("Final bankbalance =" + bankbalance);
				} else {
					System.out.println("Invalid amount");
				}
			} else if (choice == 2) {
				System.out.println("Enter the amount to withdraw");
				int amount = sc.nextInt();
				if (amount > 0) {
					if (amount <= bankbalance) {
						System.out.println("Withdraw successful");
						bankbalance -= amount;
						System.out.println("Final bankbalance=" + bankbalance);
					} else {
						System.out.println("Insufficient balance");
					}
				} else {
					System.out.println("Invallid amount");
				}
			} else if (choice == 3) {
				System.out.println("Your bankbalance is = " + bankbalance);
			}

			else if (choice == 4) {
				System.out.println("Thank you");
			} else {
				System.out.println("Invalid choice5");

			}
			nu++;
		}
	    
	    
	    
		
	
	}

}
