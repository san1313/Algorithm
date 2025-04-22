public class Main {
	public static void main(String[] args) throws Exception {
		long t = nextInt(), r = 0;
		for (int i = 0; i < t; i++) {
			int n = nextInt(), a = n / 10, b = n % 10;
			r += Math.pow(a, b);
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}
