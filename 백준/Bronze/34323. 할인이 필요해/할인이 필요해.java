class Main {
	public static void main(String[] args) throws Exception {
		long n = nextInt(), m = nextInt(), s = nextInt(), M = (m + 1) * s;
		System.out.println(Math.min(m * s, (long) (M * (100.0 - n) / 100)));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}