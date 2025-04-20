public class Main {
	static int[][] corr = {{2, 4}, {1, 1}, {2, 1}, {3, 1}, {1, 2}, {2, 2}, {3, 2}, {1, 3}, {2, 3}, {3, 3}};

	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt();
		System.out.println(func(a, b));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}

	static String func(int h, int m) {
		int min = Integer.MAX_VALUE;
		String res = "";
		for (int i = h * 100 + m; i < 10000; i++) {
			if (i / 100 % 24 != h || i % 100 % 60 != m) continue;
			int a = i / 1000, b = i % 1000 / 100, c = i % 100 / 10, d = i % 10;
			int r = calc(a, b) + calc(b, c) + calc(c, d);
			if (min > r) {
				min = r;
				res = "%02d:%02d".formatted(i / 100, i % 100);
			}
		}
		return res;
	}

	static int calc(int a, int b) {
		return Math.abs(corr[a][0] - corr[b][0]) + Math.abs(corr[a][1] - corr[b][1]);
	}
}
