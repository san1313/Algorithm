class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt() * 2, d = nextInt();
		System.out.println(x <= d ? "double it" : "take it");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}