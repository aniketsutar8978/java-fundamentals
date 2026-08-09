package A5_Array;

import java.util.Scanner;

public class _5Examples {
	public static void main(String[] args)
	{
				
		Scanner sc = new Scanner(System.in);
		
		
		 int num[][]= {{20,30,50,40},{25,58,65,45},{45,25,75,89}};
		
		
		int count =0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				count++;
//				count = num.length*num[i].length;
			}
		}
		System.out.println(count);
		System.out.println("=========================================");
		
		

		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum = sum + num[i][j];
			}
		}
		System.out.println(sum);
		System.out.println("=========================================");
		
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					System.out.println(num[i][j]);
				}
			}
		}
		System.out.println("=========================================");

		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 != 0) {
					System.out.println(num[i][j]);
				}
			}
		}
		System.out.println("=========================================");

		
		
		int max = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] > max) {
					max = num[i][j];
				}
			}
		}
		System.out.println(max);
		
		
		int min = 1000000;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] < min) {
					min = num[i][j];
				}
			}
		}
		System.out.println(min);
		System.out.println("=========================================");

		

		
		sum = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					sum = sum + num[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println("=========================================");

		
		
		
		sum =  0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 != 0) {
					sum = sum + num[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println("=========================================");

		
		
		
		
		
		count = 0;
		for(int i=0; i<num.length; i++)
		{
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println("=========================================");

		
		
		
		
		count = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if (num[i][j] % 2 != 0) {
					count++;
				}
			}
		}
		System.out.println(count);
		System.out.println("=========================================");

		
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("============================================");
  
		
		
		
		for (int i = num.length - 1; i >= 0; i--) {
			for (int j = num[i].length - 1; j >= 0; j--) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("============================================");
		
		
		for (int i = num.length - 1; i >= 0; i--) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("============================================");

		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = num[i].length - 1; j >= 0; j--) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("============================================");


		
		int num2[][] = { { 10, 20, 30, 40 }, { 20, 10, 30, 50 }, { 10, 10, 10, 10 } };
		int sum2[][] = new int[3][4];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				sum2[i][j] = num[i][j] + num2[i][j];
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(sum2[i][j] + " ");
			}
			System.out.println();
		}
		
		

		
		
		
	
	    
	    
	    
	    
	    
	    
	    
	    
		
	
			
		
	} 

}
