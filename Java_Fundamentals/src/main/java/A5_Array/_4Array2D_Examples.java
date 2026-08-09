package A5_Array;
import java.util.Scanner;
public class _4Array2D_Examples {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
	    int num[][]= {{20,30,50,40},{25,58,65,45},{45,25,75,89}};
		
		
	    
	    System.out.println("1) Count of values in num array");
//	    System.out.println(marks.length* marks[0].length); (Easy Way)
	    int count=0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				count++;
			}
		}
	    System.out.println( "The total count in this arrat is:" + count);
	    System.out.println("==========================================================================================");
		System.out.println();
		
		
		
		System.out.println("2) Sum of all values in array");
		int sum = 0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				sum = sum + num[a][j];
			}
		}
		System.out.println("The sum of all values in array is:" +sum);
		System.out.println("==========================================================================================");
	    System.out.println();
		
	    
	    
	    System.out.println("3) Print even numbers in array");
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 == 0) {
					System.out.println(num[a][j]);
				}
			}
		}
		System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    System.out.println("4) Print the odd no in array");
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 != 0) {
					System.out.println(num[a][j]);
				}
			}
		}
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
		
		 System.out.println("5) Print the maximum num in this array");
		 int max=0;
			for (int a = 0; a < num.length; a++) {
				for (int j = 0; j < num[a].length; j++) {
					if (num[a][j] > max) {
						max = num[a][j];
					}
				}
			}
		 System.out.println("The maximum no is:" +max);
		 System.out.println("==========================================================================================");
		 System.out.println();
		 
		 
		 
		 
		System.out.println("6) Print the minimum num in array");
		int min=num[0][0];
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] < min) {
					min = num[a][j];
				}
			}
		}
		System.out.println("The minimum num is: " + min);
		System.out.println("==========================================================================================");
	    System.out.println();
		 
		
		
		
		System.out.println("7) Print the sum of even noum");
		sum = 0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 == 0) {
					sum = sum + num[a][j];
				}
			}
		}
		System.out.println("The total sum of even num : "+sum);
		System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    
	    System.out.println("8) Print the sum of odd num");
	    sum=0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 != 0) {
					sum = sum + num[a][j];
				}
			}
		}
	    System.out.println("The total sum of odd num is : "+sum);
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    
	    System.out.println("9) Print the count of even num in array");
		count = 0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 == 0) {
					count++;
				}
			}
		}
	    System.out.println("The count of all even num is: "+count);
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    System.out.println("10) Print the count of odd num in array");
		count = 0;
		for (int a = 0; a < num.length; a++) {
			for (int j = 0; j < num[a].length; j++) {
				if (num[a][j] % 2 != 0) {
					count++;
				}
			}
		}
	    System.out.println("The count of all odd num is: "+count);
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    
	    
	    System.out.println("11) Print this array in rivers format");
		for (int a = num.length - 1; a >= 0; a--) {
			for (int j = num[a].length - 1; j >= 0; j--) {
				System.out.print(num[a][j] + " ");
			}
			System.out.println();
		}
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    
	    
	    System.out.println("12) Print rows in rivers format column shoud remain same");
		for (int a = num.length - 1; a >= 0; a--) {
			for (int j = 0; j < num[a].length; j++) {
				System.out.print(num[a][j] + " ");
			}
			System.out.println();
		}
	    System.out.println("==========================================================================================");
	    System.out.println();
	    
	    
	    
	    
	    System.out.println("13) Print column in rivers format row should remain same");
		for (int a = 0; a < num.length; a++) {
			for (int j = num[a].length - 1; j >= 0; j--) {
				System.out.print(num[a][j] + " ");
			}
			System.out.println();
		}
	    System.out.println("==========================================================================================");
	    System.out.println();
		
	    
	    
	    
	    int num2 [][]= {{10,20,30,40},{20,30,40,20},{20,10,20,10}};
	    System.out.println("14) Do the addition of this 2 array");
	    
		    int addition[][]=new int[3][4];
			for (int a = 0; a < num.length; a++) {
				for (int j = 0; j < num[a].length; j++) {
					addition[a][j] = num[a][j] + num2[a][j];
				}
			}
 			// Print the addition array
			for (int a = 0; a < addition.length; a++) {
				for (int j = 0; j < addition[a].length; j++) {
					System.out.print(addition[a][j] + " ");
				}
				System.out.println();
			}
		  System.out.println("==========================================================================================");
		  System.out.println();
		  
		
		
	}
	

} 
