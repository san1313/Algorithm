class Main {
	public static void main(String[] args) throws Exception {
		int w = nextInt() * 5280, n = nextInt();
		System.out.println(w / n);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}