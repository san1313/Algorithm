public class Main {
	public static void main(String[] args) throws Exception {
		int i = 1, r, w, l;
		while ((r = nextInt()) != 0) {
			w = nextInt();
			l = nextInt();
			System.out.printf("Pizza %d %s\n", i++, w * w + l * l <= 4 * r * r ? "fits on the table." : "does not fit on the table.");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
