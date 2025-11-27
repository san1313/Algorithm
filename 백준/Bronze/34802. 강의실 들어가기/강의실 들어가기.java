public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt() * 3600 + nextInt() * 60 + nextInt(), b = nextInt() * 3600 + nextInt() * 60 + nextInt(), t = nextInt(), k = nextInt();
		int c = t - (t * k / 100);
		System.out.println(a + c <= b ? 1 : 0);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}