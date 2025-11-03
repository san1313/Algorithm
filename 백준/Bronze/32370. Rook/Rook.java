class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), x = nextInt(), y = nextInt(), r;
		if (a == 0 && b == 0) {
			r = 0;
		} else if (a == 0) {
			r = (x == 0) && (y > 0 && y < b) ? 3 : 1;
		} else if (b == 0) {
			r = (y == 0) && (x > 0 && x < a) ? 3 : 1;
		} else {
			r = 2;
		}

		System.out.println(r);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}