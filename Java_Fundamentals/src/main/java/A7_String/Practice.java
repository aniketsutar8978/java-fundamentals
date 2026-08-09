package A7_String;

public class Practice {

	public static void main(String[] args) {
		
	
		String s1 = "AnikeTakje jEksfe";
		
		int a = 5;
		
		String s2 = new String("Aniket");
		
		StringBuffer s3 = new StringBuffer("Aniket");
		
		StringBuilder s4 = new StringBuilder("Aniket");
		
		int count = 0;
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i) == 'a'|| s1.charAt(i)=='A') {
				count++;
			}
		}
		System.out.println(count);
	
		
	
		
	
	}

}
