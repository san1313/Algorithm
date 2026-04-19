public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), p = nextInt(), N = n, cnt = 0;
		int[] a = new int[p];
		for (int i = 0; i < p; i++) a[i] = -1;
		while (true) {
			N = N * n % p;
			if (a[N] != -1) break;
			a[N] = cnt++;
		}
		System.out.print(cnt - a[N]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}