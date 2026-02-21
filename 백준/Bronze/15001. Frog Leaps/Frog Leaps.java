public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt() - 1, prev = nextInt();
		long r = 0;
		while (n-- > 0) {
			int cur = nextInt();
			r += Math.pow(cur - prev, 2);
			prev = cur;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}