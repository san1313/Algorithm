public class Main {
	static int[] memo;

	public static void main(String[] args) throws Exception {
		int n = nextInt();
		memo = new int[n + 3];
		memo[2] = 1;
		memo[3] = 1;
		for (int i = 4; i <= n; i++) func(i, 0);
		System.out.println(memo[n]);
	}

	static int func(int n, int cnt) {
		if (n == 1) return cnt;
		if (memo[n] != 0) return memo[n] + cnt;
		else {
			int min = Integer.MAX_VALUE;
			if (n % 3 == 0) min = Math.min(func(n / 3, cnt + 1), min);
			if (n % 2 == 0) min = Math.min(func(n / 2, cnt + 1), min);
			min = Math.min(func(n - 1, cnt + 1), min);
			memo[n] = min;
			return min;
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}