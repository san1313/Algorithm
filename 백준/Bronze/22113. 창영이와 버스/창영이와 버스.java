public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), r = 0;
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) arr[i] = nextInt();
		int[][] bus = new int[n][n];
		for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) bus[i][j] = nextInt();
		for (int i = 1; i < m; i++) r += bus[arr[i - 1] - 1][arr[i] - 1];
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}