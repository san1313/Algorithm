class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), t = 0, b = 5000;
		for (int i = 0; i < n; i++) {
			t = Math.max(nextInt(), t);
			b = Math.min(nextInt(), b);
		}
		System.out.println(t * b % 7 + 1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}