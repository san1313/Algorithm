public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt(), pos = 0, r = 0;
		boolean flag = false, drift = false;
		for (int i = 0; i < t; i++) {
			int c = System.in.read();
			if (c == 87) {
				if (++pos > 1) {
					r = flag ? 1 : 5;
				}
			}
			else {
				if (pos == 1) drift = true;
				else if (pos < 2) flag = !flag;
			}
		}
		System.out.println(pos < 2 ? 0 : drift ? 6 : flag ? 1 : 5);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
