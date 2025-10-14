class Main {
	public static void main(String[] args) throws Exception {
		double d = nextDouble(), w = nextDouble(), pi = 3.14159;
		int n = nextInt();
		System.out.println(pi * d >= w * n ? "YES" : "NO");
	}

	static double nextDouble() throws Exception {
		double c, r = 0, div = 1;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		if (c == 46) while ((c = System.in.read()) > 47) r += (c - 48) / (div *= 10);
		return neg ? -r : r;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}