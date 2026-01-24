public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int n = nextInt(), a = 0;
			if (n == 0) break;
			for (int i = 0; i < n; i++) a += nextInt() == 0 ? 1 : 0;
			System.out.printf("Mary won %d times and John won %d times\n", a, n - a);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}