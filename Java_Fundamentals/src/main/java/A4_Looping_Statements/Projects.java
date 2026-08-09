package A4_Looping_Statement;
import java.util.Scanner;
public class Projects {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

	    System.out.println("Enter your num");
	    
	    int num = sc.nextInt();
	    int i=1;
	    int count = 0;
	    do {
	    	if(num%i==0) {
	    		count++;
	    	}
	    	i++;
	    }
	    while(i<=num);
	    if(count == 2) {
	    	System.out.println("Prm");
	    }
	    else {
	    	System.out.println("not");
	    }
		
		
		
		
		
		
		
		
		
		
	}
}
