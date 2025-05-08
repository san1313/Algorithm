public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt();
		double a = n - n * x / 100.0;
		System.out.println((n / a - 1) * 100);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}