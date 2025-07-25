public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int c, r = 0, prev = 79, st = 0;
			while ((c = System.in.read()) > 13) {
				if (c != prev) st++;
				else if (c == 'W') st = 1;
				else st = 0;
				if (st == 3) {
					r++;
					st = 1;
				}
				prev = c;
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