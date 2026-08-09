package A4_Looping_Statement;
import java.util.Scanner;
public class _7Nested_While_loop {
	
	public static void main(String[] args) {
		System.out.println(" 1) Print Aniket in 4 rowa and in 4 column");
		int a = 1;
		while (a <= 4) {
			int j = 1;
			while (j <= 4) {
				System.out.print("Aniket  ");
				j++;
			}
			System.out.println();
			a++;
		}
	System.out.println("===============================================================");
	
	  
	  
	  System.out.println(" 2) Print Aniket int 4 rows and in 4 column");
		int b = 4;
		while (b >= 1) {
			int k = 4;
			while (k >= 1) {
				System.out.print("Aniket |");
				k--;
			}
			System.out.println();
			b--;
		}
		System.out.println("===============================================================");

	  
	  
	  
		System.out.println("3) Print this pattern");
		int c = 1;
		while (c <= 4) {
			int l = 1;
			while (l <= 4) {
				if (c == 4 && l == 1 || c == 4 && l == 4) {
					System.out.print("A    ");
				} else {
					System.out.print("Ram  ");
				}
				l++;
			}
			System.out.println();
			c++;
		}
		System.out.println("===============================================================");

   
     
		System.out.println("4) Print this pattern");
		int d = 1;
		while (d <= 5) {
			int m = 1;
			while (m <= 5) {
				if (d == 3) {
					System.out.print("0");
				} else {
					System.out.print("*");
				}
				m++;
			}
			System.out.println();
			d++;
		}
		System.out.println("===============================================================");
     
     
		System.out.println(" 5) Enter the table of 1 to 5 by using while loop");
		int e = 1;
		while (e <= 10) {
			int n = 1;
			while (n <= 5) {
				System.out.print(n * e + "\t");
				n++;
			}
			System.out.println();
			e++;
		}
		System.out.println("===============================================================");
     
     
		System.out.println("6) Print this pattern");
		int f = 1;
		while (f <= 4) {
			int o = 1;
			while (o <= f) {
				System.out.print("*");
				o++;
			}
			System.out.println();
			f++;
		}
		System.out.println("===============================================================");
     
     
		System.out.println(" 7) Print this pattern");
		int g = 1;
		while (g <= 4) {
			int p = 4;
			while (p >= g) {
				System.out.print("*");
				p--;
			}
			System.out.println();
			g++;
		}
		System.out.println("===============================================================");
     
     
     
		System.out.println("8) Print this pattern");
		int p = 1;
		while (p <= 4) {
			int q = 1;
			while (q <= p) {
				System.out.print(q); // Print p
				q++;
			}
			System.out.println();
			p++;
		}
		System.out.println("===============================================================");
     
     
		System.out.println("9) Print this Pattern");
		int r = 4;
		while (r >= 1) {
			int s = 1;
			while (s <= r) {
				System.out.print(s); // Print r
				s++;
			}
			System.out.println();
			r--;
		}
		System.out.println("===============================================================");
    	 
	
		System.out.println(" 10 Print this pattern");
		int t = 4;
		while (t >= 1) {
			int y = 4;
			while (y >= t) {
				System.out.print(y);
				y--;
			}
			System.out.println();
			t--;
		}
		System.out.println("===============================================================");
	  
	  
		System.out.println("10) print this pattern");
		int u = 1;
		while (u <= 4) {
			int z = 4;
			while (z >= u) {
				System.out.print(z);
				z--;
			}
			System.out.println();
			u++;
		}
		System.out.println("===============================================================");
	  
	  
	  

	  
	  
	}

}
