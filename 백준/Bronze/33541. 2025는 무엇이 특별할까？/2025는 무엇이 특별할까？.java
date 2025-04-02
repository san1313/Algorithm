public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = -1;
		for (int i = n + 1; i < 10000; i++) {
			if (Math.pow(i / 100 + i % 100, 2) == i) {
				r = i;
				break;
			}
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
