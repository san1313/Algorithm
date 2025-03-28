public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt(), a = nextInt(), d = nextInt(), s = nextInt();
		System.out.println(s != n || (n % 2 == 0 && d == 0) || (n % 2 == 1 && d == 1) ? "NO..." : "YES!");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
