public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt(), mod = 1000000007;
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = nextInt();
			nextInt();
		}
		long r = arr[0];
		for (int i = 1; i <= n; i++) {
			r = (r * x + arr[i]) % mod;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}