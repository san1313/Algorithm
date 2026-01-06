public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextLong(), prev = Long.MIN_VALUE;
		while (n-- > 0) {
			long a = nextLong();
			if (prev >= a) {
				System.out.print(0);
				return;
			}
			prev = a;
		}
		System.out.print(1);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}