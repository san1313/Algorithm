public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		int x = nextInt(), y = nextInt();
		for (int i = 0; i < n; i++) if (arr[i] >= y) r++;
		System.out.printf("%d %d", n * x / 100, r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}