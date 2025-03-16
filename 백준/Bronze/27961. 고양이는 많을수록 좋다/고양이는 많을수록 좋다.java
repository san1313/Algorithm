public class Main {
	public static void main(String[] args) throws Exception {
		long a = nextLong(), b = 0;
		int r = 0;
		while (b < a) {
			if (b == 0) {
				b++;
				r++;
			}
			else {
				b <<= 1;
				r++;
			}
		}
		System.out.println(r);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}