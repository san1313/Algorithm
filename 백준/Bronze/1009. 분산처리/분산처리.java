class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int a = nextInt(), b = nextInt(), r = 1;
			for (int j = 0; j < b; j++) {
				r = calc(a, r);
			}
			System.out.println(r == 0 ? 10 : r);
		}
	}

	static int calc(int a, int r) {
		return r * a % 10;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}