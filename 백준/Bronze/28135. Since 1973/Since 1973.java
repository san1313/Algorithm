public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = n;
		for (int i = 50; i <= n; i++) {
			String s = String.valueOf(i - 1);
			if (s.contains("50")) r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}