public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(),r = 0, min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int a = nextInt();
			if (a < min) {
				r = i;
				min = a;
			}
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}
