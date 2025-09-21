class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), r = 0;
		if (a == 0) {
			if (b == 5) r = 2;
			else if (b != 0) r = 1;
		} else if (a == 2) {
			if (b == 0) r = 2;
			else if (b != 2) r = 1;
		} else if (a == 5) {
			if (b == 2) r = 2;
			else if (b != 5) r = 1;
		} else {
			if (b == 0 || b == 2 || b == 5) r = 2;
		}
		System.out.println(r == 0 ? "=" : r == 1 ? ">" : "<");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}