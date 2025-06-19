public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), q = nextInt();
		int[] arr = new int[n + 1];
		for (int i = 1; i <= n; i++) arr[i] = nextInt();
		for (int i = 0; i < q; i++) {
			int cmd = nextInt(),a = nextInt(), b = nextInt();
			if (cmd == 1) {
				long sum = 0;
				for (int j = a; j <= b; j++) sum += arr[j];
				System.out.println(sum);
				int tmp = arr[a];
				arr[a] = arr[b];
				arr[b] = tmp;
			} else {
				int c = nextInt(), d = nextInt();
				long sum1 = 0, sum2 = 0;
				for (int j = a; j <= b; j++) sum1 += arr[j];
				for (int j = c; j <= d; j++) sum2 += arr[j];
				System.out.println(sum1 - sum2);
			}
		}
	}
	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		return neg ? -r : r;
	}
}