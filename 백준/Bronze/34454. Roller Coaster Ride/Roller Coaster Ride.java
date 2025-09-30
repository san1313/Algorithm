class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt();
		System.out.println(a > b * c ? "no" : "yes");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}