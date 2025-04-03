public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		double r = 1440.0 * m / n;
		System.out.printf("%02d:%02d", (int) r / 60, (int) r % 60);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
