package A2_Operators;

public class _5Unaryoperators {
	
	public static void main(String[] args)
	{
		//  UNARY OPERATORS ARE THE OPERATORS WICH WORKS ON SINGLE OPERAND
		
// 1)  + UNARY PLUS  ( it change the behaviour of value) 
		
		int a= 10, b=-20;
	    a=+a; b=+b;              
		System.out.println(a);  
		System.out.println(b);   
		System.out.println("===============================================================");
		
// 2) - UNARY MINUS ( it change the behaviour of value)		
		
		int x= 10, y= -20;
		x=-x; y=-y;
		System.out.println(x);
		System.out.println(y);
		System.out.println("===============================================================");

		
// 3) ++ Increment  (increase value by 1)

		// a) Post increment  (increase after variable) (In Post increment increase value later.)
		int c=10;
	    //	System.out.println(c++); ----> 10      (hear value has increased but not able to print)
	    c++;    // ===> here value increased                               
	    System.out.println(c);  // 11
		System.out.println("===============================================================");


        // b) Pre increment (increase before variable)  (In pre increment increase value first then print.).
		int d=20;
	    // System.out.println(++d); -----> 21      (here value has been increased first then print.)
		++d;   // ===> here value increased 
		System.out.println(d);  // 21
		System.out.println("===============================================================");

		
// 4) -- Decrement (decrease value by 1)
		
		// a) Post decrement (decrease  after variable) (In Post increment decrease value after print.)
		int e = 40;
	    // System.out.println(e--) ----> 40      (hear value has decrease but not able to print)	
	    e--;
	    System.out.println(e);
		System.out.println("===============================================================");

	    
	    // b) Pre decrement (decrease before variable) (In Pre decrement decrease value first then print.)
		int f=50;
		// System.out.println(--f) -----> 49     (here value decreased first then print)
		--f;
		System.out.println(f); 
		System.out.println("===============================================================");

	}

}
