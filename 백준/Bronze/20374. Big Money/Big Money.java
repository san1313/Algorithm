public class Main {
	public static void main(String[] args) throws Exception {
		long a, r = 0;
		while ((a = nextInt()) != -1) r += a;
		System.out.printf("%.2f",r / 100.0);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 45) {
			if (c == 46) continue;
			r = r * 10 + c - 48;
		}
		if (c == -1 && r == 0) return -1;
		return r;
	}
}