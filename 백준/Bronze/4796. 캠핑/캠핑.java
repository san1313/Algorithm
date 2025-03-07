public class Main {
	public static void main(String[] args) throws Exception {
		int t = 1;
		while (true) {
			int l = nextInt(), p = nextInt(), v = nextInt();
			long r = 0, cur = 0;
			if (l == 0 && p == 0 && v == 0) break;
			while (cur + p <= v) {
				r += l;
				cur += p;
			}
			r += l - Math.max(0, cur + l - v);
			System.out.printf("Case %d: %d\n", t++, r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}