public class Main {
	public static void main(String[] args) throws Exception {
		int c = nextInt();
		for (int i = 0; i < c; i++) {
			int n = nextInt(), r = 0;
			for (int j = 1; j <= n; j++) r += n % j == 0 ? 1 : 0;
			System.out.println(n + " " + r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}