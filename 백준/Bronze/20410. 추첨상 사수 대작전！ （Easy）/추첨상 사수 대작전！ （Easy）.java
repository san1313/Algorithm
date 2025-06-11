public class Main {
	public static void main(String[] args) throws Exception {
		int m = nextInt(), seed = nextInt(), x1 = nextInt(), x2 = nextInt(), a = 0, b = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				if ((i * seed + j) % m == x1 && (i * x1 + j) % m == x2) {
					a = i;
					b = j;
					break;
				}
			}
		}
		System.out.println(a + " " + b);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}