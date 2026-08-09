package A7_String;

public class _3String_Methods {
	
  String abc ;
	
	public static void main(String[] args) {
		
		String name = "Aniket";   // Will get memory in SCP
		String name2 = "Aniket";  // Will get memory in SCP
		
		String name3 = "Anjali";  // Will get memory in SCP
		
		String s1 = new String("Aniket");  // Will get memory in heap because of new key word
		String s2 = new String("Aniket");  // Will get memory in heap because of new key word
		
		System.out.println("To check String is empty or not with space: " + name.isEmpty()); // To check String is empty or not 
		// (It will check the space also if there is space then it will give false because its not empty)
		System.out.println("===================================================================================================");

		System.out.println("To check String is empty or not without space: " +name.isBlank()); // To check String is blank or not
		// (It will not count the space)
		System.out.println("===================================================================================================");

		System.out.println("The length of name is: "+name.length());  // To count the character in String (it count space also)
		System.out.println("===================================================================================================");
		
		System.out.println("The character at 5 is: " +name.charAt(5));  // To print the character at the position of given index
		// If we try to get char at out number of character example char at 6  we will get INDEX OUT BONDS
		System.out.println("===================================================================================================");

		System.out.println("The index of e is: "+name.indexOf('e'));  // To check of first index of character
		// If our value is not present in String then we will get -1 output
		System.out.println("===================================================================================================");
		
		System.out.println("The last index of e is: "+ name.lastIndexOf('e')); // To check the last index of character
		System.out.println("===================================================================================================");
		
		char a[] = name.toCharArray(); // To convert into char array
		for (int i = 1; i <= name.length(); i++) {
			System.out.println(a[i]);
		}
		System.out.println("===================================================================================================");
		
		System.out.println("Convert into upper case: " + name.toUpperCase()); // To convert into upper case
		System.out.println("===================================================================================================");

		System.out.println("Convert into lower case: "+ name.toLowerCase()); // To convert into lower case
		System.out.println("===================================================================================================");

		System.out.println("Name contain A ? "+name.contains("A")); // To check String contain this value
		System.out.println("===================================================================================================");

		System.out.println("Concat name with Anjali: " +name.concat("Anjali")); // To concat with this value
		System.out.println("===================================================================================================");

		System.out.println("To check name start with A ? "+ name.startsWith("A")); // To check start with this value
		System.out.println("===================================================================================================");

		System.out.println("To check name ends with t ? "+name.endsWith("t"));   // To check ends with this value
		System.out.println("===================================================================================================");

		System.out.println("To compaire name with name3 " + name.compareTo(name3)); // To compare with other String
		// It checks the ascii values and give difference between them
		// If the both String have same character then it checks the next character;;
		System.out.println("===================================================================================================");

		System.out.println("To camparie name with name3 with ignoring case "+name.compareToIgnoreCase(name3)); // To compare with other String ignoring case
		System.out.println("===================================================================================================");

		System.out.println("To check both string have same value / content: " +name.equals("Aniket")); // To check both string have same value / content
		System.out.println("===================================================================================================");

		System.out.println("To check both string have same value / content with ignoring case: " +name.equalsIgnoreCase("Aniket")); // To check both string have same value / content ignoring case 
		System.out.println("===================================================================================================");

		System.out.println("To remove the starting and ending spaces");
		System.out.println(name.trim());
		
		System.out.println("To convert any data type into String and to get the value of any variable");
		String nm = "Aniket";
		byte by = 01;
		short sh = 10;
		int in = 1000;
		long ln = 10000l;
		float fl = 100.50f;
		double dbl = 100050.500;
		char ch = 'a';
		
		String snm = String.valueOf(nm);
		String sby = String.valueOf(by); //sh, in, ln, fl, dbl, ch
		

		
		
		
		// 1) What is the difference between == and .equals method in string
		// == It will check memory address it will not check content
		System.out.println(name==name2); // True (name and name2 will get same memory because SCP will give the same memory to the duplicate String)
		System.out.println(s1 == s2);    // False (s1 and s2 will get different memory because heap will give the new memory to the duplicate variables)	
		System.out.println(name==s1);    // False (name and s1 have different memory thats why we will get false)
		System.out.println("===================================================================================================");

		// .equals will check content it dose not check memory
		System.out.println(name.equals(name2)); // True   (The value / content of name and name2 is same)
		System.out.println(s1.equals(s2));      // True   (The value / content of s1 and s2 is same)
		System.out.println(name.equals(s1));    // True   (The value / content of name and s1 is same)
		System.out.println(name.equals(name3)); // False  (The value / content of name and name3 is different)
		System.out.println(name3.equals(s1));   // False  (The value / content of name3 and s1 is different)
		System.out.println("===================================================================================================");
  
		// Interview question 
        String stuname = "AadiandJava";
        // Count the number of a present in String
		
		int count = 0;
		for (int i = 0; i < stuname.length(); i++) {
			if (stuname.charAt(i) == 'A' || stuname.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Total count of a/A is + "+ count); 
	}     

}
