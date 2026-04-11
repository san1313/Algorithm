public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), r = 0;
			while (n > 1) {
				if (n % 2 != 0) {
					r++;
					n++;
				}
				n >>= 1;
			}
			System.out.println(r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}