public class Main {
	public static void main(String[] args) throws Exception {
		int n;
		while ((n = nextInt()) != 0) System.out.println(func(n));
	}

	static String func(int n) {
		StringBuilder sb = new StringBuilder();
		while (n > 9) {
			sb.append(n).append(" ");
			n = calc(n);
		}
		return sb.append(n).toString();
	}

	static int calc(int n) {
		if (n == 0) return 0;
		int r = 1;
		while (n > 0) {
			r *= n % 10;
			n /= 10;
		}
		return r;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}