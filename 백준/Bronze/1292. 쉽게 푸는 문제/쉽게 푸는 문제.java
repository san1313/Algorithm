class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = 1, r = 0;
		for (int i = 1; i <= b;) {
			for (int j = 0; j < c && i <= b; j++) {
				if (i >= a) r += c;
				i++;
			}
			c++;
		}
		System.out.println(r);
	}


	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}