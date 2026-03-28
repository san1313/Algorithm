public class Main {
	public static void main(String[] args) throws Exception {
		int r = nextInt(), c = nextInt();
		int[] res = new int[5];
		int[][] arr = new int[r][c];
		for (int i = 0; i < r; i++){
			for (int j = 0; j < c; j++) arr[i][j] = System.in.read();
			System.in.read();
		}
		for (int i = 0; i < r - 1; i++) {
			for (int j = 0; j < c - 1; j++) {
				int A = arr[i][j], B = arr[i][j+1], C = arr[i+1][j], D = arr[i+1][j+1], R = 0;
				if (A == '#' || B == '#' || C == '#' || D == '#') continue;
				if (A == 'X') R++;
				if (B == 'X') R++;
				if (C == 'X') R++;
				if (D == 'X') R++;
				res[R]++;
			}
		}
		for (int i : res) System.out.println(i);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}