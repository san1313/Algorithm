public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		long r = 0, c;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		c = nextInt();
		for (int i : arr) {
			if (i == 0) continue;
			r += ((i - 1) / c + 1) * c;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}