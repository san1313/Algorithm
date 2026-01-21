public class Main {
	public static void main(String[] args) throws Exception {
		int N = nextInt(), m = nextInt(), M = nextInt(), T = nextInt(), R = nextInt(), a = m, r = 0;
		if (m + T > M) {
			System.out.println(-1);
			return;
		}
		while (N > 0) {
			if (a + T <= M) {
				N--;
				a += T;
			} else {
				a -= R;
			}
			if (a < m) a = m;
			r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}