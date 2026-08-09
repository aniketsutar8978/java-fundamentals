package A5_Array;
import java.util.Scanner;
public class _2Array_Examples {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int num[]= {98,60,70,55,85,89,90};
		
		
		System.out.println("1) Count of vallues in array");
//		System.out.println( "The total values in arry is = "+num.length);
		
		int count = 0;
		for (int a = 1; a <= num.length; a++) {
			count++;
		}
		System.out.println(count);			
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("2) Sum of vallues in array");
		int sum = 0;
		for (int a = 0; a < num.length; a++) {
			sum = sum + num[a];
		}
		System.out.println("Total sum  = "+sum);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("3) Print even numbers in array");
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 == 0) {
				System.out.println(num[a]);
			}
		}
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("4) Print odd num in array");
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 != 0) {
				System.out.println(num[a]);
			}
		}
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("5) Print the Maximum number in array");
		int max = num[0];
		for (int a = 1; a < num.length; a++) {
			if (max < num[a]) {
				max = num[a];
			}
		}
		System.out.println("The Maximum num is = "+ max);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("6) Print the Minimum number in array");
		int min=num[0];
		for (int a = 1; a < num.length; a++) {
			if (min > num[a]) {
				min = num[a];
			}
		}
		System.out.println("The Minimum num is = "+ min);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("7) Enter the sum of even num in array");
		sum = 0;
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 == 0) {
				sum = num[a];
			}
		}
		System.out.println("Sum of even no in array is = "+sum);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		
		System.out.println("8) Enter the sum of odd num");
		sum=0;
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 != 0) {
				sum = sum + num[a];
			}
		}
		System.out.println("Sum of odd num in array is = "+sum);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("9) Count the even no in array");
		count = 0;
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 == 0) {
				count++;
			}
		}
		System.out.println("The total even num in arry is = "+ count);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		System.out.println("10) Count the odd num in array");
		count = 0;
		for (int a = 0; a < num.length; a++) {
			if (num[a] % 2 != 0) {
				count++;
			}
		}
		System.out.println("The total odd no in arry is = "+ count);
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		
		
		System.out.println("11) Pritn this array in rivers format");
		for(int a=num.length-1; a>=0; a--)
		{
			System.out.println(num[a]);
		}
		System.out.println("=================================================================");
		System.out.println();
		
		
	
		
		
		System.out.println("12) Print the addition of num array and num2 array in num3 array");
	    int num2[]= {10,20,30,40,50,60,70};
	    int num3[]= new int[num.length];
		for (int a = 0; a < num.length; a++) {
			num3[a] = (num[a] + num2[a]);
		}
		for (int a = 0; a < num3.length; a++) {
			System.out.println(num3[a]);
		}
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		
		System.out.println("13 Print the missing num in array");
		// To find the missing number in array first of we have to see our array must be in consecutive order. 
		int digit[] = { 1, 2, 4, 5 };
		sum = 0;
		int total_sum = 5 * (5 + 1) / 2;
		for (int i = 0; i < digit.length; i++) {
			sum = sum + digit[i];
		}
		System.out.println("Missing num is: "+(total_sum - sum));
		System.out.println("=================================================================");
		System.out.println();
		
		
		
		
		System.out.println("14 Print the addition of this array");
		int arr[] = {5,6,7,8,9,10};
		int arr2[] = { 10, 12, 14, 16, 18, 20 };
		int arr3[] = new int[arr.length];
		for (int a = 0; a < arr.length; a++) {
			arr3[a] = (arr[a] + arr2[a]);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr3[i]);
		}
		
		
		
		
		
	}
	

}
