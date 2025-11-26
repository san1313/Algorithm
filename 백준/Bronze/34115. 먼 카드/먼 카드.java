public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), max = 0;
		int[] arr = new int[n * 2];
		for (int i = 0; i < n * 2; i++) arr[i] = nextInt() - 1;
		for (int i = 0; i < n; i++) {
			int a = -1, b = -1, cur = 0;
			while (a == -1 || b == -1) {
				if (a == -1) {
					if (arr[cur] == i) a = cur;
				}else {
					if (arr[cur] == i) b = cur;
				}
				cur++;
			}
			max = Math.max(max, b - a - 1);
		}
		System.out.println(max);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58)r = r * 10 + c - 48;
		return r;
	}
}