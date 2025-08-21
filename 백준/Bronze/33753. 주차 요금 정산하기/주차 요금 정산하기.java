class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt(), t = nextInt();
		System.out.println(t < 31 ? a : a + (t + b - 31) / b * c);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}