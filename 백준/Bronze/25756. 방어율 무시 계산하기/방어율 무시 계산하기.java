public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		double r = 0;
		for (int i = 0; i < n; i++) {
			r = 1 - (1 - r) * (1 - nextInt() * 1.0 / 100);
			System.out.println(r * 100);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}