public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), k = nextInt();
		System.out.printf("%d %d", Math.max(0, n - m * k), Math.max(0, n - (m * (k - 1) + 1)));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}