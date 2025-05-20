public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), r1 = 0, r2 = 0;
		while (a > 0 || b > 0) {
			if (a > 0) {
				r1 = r1 * 10 + 1;
				a--;
			}
			if (b > 0) {
				r2 = r2 * 10 + 1;
				b--;
			}
		}
		System.out.println(r1 + r2);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}