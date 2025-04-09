public class Main {
	public static void main(String[] args) throws Exception {
		while(true) {
			int m = nextInt(), a = nextInt(), b = nextInt();
			if (m == 0 && a == 0 && b == 0) break;
			long r = Math.round((1.0 * m / a - 1.0 * m / b) * 3600);
			System.out.printf("%d:%02d:%02d\n", r / 3600, r % 3600 / 60, r % 60);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
