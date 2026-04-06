public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextInt(), m = nextInt(), sx = nextInt(), sy = nextInt(), ex = nextInt(), ey = nextInt();
		if (sx == ex && sy == ey) {
			System.out.println("YES");
			return;
		}
		if (((sx + sy) & 1) != ((ex + ey) & 1)) {
			System.out.println("NO");
			return;
		}
		if (n == 1 || m == 1) {
			System.out.println("NO");
			return;
		}
		System.out.println("YES");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}