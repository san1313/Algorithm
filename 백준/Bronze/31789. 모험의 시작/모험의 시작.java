class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt(), s = nextInt(), m = 0;
		for (int i = 0; i < n; i++) {
			int c = nextInt(), p = nextInt();
			if (c <= x && m < p) m = p;
		}
		System.out.println(m > s ? "YES" : "NO");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}