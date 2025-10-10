class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[11];
		for (int i = 0; i < 11; i++) arr[i] = nextInt();
		int n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) {
			int b = nextInt();
			double l = nextDouble();
			int s = nextInt();
			if (l >= 2 && s > 16) r += arr[b];
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
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
}