public class Main {
	public static void main(String[] args) throws Exception {
		int i = 1;
		while (true) {
			int r = nextInt();
			if (r == 0) break;
			int w = nextInt(), l = nextInt();
			System.out.printf("Pizza %d %s\n", i++, Math.sqrt(w * w + l * l) <= r * 2 ? "fits on the table." : "does not fit on the table.");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
