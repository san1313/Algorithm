public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			long n = nextInt(), k = nextInt();
			if (n < k) k = n;
			sb.append((n + n - k) * (k + 1) * 2).append("\n");
		}
		System.out.println(sb.toString().trim());
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}