public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int a = nextInt(), b = nextInt(), c = nextInt();
			if (a == 0 && b == 0 && c == 0) break;
			System.out.println(a == c ? 1 : (c - a) % b == 0 && (c - a) / b > 0 ? (c - a) / b + 1 : "X");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}