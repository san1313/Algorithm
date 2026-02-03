public class Main {
	public static void main(String[] args) throws Exception {
		while (true) {
			int a = nextInt(), b = nextInt(), c = nextInt();
			if (a == 0 && b == 0 && c == 0) break;
			if (a == 0) a = c / b;
			if (b == 0) b = c / a;
			if (c == 0) c = a * b;
			System.out.println(a + " " + b + " " + c);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}