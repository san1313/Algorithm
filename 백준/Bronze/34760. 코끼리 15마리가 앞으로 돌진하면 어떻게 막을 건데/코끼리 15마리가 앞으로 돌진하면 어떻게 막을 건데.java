public class Main {
	public static void main(String[] args) throws Exception {
		int idx = 0, max = 0;
		for (int i = 0; i < 15; i++) {
			int n = nextInt();
			if (n > max) {
				max = n;
				idx = i;
			}
		}
		System.out.println(max + (idx == 14 ? 0 : 1));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}