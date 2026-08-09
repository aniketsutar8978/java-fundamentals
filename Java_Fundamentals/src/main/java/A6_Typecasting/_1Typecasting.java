package A6_Typecasting;

public class _1Typecasting {
	

	public static void main(String[] args)
	{
		// Typecasting :- Converting one data type value into another data type value is called Typecasting.
		// in type casting there is two type of typecasting 
		
		// 1) Emplicit typecasting:- Converting small data type value into large data type value is called emplicit typecasting
		// ex:- byte--> short--> int--> long--> float--> double
		// Compiler is responsible for emplicit typecasting (change data type automatically with the help of compiler)
		// In emplicit data type we dont lose any data.
		
		byte   b = 10;
		short  s = b;
		int    i = s;
		long   l = i;
		float  f = l;
		double d = f;
		
		System.out.println(d);

		
		// 2) Explicit typecasting:- Converting larger data type into smaller data type is called explict.
		// ex. double--> float--> long--> int--> short--> byte
		// Developer is responsible for explicit type casting
		// in explicit data type we can lose data.
		
		
		double  ab = 45000.40;
		float   cd = (float)ab;
		long    ef = (long)cd;
		int     gh = (int)ef;
		short   ij = (short)gh;
		byte    kl = (byte)ij;
		
		System.out.println(cd); 
		System.out.println(ef); // here we have lose data (long can not contain  decimal value)
		System.out.println(gh); // lose data int also can not contain decimal values
		System.out.println(ij); // lose data (out of short range)
		System.out.println(kl); // lose data (out of byte range)
		
		
		// Rules of java
	    // 1) in byte and short data type we can not store any arithmetic operation of any data type. 
		// we can store in int long float double.
		//ex.
		byte ani=10;
		short yog=20;
		byte roh= 2;
		long prem= 3;
		// byte addition = ani + yog; ( we will get error)
		// short multiplication = roh * prem; ( we will get error)
		int addition = ani + yog;
		long multi = ani*yog;
		float multiplication = roh * prem; 
		double sub= ani/roh;
		System.out.println(addition);
		System.out.println(multiplication);
		System.out.println(multi);
		System.out.println(sub);
		
 	}

}
