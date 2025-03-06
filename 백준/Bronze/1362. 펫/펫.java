public class Main {
	public static void main(String[] args) throws Exception {
		int t = 1;
		while (true) {
			int o = nextInt(), w = nextInt();
			if (o == 0 && w == 0) break;
			while (true) {
				int cmd = System.in.read();
				int val = nextInt();
				if (cmd == '#') break;
				if (w > 0) w += cmd == 'F' ? val : -val;
			}
			System.out.printf("%d %s\n", t++, w <= 0 ? "RIP" : w > o / 2 && w < o * 2 ? ":-)" : ":-(");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33) ;
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return r;
	}
}