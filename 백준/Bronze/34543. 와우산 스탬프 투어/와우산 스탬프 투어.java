class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), w = nextInt(), r = n * 10;
		r += n > 2 ? 20 : 0;
		r += n == 5 ? 50 : 0;
		r -= w > 1000 ? 15 : 0;
		System.out.println(Math.max(0, r));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}