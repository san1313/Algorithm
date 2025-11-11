public class Main {
	public static void main(String[] args) throws Exception {
		int N = nextInt(), M = nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = nextInt();
			b[i] = nextInt();
		}
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < M; j++) {
			int g = nextInt(), x = nextInt(), y = nextInt();
			int cnt = 0;
			for (int i = 0; i < N; i++)
				if (x <= a[i] && y <= b[i] && a[i] + b[i] <= g) cnt++;
			sb.append(cnt).append('\n');
		}
		System.out.print(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}