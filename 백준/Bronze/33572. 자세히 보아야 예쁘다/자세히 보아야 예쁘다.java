public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextLong(), m = nextLong(), r = 0;
		for (int i = 0; i < n; i++) r += nextLong() - 1;
		System.out.print(r >= m ? "DIMI" : "OUT");
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}