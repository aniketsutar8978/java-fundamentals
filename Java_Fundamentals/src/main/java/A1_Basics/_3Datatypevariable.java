package A1_Basics;

public class _3Datatypevariable {
	
public static void main(String[] args)
{
	    // 1 byte = 8 bit
		// 1 kb   = 1024 byte
		// 1 mb   = 1024 kb
		// 1 gb   = 1024 mb
		// 1 tb   = 1024 gb
	
	// Primitive Datatype (Fixed memory size) 
	// Primitive datatype stores actual values
	byte age= 5;                    // 1 byte
	short id=100;                   // 2 byte
	int marks=10, number=20;        // 4 byte
	long num=7030028097l;           // 8 byte
	float salary=40000.00f;         // 4 byte
	double value=5678.3567;         // 8 byte
	char gender='M';                // 2 byte
	boolean Result= true;           // 1 bit
	
	// Non primitive data types (Don't have fixed memory size)
	// Non primitive data  types store references
	String Name="Aniket";     // not fix (non primitive datatype)  String, array, class and interface are the non primitive datatype.
    int arr[] = new int[5]; 
    // Classes 
    // Interfaces 
    // Collection 
	
	
	System.out.println("Age="+age);
	System.out.println("id="+id);
	System.out.println("Marks="+marks);
	System.out.println("Number="+number);
	System.out.println("Num="+num);
	System.out.println("Salary="+salary);
	System.out.println("Value="+value);
	System.out.println("Gender="+gender);
	System.out.println("Name="+ Name);
	System.out.println("Resul=" + Result );
	

	
	
	
// To get the output in red color we will use err instead of out
	
	System.err.println("Aniket Anil Sutar");     // Check output output will be the red color
	
  }
	}

