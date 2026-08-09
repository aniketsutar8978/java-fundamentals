package A5_Array;
import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	

		int num[][] = {{20,30,50,40}, {25,58,65,45}, {45,25,75,89}};
		int num2 [][]= {{10,20,30,40},{20,30,40,20},{20,10,20,10}};
		
		int add[][] = new int[num.length][num[0].length];
		
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				add[i][j] = num[i][j] + num2[i][j];
			}
		}
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[0].length; j++) {
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
	
		
	
		
		
		
		
	    
		
	   
	    
	    
	    
	
	    
	   


	    
	    
	    
	    
	    
	    
	}
}
		
	