class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int a = nextInt(), mask = 0;
			while (a > 0) {
				mask |= 1 << (a % 10);
				a /= 10;
			}
			System.out.println(Integer.bitCount(mask));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}