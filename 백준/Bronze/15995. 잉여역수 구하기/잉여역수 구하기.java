public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), m = nextInt();
		for (int i = 1; i <= m ; i++) {
			if (a * i % m == 1) {
				System.out.println(i);
				return;
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}