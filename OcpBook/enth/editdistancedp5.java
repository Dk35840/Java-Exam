package enth;


// dp for distance edit and fibonacci series created by me
public class editdistancedp5 {
	// Insert
	// Remove
	// Replace
	// Find minimum number of edits
	static int mat[][] = new int[40][40];

	public static void main(String[] str) {

		System.out.println(StringCopy("sunday", "saturday"));

		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= 10; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
		// System.out.println(recfib(9));
		// System.out.println(dpfib(9));
	}

	

	static int recfib(int n) {
		// fib ser 0 1 1 2 3
		if (n < 3)
			return 1;
		else
			return recfib(n - 1) + recfib(n - 2);
	}

	static int dpfib(int n) {
		/* Declare an array to store Fibonacci numbers. */
		int f[] = new int[n + 1]; // 1 extra to handle case, n = 0
		int i;

		/* 0th and 1st number of the series are 0 and 1 */
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= n; i++) {
			/*
			 * Add the previous 2 numbers in the series and store it
			 */
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	static int StringCopy(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		if (m == 0 && n == 0)
			return 0;

		if (m == 0)
			return n;

		if (n == 0)
			return m;

		for (int i = 0; i <= m ; i++) {
			mat[i][0] = i;
		}
		for (int i = 0; i <= n ; i++) {
			mat[0][i] = i;
		}

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {

				if (str1.charAt(i-1)  == str2.charAt(j-1)) {
					mat[i][j]= mat[i-1][j-1];
				} else {
					mat[i][j]=1+min(Replace(i, j), Remove(i, j), Insert(i, j));
				}
			}
		}

		return mat[m][n];
	}

	private static int Insert(int i, int j) {
		// TODO Auto-generated method stub
		return mat[i][j - 1];
	}

	private static int Remove(int i, int j) {
		// TODO Auto-generated method stub
		return mat[i - 1][j];
	}

	private static int Replace(int i, int j) {
		return mat[i - 1][j - 1];
	}

	private static int min(int i, int j, int k) {
		if (i <= j && i <= k)
			return i;
		else if (j <= i && j <= i)
			return j;
		else
			return k;

	}
}
