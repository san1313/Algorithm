public class Main {
	public static void main(String[] args) throws Exception {
		int m = nextInt(), h = nextInt(), n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) {
			int c = nextInt(), b = nextInt();
			r += Math.max(c * m, b * h);
		}
		System.out.print(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}