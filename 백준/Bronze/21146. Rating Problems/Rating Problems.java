public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nextInt();
		}
		double min = (sum - 3.0 * (n - k)) / n;
		double max = (sum + 3.0 * (n - k)) / n;
		System.out.printf("%.4f %.4f\n", min, max);

	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}