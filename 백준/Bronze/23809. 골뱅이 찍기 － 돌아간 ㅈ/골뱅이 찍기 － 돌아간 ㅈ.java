public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n + n; i++) sb.append("@".repeat(n)).append(" ".repeat(n*(3 - i/n))).append("@".repeat(n)).append("\n");
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb);
		System.out.print(("@".repeat(n * 3)+"\n").repeat(n));
		System.out.println(sb.reverse());
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}