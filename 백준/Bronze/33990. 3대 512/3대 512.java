class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = -1;
		for (int i = 0; i < n; i++) {
			int s = nextInt() + nextInt() + nextInt();
			if (s > 511) {
				if (r == -1) r = s;
				else r = Math.min(r, s);
			}
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}