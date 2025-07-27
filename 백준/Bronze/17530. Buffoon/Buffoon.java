public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = nextInt();
		for (int i = 0; i < n - 1; i++) {
			if (a < nextInt()) {
				System.out.print("N");
				return;
			}
		}
		System.out.println("S");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}