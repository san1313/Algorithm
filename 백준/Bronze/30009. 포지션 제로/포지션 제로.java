public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt(), y = nextInt(), r = nextInt();
		int a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			int t = nextInt();
			int dx = Math.abs(t - x);
			if (dx < r) a++;
			else if (dx == r) b++;
		}
		System.out.println(a + " " + b);
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