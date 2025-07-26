public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		boolean[][] arr = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) arr[i][j] = System.in.read() == 'X';
			System.in.read();
		}
		for (int i = 0; i < m; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) if (!arr[j][i]) flag = false;
			if (flag) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println("ESCAPE FAILED");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}