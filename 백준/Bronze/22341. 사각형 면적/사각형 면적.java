public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), c = nextInt(), X = n, Y = n;
		for (int i = 0; i < c; i++) {
			int x = nextInt(), y = nextInt();
			if (X * y >= x * Y) Y = y;
			else X = x;
		}
		System.out.println(X * Y);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}