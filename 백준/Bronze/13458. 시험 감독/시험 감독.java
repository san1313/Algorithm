class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		int b = nextInt(), c = nextInt();
		long r = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Math.max(0, arr[i] - b);
			r += 1 + (arr[i] + c - 1) / c;
		}
		System.out.print(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}