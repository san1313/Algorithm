class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] t = new int[n], s = new int[n];
		for (int i = 0; i < n; i++) {
			t[i] = nextInt();
			s[i] = nextInt();
		}
		int m = -1, f = -1;
		for (int i = 0; i < n; i++) {
			if (s[i] > m) {
				m = s[i];
				f = i;
			}
		}
		for (int i = 0; i < n; i++) {
			if (s[i] == m) {
				f = i;
				break;
			}
		}
		int p = 0;
		if (m == 1 || m == 4) {
			p = t[f] + f * 20;
		}

		System.out.println(p);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}