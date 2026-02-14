public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			double n = nextDouble(), sum = 0;
			int r = 0;
			if (n == 0) return;
			while (sum < n) {
				r++;
				sum += 1.0 / (r + 1);
			}
			System.out.printf("%d card(s)\n", r);
		}
	}

	static double nextDouble() throws Exception {
		double c, r = 0, div = 1;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		if (c == 46) while ((c = System.in.read()) > 47) r += (c - 48) / (div *= 10);
		return neg ? -r : r;
	}
}