class Main {
	public static void main(String[] args) throws Exception {
		int n = (int) nextLong();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) arr[i] = nextLong();
		long b = nextLong(), c = nextLong(), r = 0;
		for (int i = 0; i < n; i++) r += 1 + (Math.max(0, arr[i] - b) + c - 1) / c;
		System.out.print(r);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}