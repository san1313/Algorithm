public class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), n = nextInt(), r = x;
		for (int i = 0; i < n; i++) r += x - nextInt();
		System.out.print(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}