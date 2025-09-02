class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt() + a, d = nextInt() + b;
		System.out.println(c < d ? "Hanyang Univ." : c > d ? "Yongdap" : "Either");
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c != 58) r = r * 10 + c - 48;
		return r;
	}
}