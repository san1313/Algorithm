public class Main {
	public static void main(String[] args) throws Exception {
		long t = nextLong();
		while (t-- > 0) {
			long n = nextLong();
			long a = 1, b = 1;
			int ra = 0, rb = 0;
			while (a << 1 < n) {
				a <<= 1;
				ra++;
			}
			while (a + b < n) {
				b <<= 1;
				rb++;
			}
			System.out.println(rb + " " + ra);
		}
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}