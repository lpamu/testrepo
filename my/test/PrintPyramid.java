package my.test;

public class PrintPyramid {

	public static void main(String[] args) {
		straightmuggu(Integer.parseInt(args[0]));
		middlemuggu(Integer.parseInt(args[0]));
		//pyramid(Integer.parseInt(args[0]));
		//InverseTriangle(Integer.parseInt(args[0]));
	}

	public static void triangle1(int num) {
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
	}

	public static void triangle2(int num) {
		if (num > 0) {
			for (int i = num; i > 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
	}

	public static void InverseTriangle(int num) {
		int newnum = num; // Integer.parseInt(args[1]);
		if (num > 0) {
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < newnum; j++) {
					System.out.print("* ");
				}
				System.out.println("");
				newnum--;
			}
		}
	}

	public static void pyramid(int num) {
		int newnum = num;
		String[][] al = new String[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				al[i][j] = "   ";
			}
		}

		int k = 0;

		for (int i = num; i >= 0; i--) {

			for (int j = k; j < newnum; j++) {
				al[i - 1][j] = " * ";
			}
			k++;
			newnum--;
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(al[i][j]);
			}
			System.out.println(" ");

		}
		System.out.println(" ");
	}

	public static void straightmuggu(int num) {
		num = 15;
		String[][] al = new String[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				al[i][j] = "    ";
			}
		}

		int num1 = num / 2;
		int row = 0;
		if (num % 2 == 0) { //even
			row = num1 - 1;
		} else { //odd
			row = num1;
		}
		int m = 0;
			for (int i = row; m <= row; m++) {
				for (int j = m; j < num - m ; j++) {

					if (i - m >= 0) {
						//System.out.println("i = " + i + " j = " + j + " m ="+ m);
						al[i - m][j] = "*   ";
						al[i + m][j] = "*   ";
					}
				}
			}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(al[i][j]);
			}
			System.out.println(" ");
			System.out.println(" ");
		}
	}
	
	public static void middlemuggu(int num) {
		num = 20;
		String[][] al = new String[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				al[i][j] = "  ";
			}
		}

		int num1 = num / 2;
		int row = 0;
		if (num % 2 == 0) { //even
			row = num1 - 1;
		} else { //odd
			row = num1;
		}
		int m = 0;
			for (int i = row; m <= row; m++) {
				for (int j = m; j < num - m ; j++, j++) {

					if (i - m >= 0) {
						//System.out.println("i = " + i + " j = " + j + " m ="+ m);
						al[i - m][j] = "* ";
						al[i + m][j] = "* ";
					}
				}
			}
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print(al[i][j]);
			}
			System.out.println(" ");
		}
	}
}
