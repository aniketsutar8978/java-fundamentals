package A4_Looping_Statement;

public class _8Do_While_Loop {
	
	public static void main(String [] args)
	{
		// Do while loop is exit control loop
		
		System.out.println("1) Enter name 10 time using the do while loop");
		int a = 1;
		do {
			System.out.println("Aniket");
			a++;
		} while (a <= 5);
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		System.out.println("2) Enter name 1 time by using do while loop");
		int b=6;
		do
		{
			System.out.println("Aniket");   // Here our condition is not true still we will get Aniket for 1 time because here we print first then at down side we will apply condition.
			a++;
		}                                   // Whenever we want at least 1 time output even if the condition is fall then we will use do while loop.
		while(b<=5);  // Semicolun used to end this program.
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		
		System.out.println("3) Print 1 to 10 num by using the do while loop");
		int c = 1;
		do {
			System.out.println(c); // here you can print any thing.
			c++;
		} while (c <= 10);
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		System.out.println("4) Print the odd num between 1 to 10");
		int d=1;
		do {
			if (d % 2 != 0) {
				System.out.println(d);
			}
			d++;
		} while (d <= 10);
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		
		System.out.println("5) Enter the table of 7");
		int e = 7, f = 1;
		do {
			System.out.println(e * f);
			f++;
		} while (f <= 10);
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		
		
		System.out.println("6) Enter the sum of 5 to 10 no");
		int sum = 0, g = 5;
		do {
			sum = sum + g;
			g++;
		} while (g <= 10);
		System.out.println(sum);
		System.out.println();
		System.out.println("=========================");
		
		
		
		
		
		System.out.println("7) Enter the Factorial of 7");
		int fact = 1, h = 1;
		do {
			fact = fact * h;
			h++;
		} while (h <= 7);
		System.out.println(fact);
		System.out.println();
		System.out.println("=========================");
		
	}

}
