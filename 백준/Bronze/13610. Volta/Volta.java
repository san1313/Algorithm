public class Main {
	public static void main(String[] args) throws Exception {
		int x = nextInt(), y = nextInt(), d = y - x;
		System.out.println((y + d - 1) / d);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}