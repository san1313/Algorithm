public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = System.in.read();
		for (int i = 0; i < n - 2; i++) {
			if (arr[i] != 'A') continue;
			boolean chk = false;
			for (int j = i + 1; j < n; j++) {
				if ((chk && arr[j] == 'N') || (!chk && arr[j] == 'A')) break;
				if (chk && arr[j] == 'A') {
					r++;
					break;
				} else if (arr[j] == 'N') chk = true;
			}
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}