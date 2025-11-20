public class Main {
	public static void main(String[] args) throws Exception {
		int q = nextInt(), p = 0;
		while (q-- > 0) {
			int a = nextInt(), b = nextInt();
			p += a == 1 ? b : -b;
			if (p < 0) {
				System.out.print("Adios");
				return;
			}
		}
		System.out.print("See you next month");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}