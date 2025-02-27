public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		a:while (t-- > 0) {
			int n = nextInt();
			n += Integer.parseInt(new StringBuilder().append(n).reverse().toString());
			String s = String.valueOf(n);
			for (int i = 0; i < s.length() / 2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
					System.out.println("NO");
					continue a;
				}
			}
			System.out.println("YES");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}