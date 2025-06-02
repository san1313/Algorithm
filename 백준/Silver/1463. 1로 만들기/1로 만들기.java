public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] d = new int[n + 2];
		for (int i = 2; i <= n; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0) d[i] = Math.min(d[i], d[i / 2] + 1);
			if (i % 3 == 0) d[i] = Math.min(d[i], d[i / 3] + 1);
		}
		System.out.println(d[n]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}