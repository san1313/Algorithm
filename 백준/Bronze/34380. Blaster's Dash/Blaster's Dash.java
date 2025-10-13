class Main {
	public static void main(String[] args) throws Exception {
		int m = nextInt(), v = nextInt(), n = nextInt();
		System.out.println((n + 20) * 2);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}