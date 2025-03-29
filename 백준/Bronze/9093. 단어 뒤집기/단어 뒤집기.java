public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(readLine());
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		StringBuilder res = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		int c;
		while ((c = System.in.read()) > 13) {
			if (c == 32) {
				res.append(sb.reverse()).append(" ");
				sb.setLength(0);
			} else {
				sb.append((char) c);
			}
		}
		res.append(sb.reverse());
		return res.toString();
	}
}
