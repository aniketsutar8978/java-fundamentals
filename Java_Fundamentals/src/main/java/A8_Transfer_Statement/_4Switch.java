package A8_Transfer_Statement;

import java.util.Scanner;

public class _4Switch {
	
	// Switch is decision making statement in java used to select one block of code from multiple options base on single value. 
	// The value we pass throw the switch block and the value we throw case their datatype must be same;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		switch(100+200)
//		{		
//		 case 200: System.out.println("hi");
//			break;
//		 case 500: System.out.println("Hello"); 
//			break;
//		 case 300: System.out.println("Perfect match"); 
//			break;
//		  default: System.out.println("Dont match value"); 
//		}
//		System.out.println("==============================");

		
		
//		System.out.println("Enter alphabate");
//		char alph= sc.next().charAt(0);
//		switch(alph) {		
//		case'a':
//			System.out.println("vovels");
//			break;			
//		case'e':
//			System.out.println("vovels");
//			break;
//		case'i':
//			System.out.println("vovels");
//			break;
//		case'o':
//			System.out.println("vovels");
//			break;
//		case'u':
//			System.out.println("vovels");
//			break;			
//		default:
//			System.out.println("Consonent");}
//		System.out.println("==============================");
		
		
//		System.out.println("Enter alphabate");
//		char alph= sc.next().charAt(0);
//		switch(alph) {		
//		case'a':		
//		case'e':
//		case'i':
//		case'o':
//		case'u':
//			System.out.println("vovels");
//			break;			
//		default:
//			System.out.println("Consonent");}
//		System.out.println("==============================");
		
		
		

//		System.out.println("Enter First value");
//		int value=sc.nextInt();
//		System.out.println("Enter Second value");
//		int value2=sc.nextInt();
//		System.out.println("Enter operator (+, -, *, %)");
//		char op=sc.next().charAt(0);
//		
//		switch(op)
//		{
//			case'+':{System.out.println("Additin="+(value+value2));}
//			break;
//			case'-':{System.out.println("Substraction="+(value-value2));}
//			break;
//			case'*':{System.out.println("Multiplication="+(value*value2));}
//			break;
//			case'%':{System.out.println("Modulo="+(value %value2));}
//			break;
//			default:{System.out.println("Invalid operator");}
//		}
//		System.out.println("==============================");
		
		
		
		
		
		
		

			System.out.println("1) Rectangle '*' Patter");
			System.out.println("2) Increasing Tringular '*' Pattern");
			System.out.println("3) Decreasing Tringular '*' Pattern");
			System.out.println("Enter Your Type");
			int type = sc.nextInt();
			switch (type) {
			case 1:
				System.out.println("Enter the row num");
				int row = sc.nextInt();
				System.out.println("Enter the column num");
				int column = sc.nextInt();
				for (int a = 1; a <= row; a++) {
					for (int j = 1; j <= column; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;

			case 2:
				System.out.println("Enter the row num");
				row = sc.nextInt();
				for (int a = 1; a <= row; a++) {
					for (int j = 1; j <= a; j++) {
						System.out.print('*');
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter the row num");
				row = sc.nextInt();
				for (int a = row; a >= 1; a--) {
					for (int j = 1; j <= a; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Please enter the Correct Pattern Type");

			}
			System.out.println("==============================");

			
			
			
			
	
			System.out.println("1) Increasing Number Pattern");
			System.out.println("2) Decreasing Number Pattern");
			System.out.println("3) Opposit increasing");
			System.out.println("4) Opposit decreasing");
			System.out.println("5) Increasing value");
			System.out.println("Enter Your type");
			type = sc.nextInt();
			int row = 0;
			int column = 0;

			switch (type) {
			case 1:
				System.out.println("Enter your row num");
				row = sc.nextInt();
				System.out.println("Enter your column num");
				column = sc.nextInt();
				for (int a = 1; a <= row; a++) {
					for (int j = 1; j <= a; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("Enter your row");
				row = sc.nextInt();
				for (int a = row; a >= 1; a--) {
					for (int j = 1; j <= a; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("Enter your row");
				row = sc.nextInt();
				for (int a = row; a >= 1; a--) {
					for (int j = row; j >= a; j--) {
						System.out.print(j);
					}
					System.out.println();
				}
				break;
			case 4:
				System.out.println("Enter your row");
				row = sc.nextInt();
				for (int a = 1; a <= row; a++) {
					for (int j = row; j >= a; j--) {
						System.out.print(j);
					}
					System.out.println();
				}
				break;
			case 5:
				System.out.println("Enter your row");
			    row = sc.nextInt();
				System.out.println("Enter yout column");
				column = sc.nextInt();
				int f = 1;
				for (int a = 1; a <= row; a++) {
					for (int j = 1; j <= column; j++) {
						System.out.print(f);
						f++;
					}
					System.out.println();
				}
				break;
			default:
				System.out.println("Invalid type");
				break;

			}

	}

}
