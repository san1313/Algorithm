public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			String h = func(nextInt()), m = func(nextInt()), s = func(nextInt());
			for (int j = 0; j < 6; j++) sb.append(h.charAt(j)).append(m.charAt(j)).append(s.charAt(j));
			System.out.println(sb.append(" ").append(h).append(m).append(s));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}

	static String func(int n) {
		return "%06d".formatted(Integer.parseInt(Integer.toBinaryString(n)));
	}
}