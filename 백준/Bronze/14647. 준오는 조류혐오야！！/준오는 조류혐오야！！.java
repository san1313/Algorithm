public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), max = 0, sum = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			for (int j = 0; j < m; j++) {
				int a = cntNine(nextInt());
				arr[i][j] = a;
				sum += a;
				tmp += a;
			}
			max = Math.max(max, tmp);
		}
		for (int i = 0; i < m; i++) {
			int tmp = 0;
			for (int j = 0; j < n; j++) tmp += arr[j][i];
			max = Math.max(max, tmp);
		}
		System.out.println(sum - max);
	}

	static int cntNine(int n) {
		int cnt = 0;
		while (n > 0) {
			if (n % 10 == 9) cnt++;
			n /= 10;
		}
		return cnt;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}