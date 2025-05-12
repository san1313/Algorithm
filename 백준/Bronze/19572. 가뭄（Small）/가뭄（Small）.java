public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt();
		double d = (a + c - b) / 2.0;
		if (d <= 0 || a - d <= 0 || c - d <= 0) System.out.println(-1);
		else {
			System.out.println(1);
			System.out.printf("%.1f %.1f %.1f", a - d, d, c - d);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}