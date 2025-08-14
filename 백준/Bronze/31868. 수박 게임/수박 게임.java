class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt();
		System.out.println(k / (1 << (n - 1)));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}