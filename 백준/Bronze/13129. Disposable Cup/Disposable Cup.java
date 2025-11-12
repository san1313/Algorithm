public class Main {
	public static void main(String[] args) throws Exception {
		int a = nextInt(), b = nextInt(), n = nextInt();
		int s = a * n;
		for (int i = 0; i < n; i++) {
			s = s + b;
			System.out.print(s + " ");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}