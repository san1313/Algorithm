class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), n = nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % x == 0 || i % y == 0) {
				if (i % x == 0) System.out.print("Fizz");
				if (i % y == 0)	System.out.print("Buzz");
			} else System.out.print(i);
			System.out.println();
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}