public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), c = nextInt(), s = 0, r = 0;
		while (s < c) s += ++r % 7 == 0 ? a + b : a;
		System.out.print(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}