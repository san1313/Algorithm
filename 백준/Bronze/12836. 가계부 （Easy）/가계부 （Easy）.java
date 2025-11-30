public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), q = nextInt();
		long[] arr = new long[n + 1];
		for (int i = 0; i < q; i++) {
			int c = nextInt(), p = nextInt(), x = nextInt();
			if (c == 1) arr[p] += x;
			else {
				long s = 0;
				for (int j = p; j <= x; j++) s += arr[j];
				System.out.println(s);
			}
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