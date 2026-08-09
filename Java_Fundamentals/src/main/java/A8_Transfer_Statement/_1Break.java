package A8_Transfer_Statement;

public class _1Break {
	public static void main(String[] args)
	{
		// break==> break is used to end the loop. example for/ while/ do...we can use break only in loop/ in Switch 
		
		while(true)	  // here our condition is true infinite but just because using break our loop will stop and we will get only 1 time output
		{                            
			System.out.println("*");   
			break;
		}
		
		
		for (int a = 1; a <= 10; a++) {
			System.out.println(a);  // here we should get 1 to 10 no according to our condition but we have used				
			if (a == 4) {           // break at 4 thats why our loop will stop at 4
				break;
			}
		}
		
		int b = 2;
		do {
			System.out.println(b);
			if (b % 3 == 0) {
				break;
			}
			b++;
		} while (b <= 10);
		
			
		
	}

}
