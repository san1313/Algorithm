public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) arr[i] = nextInt();
		int q = nextInt();
		for (int i = 0; i < q; i++) {
			int cmd = nextInt(), l = nextInt(), r = nextInt();
			if (cmd == 1) {
				int k = nextInt(), res = 0;
				for (int j = l; j <= r; j++) res += arr[j] == k ? 1 : 0;
				System.out.println(res);
			} else {
				for (int j = l; j <= r; j++) arr[j] = 0;
			}
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}