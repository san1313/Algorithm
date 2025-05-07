public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), t = nextInt(), dir = 0, r = 0;
		for (int i = 0; i < t; i++) {
			r += dir == 0 ? 1 : -1;
			if (r == 2 * n) dir = 1;
			else if (r == 1) dir = 0;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}