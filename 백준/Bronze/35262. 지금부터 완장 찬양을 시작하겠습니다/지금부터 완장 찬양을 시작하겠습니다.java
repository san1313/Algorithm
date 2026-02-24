public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), s = 0;
		while (n-- > 0) {
			int a = System.in.read();
			if (a == 49) s = 0;
			else s++;
			if (s >= k) {
				System.out.print(0);
				return;
			}
		}
		System.out.print(1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}