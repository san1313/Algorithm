class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0, m = 0, a;
		for (int i = 0; i < n; i++) {
			r += a = nextInt();
			if (m < a) m = a;
		}
		System.out.println(r - m);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}