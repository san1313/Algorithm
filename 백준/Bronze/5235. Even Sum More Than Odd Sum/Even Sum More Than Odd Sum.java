public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt(), odd = 0, even = 0;
			for (int j = 0; j < n; j++) {
				int a = nextInt();
				if (a % 2 == 0) even += a;
				else odd += a;
			}
			System.out.println(odd > even ? "ODD" : odd < even ? "EVEN" : "TIE");
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