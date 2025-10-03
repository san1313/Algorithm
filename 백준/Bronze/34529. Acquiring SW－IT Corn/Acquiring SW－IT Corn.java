class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), z = nextInt(), u = nextInt() / 100, v = nextInt() / 50, w = nextInt() / 20;
		System.out.println(x * u + y * v + z * w);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}