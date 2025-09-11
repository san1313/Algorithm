class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			a += nextInt();
			b += nextInt();
			System.out.println(a - b);
		}
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