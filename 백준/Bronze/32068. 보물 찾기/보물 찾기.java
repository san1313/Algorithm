public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int l = nextInt(), r = nextInt(), s = nextInt();
			sb.append(func(l, r, s)).append("\n");
		}
		System.out.println(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33) ;
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}

	static int func(int l, int r, int s) {
		if (l == s || r == s) return 0;
		else if (r - s <= s - l) {
			return (r - s) * 2;
		} else {
			return (s - l) * 2 + 1;
		}
	}
}