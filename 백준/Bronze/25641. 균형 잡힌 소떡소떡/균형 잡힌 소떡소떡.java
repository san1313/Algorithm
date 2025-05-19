public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0, cur = 0;
		byte[] arr = new byte[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (byte) System.in.read();
			if (arr[i] == 's') a++;
			else b++;
		}
		for (int i = 0; i < n - 2; i++) {
			if (a == b) break;
			if (arr[cur++] == 's') a--;
			else b--;
		}
		System.out.println(new String(arr, cur, n - cur));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}