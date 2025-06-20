public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		double r = 0;
		for (int i = 0; i < n; i++) {
			int s = nextInt(), e = nextInt();
		}
		for (int i = 0; i < m; i++) {
			int t = nextInt(), p = nextInt();
			r += p * 1.0 / n;
		}
		System.out.printf("%.5f", r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}