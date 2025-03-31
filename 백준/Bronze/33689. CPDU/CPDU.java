public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		for (int i = 0; i < n; i++) r += readLine();
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static int readLine() throws Exception {
		int l = 0, c, r = 0;
		while ((c = System.in.read()) > 13) if (l++ == 0 && c == 'C') r = 1;
		return r;
	}
}
