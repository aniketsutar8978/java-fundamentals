  package A4_Looping_Statement;
import java.util.Scanner;
public class _1For_loop {
	
	public static void main(String[] args)
	{
		// Loopig statement are used to repeat program execution on the basis of condition
		
		// Infinite loop:=
		// An infinite loop is loop that run forever because its condition never becomes false;
		
		
		// 1) For loop 
		// syx = for( Initialization; Condition; Updation
		//          {System.out.println("Whatever we want to print"}
		// ex.1)
		System.out.println("Print Aniket 10 times");
		for(int a= 1; a<=10; a++)
		{                                                // First of all we have do initialization to start
			System.out.println("Aniket");                // then we have to give condition to end 
		}                                                // then if the condition is true then code will print
	                                                   	 // then updation will happen and code run again until condition will not become fall
		
		//ex.2)
		System.out.println("Print 1 to 10" );
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
		}
		
		  
	    // ex.3)
		System.out.println("Print Aniket 10 times");
		for(int j= 10; j>=1; j--)
		{
			System.out.println("Aniket");
		}
		
		
		//ex.4)
		System.out.println("Print even num btw 1 to 10");
		for (int evn = 1; evn<=10; evn++)
		{
			if(evn%2==0) 
			{
				System.out.println(evn);
			}	
		}
		
		
	    //ex.5)
		System.out.println("Print odd no btw 1 to 10 ");
		for(int odd = 1; odd<=10; odd++)
		{
			if(odd %2!=0)
			{
				System.out.println(odd);
			}
		}
		
		
	   //ex.6)
		System.out.println("Print the table of 5");
		int abc=5;
		for(int t=1; t<=10; t++)
		{
			System.out.println(abc*t);
		}
		
		
		// ex.7)
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wich you want table");
		int num= sc.nextInt();
		if (num<=0)
			{
				System.out.println("Invallid Number");
			}
			else
			{
				for( int m=1; m<=10; m++)
				{
					System.out.println(num + "*" + m + "=" + num*m);
				}
			
			}
		
		
		// ex.8)
		System.out.println("Enter the sum of 1 to 10");
		int sum = 0;
		for(int ac=1; ac<=10; ac++)
		{ 
		   sum = sum+ac;   
	    }
		System.out.println("Total sum ="+ sum); 
		
		
		
		// ex.9)
		System.out.println("Enter the sum of even no between 1 to 10");
		int sum2 = 0;
		for (int ad = 1; ad <= 10; ad++) {
			if (ad % 2 == 0) {
				sum2 = sum2 + ad;
			}
		}
		System.out.println(sum2);
	    
	    
	    
	    // ex.10)
	    System.out.println("Enter the factorial of  5 "); // fact of 5 = 1*2*3*4*5
	    int fact= 1;
	    for (int fc=1; fc<=5; fc++)
	    {
	    	fact= fact*fc;
	    }
	    System.out.println(fact);
	
	
	    // ex.11)
	    System.out.println("Enter the noumber of wich you want factorial");
	    int of = sc.nextInt();
	    int bv = 1;
	    for(int bt=1; bt<=of; bt++)
	    {
	    	bv=bv*bt;
	    }
	    System.out.println(bv);
	    
	    
		// ex.12)
		System.out.println("print the qubes of 11 to 20 numbers");
		for (int a = 11; a <= 20; a++) {
			System.out.println(a * a);
		}
	    
	    
		System.out.println("Alphabet pattern");
		for (int b = 65; b <= 69; b++) {
			for (int j = 1; j <= 4; j++) {
				char ch = (char) b;
				System.out.print(ch);
			}
			System.out.println();
		}
	    
	    // Any number of variable we can initialize in for loop
	    // We can write only one condition in for loop
	    // if we want write multiple condition we need use logical and or logical or
	    // We can write any number of increment or decrement 
	    // Condition ---> increment should required and also of the same variable of condition. otherwise cod will infinite.
	    
	    for(int hg= 1, jk= 1; hg<=10; hg++,jk++)
	    {
	    	System.out.println(hg+ " "+ jk);
	    	
	    }
	}

}

