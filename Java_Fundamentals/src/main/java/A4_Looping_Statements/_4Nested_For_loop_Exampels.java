package A4_Looping_Statement;

public class _4Nested_For_loop_Exampels {

	public static void main(String[] args) {

		System.out.println("================================");
		String s1 = "Day";
		String s2 = "Sub";

		for (int a = 1; a <= 7; a++) {
			System.out.print(s1 + " " + a + " ==> ");
			for (int j = 1; j <= 5; j++) {
				System.out.print(" | " + s2 + " " + j + " | ");
			}
			System.out.println();
		}
		System.out.println("================================");
		
		
		

		System.out.println("Pattern no 1");

		for (int i = 1; i <= 4; i++) {
			for (int t = 1; t <= i; t++) {
				System.out.print("* "); // print i/t
			}
			System.out.println();

		}
		System.out.println("===============================================================");
		
		
		

		System.out.println("Pattern no 2");
		for (int a = 4; a >= 1; a--) {
			for (int j = 1; j <= a; j++) {
				System.out.print("* "); // print a/j
			}
			System.out.println();
		}
		System.out.println("===============================================================");
		
		
		

		System.out.println("Pattern no 3");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if (a > j) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Pattern no 4");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if ((a + j) <= 4) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");
		
		
		

		System.out.println("Pattern no 5");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if (j == a) {
					System.out.print("# ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Pattern no 6");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if ((a + j) % 2 == 0) {
					System.out.print("@ ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Patern no 7");
		for (int a = 4; a >= 1; a--) {
			for (int j = 1; j <= a; j++) {
				if (a == j) {
					System.out.print("$ ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 1");
		for (int m = 1; m <= 4; m++) {
			for (int n = 1; n <= m; n++) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 2");
		for (int g = 4; g >= 1; g--) {
			for (int h = 1; h <= g; h++) {
				System.out.print(h + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 3");
		for (int u = 4; u >= 1; u--) {
			for (int z = 4; z >= u; z--) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 4");
		for (int l = 1; l <= 4; l++) {
			for (int t = 4; t >= l; t--) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 5");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if (a > j) {
					System.out.print("  ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("Num pattern 6");
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				if ((a + j) <= 4) {
					System.out.print("  ");
				} else {
					System.out.print(j + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("1) Pattern");
		for (int a = 65; a <= 69; a++) {
			for (int j = 1; j <= 4; j++) {
				char ch = (char) a;
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("2) Pattern");
		for (int a = 1; a <= 4; a++) {
			for (int j = 65; j <= 68; j++) {
				char ch = (char) j;
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("3) Pattern");
		int h = 65;
		for (int a = 1; a <= 4; a++) {
			for (int j = 1; j <= 4; j++) {
				char ch = (char) h;
				System.out.print(ch + " ");
				h++;
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("4) Pattern");
		for (int a = 65; a <= 68; a++) {
			for (int j = 65; j <= a; j++) {
				char ch = (char) a; // We can print j
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("5) Pattern");
		for (int a = 68; a >= 65; a--) {
			for (int j = 65; j <= a; j++) {
				char ch = (char) a; // We can print j
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("6) Pattern");
		for (int a = 68; a >= 65; a--) {
			for (int j = 68; j >= a; j--) {
				char ch = (char) a;
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("7) Pattern");
		for (int a = 65; a <= 68; a++) {
			for (int j = 68; j >= a; j--) {
				char ch = (char) a;
				System.out.print(ch + " ");
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("8) Pattern");
		for (int a = 65; a <= 69; a++) {
			for (int j = 65; j <= 68; j++) {
				if (a > j) {
					System.out.print("  ");
				} else {
					char ch = (char) j;
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("9) Pattern");
		for (int a = 1; a <= 4; a++) {
			for (int j = 65; j <= 68; j++) {
				if ((a + j) <= 68) {
					System.out.print("  ");
				} else {
					char ch = (char) j;
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("10) Pattern");
		for (int a = 65; a <= 68; a++) {
			for (int j = 68; j >= 65; j--) {
				if (a < j) {
					System.out.print("  ");
				} else {
					char ch = (char) j;
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

		
		
		
		System.out.println("11) Pattern");
		for (int a = 1; a <= 4; a++) {
			for (int j = 68; j >= 65; j--) {
				if ((a + j) >= 70) {
					System.out.print("  ");
				} else {
					char ch = (char) j;
					System.out.print(ch + " ");
				}
			}
			System.out.println();
		}
		System.out.println("===============================================================");

	}

}
