class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), s = 0;
		for (int i = 0; i < n; i++) s += nextInt();
		System.out.println(s % 3 == 0 ? "yes" : "no");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}