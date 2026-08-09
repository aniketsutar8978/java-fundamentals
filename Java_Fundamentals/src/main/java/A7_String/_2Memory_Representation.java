package A7_String;

public class _2Memory_Representation {

	// Instance Variable with value
	double salary = 40000;
	
	// Instance Variable
	int id;
	
	// Static Variable
	static char division = 'a';
	
	// Constructor
	_2Memory_Representation() {
		System.out.println("This is constructor");
	}
	
	// Instance Method
	void m1() {
		System.out.println("This is the instance method");
	}
	
	// Static Method
	static void m2() {
		System.out.println("This is the static method");
	}
	
	public static void main(String[] args) {
		
		// Object
		_2Memory_Representation obj = new _2Memory_Representation();
		
		// The variables which is created using new key word is called reference variable
		
		// 1) HEAP 
		// Instance variable value. (This values will be stored into object)
		// Object 
		//==========================================================================================================
		
		
		
		// 2) STACK
		// variable name
		// Reference variable name
		// Constructor name
		// Method name
		//==========================================================================================================

		
		
		// 3) METHOD
		// Static variable value
		// Local variable value
		// Constructor code
		// Method code
		//==========================================================================================================
		
		
		// 4) PC (Program count)
		// Program count
		//==========================================================================================================

		
		// 5) Native 
		// Allocate memory to non java code
		//==========================================================================================================

		 
		
		// 6) SCP (String constant pool) (Only for String)
		
		// 1) String creating by literal
		// The value of String variable will store in SCP 
		// if you create same variable in SCP it remain same  SCP can't create duplicate string variable in scp
		// ex.
		String name =  "Aniket"; // Creating this way string will get memory in SCP
		String name2 = "Aniket"; // Creating this way string will get memory in SCP
		// == method will not check content it will check address
		System.out.println(name==name2); // You will get the answer ad true 
		// because == is used to check address and in scp same value will get same memory thats why we will get true
		
		
		
		// 2) String creating by new key word 
		// This will get memory in heap area and SCP both 
		// It will get memory in heap because new keyword
		// if we create duplicate String, heap can create new duplicate variable and give the new memory
		// The value of String will get memory in SCP also
		// In SCP there is no reference variable to value (Yogesh) JVM will give the reference variable to the value in SCP
		// If we create same String, SCP can't create new duplicate variable it gives the same variable memory. 
		String s1 = new String("Yogesh");
		String s2 = new String("Yogesh");
		StringBuffer sbf = new StringBuffer("Aniket");
		StringBuffer stb = new StringBuffer("Anruddh");
		// Heap will give the new memory to the duplicate variables
		// SCP will not give the new memory to duplicate variables it gives the same memory to duplicate variables
		// SCP is used to save memory because it gives the same memory to the duplicate values;
		System.out.println(s1==s2); // You will get false
		// == method will not check content it will check address
		// here even if the content is same will get false beacause 
		// the memory of this values will get different address in heap
		
		
		

		
	}
	

}
