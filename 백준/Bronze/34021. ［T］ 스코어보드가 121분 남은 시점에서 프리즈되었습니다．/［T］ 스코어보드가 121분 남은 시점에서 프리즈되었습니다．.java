public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), m = nextInt(), l = nextInt(), min = 1440;
			for (int j = 0; j < n; j++) {
				int tmp = nextInt();
				if (tmp != -1) min = Math.min(min, tmp);
			}
			int r = Math.max(m - min, l);
			System.out.printf("The scoreboard has been frozen with %d %s remaining.\n", r, r == 1 ? "minute" : "minutes");
		}
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