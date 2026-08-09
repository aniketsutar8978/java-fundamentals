package A8_Transfer_Statement;

public class _2Continue {
	
	public static void main(String[] args)
	{
		// continue is used skip that value which match the condition of continue.
		
		for (int a = 1; a <= 10; a++) {
			if (a == 3 || a == 5) {
				continue;
			}
			System.out.println(a);
			// here we should we 1 to 10 values but just because we used continue at the 3
			// and 5 thats why continue will skip the 3 and 5
		}
		
		
		int b = 1;
		while (b <= 10) {
			if (b == 5)   // in while loop we need to use another updation in condition
			{             // because after the continue updation will not work
				b++;      // here b==5 then b will become 6 and b == 5 will skip
				continue;
			}
			System.out.println(b);
			b++;
		}
		// Whenever we want to use continue we should prefer 
		
		
		int mult = 3;
		for (int i = 1; i <= 10; i++) {
			if (i == 9) {
				continue;
			}
			System.out.println(mult * i);
		}
		
		
	}

}
