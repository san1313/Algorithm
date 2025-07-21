public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = System.in.read();
			System.in.read();
		}
		for (int i = 0; i < n; i++) {
			if (System.in.read() == arr[i]) r++;
			System.in.read();
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}