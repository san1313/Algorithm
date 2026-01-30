public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		for (int i = 0; i < t; i++) {
			int n = nextInt();
			StringBuilder sb = new StringBuilder();
			sb.append("YES").append("\n");
			for (int j = 1; j <= n; j++) sb.append(j).append(" ");
			System.out.println(sb.toString().trim());
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}