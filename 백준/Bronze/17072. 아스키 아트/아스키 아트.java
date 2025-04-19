public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) sb.append((char)func(nextInt(), nextInt(), nextInt()));
			sb.append('\n');
		}
		System.out.println(sb);
	}

	static int func(int r, int g, int b) {
		int i = r * 2126 + g * 7152 + b * 722;
		if (i < 510000) return 35;
		else if (i < 1020000) return 111;
		else if (i < 1530000) return 43;
		else if (i < 2040000) return 45;
		else return 46;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
