public class Main {
	public static void main(String[] args) throws Exception {
		long h1 = nextLong(), h2 = nextLong(), h3 = nextLong(), n = nextLong(), r = 0;
		r += (h1 + h2 + h3) * (n - (n / 2)) + (h3 - h1) * (n / 2);
		System.out.print(r);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}