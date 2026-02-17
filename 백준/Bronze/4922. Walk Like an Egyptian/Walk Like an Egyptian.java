public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int n = nextInt(), r = 1;
			if (n == 0) break;
			for (int i = 1; i < n; i++) r += i * 2;
			System.out.printf("%d => %d\n", n, r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}