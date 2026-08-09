package A6_Typecasting;

public class _2Chartypecasting {
	
	public static void main(String[] args)
	{
		// Type casting of Char 
		
//      byte, short and int to char (Implicit) 
//      We can not do Implicit type casting directly 
//      To do implicit type casting we have make variables final
//      Otherwise we have to convert it explicitly
//		byte a = 97;
//		short a = 97;  
//		int a = 97;
//		char b = a;   // We can't convert like this because variables can be reinitialized thats why or we can do final variables
//		char b = a;
//		char b = a;
//      final byte a = 97;
//      final short a = 97;	
//		final int a = 97;
//      char b = a;  // We can do like this because we cant reinitialize final variables.
//      char b = a;		
//		char b = a;
		
		char a = 97;
		System.out.println(a);

		//long, float, double to char (Explicit)
		char b = (char) 65.350f;
		System.out.println(b);
	
		// char to byte and short   (Explicit)
		char c= 'A';
		
		byte d= (byte)c;     
		short e= (short)c;   
		System.out.println(d);
		System.out.println(e);
		
		// char to int, long, float, double (Emplicit)
		char f= 'B';
		
		int g    = f;
		long h   = f;
		float i  = f;
		double j = f;
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		
		
		// ASCII - American standard code information interchange
		
		
	}
		
		

}
