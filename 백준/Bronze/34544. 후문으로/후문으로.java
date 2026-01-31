public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt(), r = 1;
		for (int i = 0; i < t; i++) {
			int a = nextInt(), b = nextInt();
			r += b - a;
			if (a * b < 0) {
				if (a < 0) r--;
				else r++;
			}
		}
		System.out.print(r <= 0 ? r - 1 : r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}