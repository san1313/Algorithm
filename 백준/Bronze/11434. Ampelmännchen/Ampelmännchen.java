public class Main {
	public static void main(String[] args) throws Exception {
		int k = nextInt();
		for (int i = 1; i <= k; i++) {
			int n = nextInt(), W = nextInt(), E = nextInt(), r = 0;
			while (n-- > 0) {
				int a = nextInt(), b = nextInt(), c = nextInt(), d = nextInt(), w = a * W + c * E, e = b * W + d * E;
				r += Math.max(w, e);
			}
			System.out.printf("Data Set %d:\n%d\n\n", i, r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}