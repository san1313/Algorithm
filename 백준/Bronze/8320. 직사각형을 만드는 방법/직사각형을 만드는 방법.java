public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 1; i <= n; i++) for (int j = 1; j <= n / i; j++) if (i <= j) r++;
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}