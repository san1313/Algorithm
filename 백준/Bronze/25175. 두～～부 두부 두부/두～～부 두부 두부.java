public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), k = nextInt(), r = (m + k - 3) % n;
		System.out.println(r <= 0 ? r + n : r);
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