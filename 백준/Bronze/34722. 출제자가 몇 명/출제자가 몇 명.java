class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) {
			int a = nextInt(), b = nextInt(), c = nextInt(), d = nextInt();
			r += a > 999 || b > 1599 || c > 1499 || (d != -1 && d < 31) ? 1 : 0;
		}
		System.out.println(r);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}