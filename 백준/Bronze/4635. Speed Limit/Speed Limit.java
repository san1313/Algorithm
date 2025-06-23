public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int n = nextInt(), prev = 0, r = 0;
			if (n == -1) break;
			for (int i = 0; i < n; i++) {
				int a = nextInt(), b = nextInt();
				r += a * (b - prev);
				prev = b;
			}
			System.out.printf("%d miles\n",r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33) ;
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}