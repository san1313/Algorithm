public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		int[] arr = new int[m + 1];
		for (int i = 1; i <= m; i++) arr[i] = nextInt();
		for (int i = 0; i < n; i++) {
			int a = nextInt(), b = nextInt(), c = nextInt(), r = -1;
			if (arr[a] != 0) {
				arr[a]--;
				r = a;
			} else if (arr[b] != 0) {
				arr[b]--;
				r = b;
			} else if (arr[c] != 0) {
				arr[c]--;
				r = c;
			}
			System.out.print(r + " ");
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}