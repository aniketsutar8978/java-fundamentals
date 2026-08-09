package A2_Operators;

public class _3Logicaloperators {
	
	public static void main(String[] args)
	{
		int a = 29; int b = 50;
		
		// Logical operators are used to check multiple condition 
		
		// && (logical and) in this operator all condition should be fulfill.
		System.out.println("A Result="+(a>=30 && b>=40)); // false && false ---> false
		System.out.println("B Result="+(a<50  && b>60));  // true  && false ----> false
		System.out.println("C Result="+(a==29 && b==50)); // true  && true ----> true
		System.out.println("==========================================================");
		
		
		// || (logical or) in this operator at least single condition should be fulfill out of all condition..
		System.out.println("D Result="+(a>40  || b<60));   // false || true ----> true
		System.out.println("E Result="+(a<=10 || b<=10));  // false || false ----> false
		System.out.println("F Result="+(a==29 || b!=20));  // true  || true ----> true
		System.out.println("==========================================================");

		
		// ! (logical not ) this operator gives opposite result.
		System.out.println("G Result="+!(a>b));    // Here our condition is false but we will get true 
		System.out.println("H Result="+!(a>=20));  // Here our condition is true but we will get false
		System.out.println("I Result="+!(a==29));  // Here our condition is true but we will get false 
		System.out.println("==========================================================");

		
		
		// Interview Question 
		int d=10, y=100, c=150;
		// 1)
		System.out.println(d>y || y<c && d<c);//==> true // Here we have to check first and conditions (&& has higher priority then ||) 
		//                false||   true      ==> true
		
		
		// 2)
		int f=2,g=3;
		System.out.println(f++==2 || ++g==4);
		//                  true  || true
		
		// 3) 
		int x=0;
		System.out.println(false && (x++>0));
		//                  false && false
		
		
		
		
		}
	}




