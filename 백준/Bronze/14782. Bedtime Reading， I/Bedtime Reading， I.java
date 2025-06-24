public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 1; i <= n; i++) if (n % i == 0) r += i;
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}