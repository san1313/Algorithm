public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), x = nextInt(), cur = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = nextInt();
		for (int i = 0; i < 200; i++) {
			if (arr[cur] < x++) {
				System.out.println(cur + 1);
				break;
			}
			cur = (cur + 1) % n;
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}
