public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			double n = Math.sqrt(nextInt());
			System.out.println(n == (int) n ? 1 : 0);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}