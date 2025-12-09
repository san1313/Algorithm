public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			long a = nextInt(), b = nextInt(), c = nextInt();
			System.out.println(Math.min(a * a + (b + c) * (b + c), Math.min(b * b + (a + c) * (a + c), c * c + (a + b) * (a + b))));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}