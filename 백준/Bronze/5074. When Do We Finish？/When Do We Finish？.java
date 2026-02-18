public class Main {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		while (true) {
			int t = nextInt() * 60 + nextInt() + nextInt() * 60 + nextInt();
			if (t == 0) break;
			int d = t / 24 / 60, h = t / 60 % 24, m = t % 60;
			sb.append("%02d".formatted(h)).append(":").append("%02d".formatted(m));
			if (d != 0) sb.append(" +").append(d);
			sb.append("\n");
		}
		System.out.print(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}