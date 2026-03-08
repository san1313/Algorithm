public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), q = nextInt();
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[n + 1];
		for (int i = 0; i < q; i++) {
			int c = nextInt();
			switch (c) {
				case 1, 2 -> {
					int x = nextInt();
					n += arr[x] != (c == 1) ? c == 1 ? -1 : 1 : 0;
					arr[x] = c == 1;
				}
				case 3 -> sb.append(n).append("\n");
			}
		}
		System.out.print(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}