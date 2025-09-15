class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int min = 2;
		for (int r = 1; r <= n; r++) {
			int c1 = r;
			int c2 = n - r + 1;
			if (c1 == c2) {
				min = 1;
				break;
			}
		}
		System.out.println(min);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}