public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) arr[i] = nextInt();
		int[] arr2 = new int[n + 1];
		for (int j = 0; j < m; j++) {
			int b = nextInt();
			for (int i = 1; i <= n; i++) {
				if (arr[i] <= b) {
					arr2[i]++;
					break;
				}
			}
		}
		int max = -1, res = -1;
		for (int i = 1; i <= n; i++) {
			if (arr2[i] > max) {
				max = arr2[i];
				res = i;
			}
		}

		System.out.print(res);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}