class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = nextInt(), b = nextInt(), c = b - a;
		for (int i = 0; i < n - 2; i++) b = nextInt();
		System.out.println(b + c);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}