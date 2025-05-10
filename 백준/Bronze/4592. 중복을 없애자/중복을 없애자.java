public class Main {
	public static void main(String[] args) throws Exception {
		int n;
		while ((n = nextInt()) != 0) {
			int prev = -1;
			for (int i = 0; i < n; i++) {
				int a = nextInt();
				if (prev != a) {
					System.out.print(a + " ");
					prev = a;
				}
			}
			System.out.println("$");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}