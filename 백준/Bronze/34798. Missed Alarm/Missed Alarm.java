public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt() * 60 + nextInt(), b = nextInt() * 60 + nextInt();
		System.out.println(a < b ? "YES" : "NO");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58)r = r * 10 + c - 48;
		return r;
	}
}