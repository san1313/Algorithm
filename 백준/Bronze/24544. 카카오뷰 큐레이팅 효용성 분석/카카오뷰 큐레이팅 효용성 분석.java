public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nextInt();
			a += arr[i];
		}
		for (int i = 0; i < n; i++) b += nextInt() == 0 ? arr[i] : 0;
		System.out.println(a + "\n" + b);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}