public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int n = nextInt(), r = 0;
			if (n == 0) break;
			for (int i = 1; i <= n; i++)
				for (int j = 1; j <= n; j++) r += i * j;
			System.out.println(r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}