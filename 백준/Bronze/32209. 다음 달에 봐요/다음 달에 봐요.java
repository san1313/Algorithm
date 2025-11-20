public class Main {
	public static void main(String[] args) throws Exception {
		int q = nextInt(), p = 0;
		for (int i = 0; i < q; i++) {
			int a = nextInt(), b = nextInt();
			if (a == 1) p += b;
			else p -= b;
			if (p < 0) {
				System.out.println("Adios");
				return;
			}
		}
		System.out.println("See you next month");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}