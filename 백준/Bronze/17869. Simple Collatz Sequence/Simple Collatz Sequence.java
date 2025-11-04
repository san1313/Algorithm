class Main {
	public static void main(String[] args) throws Exception {
		long n = nextLong();
		long r = 0;
		while (n != 1) {
			if (n % 2 == 0) {
				n /= 2;
			} else {
				n += 1;
			}
			r++;
		}

		System.out.println(r);

	}


	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}