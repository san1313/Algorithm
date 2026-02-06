public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < t; i++) {
			int a = nextInt(), b = nextInt(), c;
			while ((c = System.in.read()) > 13) {
				sb.append((char) (((c - 65) * a + b)% 26 + 65));
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}