public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) r |= 1 << (nextInt() - 1);
		System.out.print(r == 31 ? "NO" : "YES");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}