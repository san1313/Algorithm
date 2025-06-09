public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		int[] dp = new int[11];
		dp[1] = 1;
		dp[2] = 2;
		dp[3] = 4;
		for (int i = 4; i < 11; i++) dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
		while(t-- > 0) System.out.println(dp[nextInt()]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}