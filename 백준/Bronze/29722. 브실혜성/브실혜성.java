class Main {
	public static void main(String[] args) throws Exception {
		int y = nextInt(), m = nextInt() - 1, d = nextInt() + nextInt() - 1;
		m += d / 30;
		d = d % 30 + 1;
		y += m / 12;
		m = m % 12 + 1;
		System.out.printf("%d-%02d-%02d", y, m, d);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}