public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), k = nextInt(), t = nextInt(), r = 0;
		for (int i = 0; i < n; i++) {
			int d = nextInt();
			if (t > k) {
				t = t + d - Math.abs(t - k);
			} else if (t < k) {
				t = t + d + Math.abs(t - k);
			} else {
				t = t + d;
			}
			r += Math.abs(t - k);
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}