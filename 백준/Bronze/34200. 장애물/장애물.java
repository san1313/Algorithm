public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), prev = -1, cur = 0, r = 0;
		for (int i = 0; i < n; i++) {
			int x = nextInt();
			if (x - prev == 1) {
				System.out.println(-1);
				return;
			}
			while (cur < x) {
				if (x - cur == 2) {
					cur++;
					r++;
				} else {
					cur += 2;
					r++;
				}
			}
			prev = x;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}