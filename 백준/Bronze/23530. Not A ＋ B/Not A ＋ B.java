public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		while (t-- > 0) {
			int a = nextInt(), b = nextInt();
			System.out.println(a);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}