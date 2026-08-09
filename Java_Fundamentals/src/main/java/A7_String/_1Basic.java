package A7_String;

public class _1Basic {
	
	public static void main(String[] args) {
		
		// 1) String is final class in java (Just because final its immutable)
		// We can not extends final class (Because we can not make any changes in final class)
		// 2) String is immutable class in java (We cant make any changes in immutable class) 
		// (mutable means the class in which we can make changes)
		// We can create the object of String because String is class
		String s1 = new String();
		
		// 3) String is non Primitive / Referenced Datatype...
		String name =  "Aniket";
		
		// 4) String is also called character array
		char alpha[] = {'a','b','c','d'};
		String s = new String(alpha);// We can the pass array in object
		System.out.println(s); // We can print the object
		 
		// 5) String is sequence of character which are inclosed in double quotes 
		String name2 = "Aniket";  
		System.out.println("================================================================================================================");
		
		
		
		// We can create String by 4 ways in java
		
		// 1) String literal (Immutable) (Cant make any changes)
		String city = "Pune";
		city.concat(" Aniket");
		System.out.println(city); // ===> Pune   ( No changes will happen = Immutable )
		
		// 2) new keyword (Immutable) (Cant make any changes)
		String s2 = new String("Pune"); 
		s2.concat(" Aniket");
		System.out.println(s2);  // ===> Pune   ( No changes will happen = Immutable )
	
		// 3) String builder class (Mutable) (We can make change)
		// StringBuilder is also class and by creating the object of StringBuilder we can create the String
		StringBuilder sb = new StringBuilder("Pune");
		sb.append(" Aniket");
		System.out.println(sb);  // ===> PuneAniket   ( We can make changes )
		
		// 4) String Buffer  (Mutable)  (We can make changes)
		//   StringBuffer is also class and by creating the object of StringBuilder we can create the String
		StringBuffer sbf = new StringBuffer("Pune"); 
		sbf.append(" Aniket");
		System.out.println(sbf);   // ===> PuneAniket   ( We can make changes )
		
		 
	}
	
}
