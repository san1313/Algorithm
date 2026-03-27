public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), mx = 10, my = 10, Mx = -10, My = -10;
		for (int i = 0; i < n; i++) {
			mx = Math.min(nextInt(), mx);
			my = Math.min(nextInt(), my);
			Mx = Math.max(nextInt(), Mx);
			My = Math.max(nextInt(), My);
			System.out.println((Mx - mx) * 2 + (My - my) * 2);
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