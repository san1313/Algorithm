public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int[] buf = new int[1000];
			int len = 0, c, r = 0;
			while ((c = System.in.read()) > 13) buf[len++] = c;
			for (int j = 0; j < len - 2; j++) if (buf[j] == 'W' && buf[j + 1] == 'O' && buf[j + 2] == 'W') r++;
			System.out.println(r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}