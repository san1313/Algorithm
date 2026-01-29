public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt(), r = 0;
		while (n-- > 0) r += nextInt();
		System.out.print(r % x == 0 ? 1 : 0);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}