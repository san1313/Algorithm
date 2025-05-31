public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = 0, r = 0;
		for (int i = 2; i <= n; i++) {
			int sum = 0, tmp = n;
			while (tmp > 0) {
				sum += tmp % i;
				tmp /= i;
			}
			if (m < sum) {
				m = sum;
				r = i;
			}
		}
		System.out.println(m + " " + r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}