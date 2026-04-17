public class Main {
	public static void main(String[] args) throws Exception {
		long n = nextInt();
		System.out.println((n + 1) * n * (n - 1) / 2);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}