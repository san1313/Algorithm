public class Main {
	public static void main(String[] args) throws Exception {
		while(true) {
			int n = nextInt();
			if (n == 0) return;
			System.out.println(n <= 1000000 ? n : n <= 5000000 ? 9 * n / 10 : 8 * n / 10);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}