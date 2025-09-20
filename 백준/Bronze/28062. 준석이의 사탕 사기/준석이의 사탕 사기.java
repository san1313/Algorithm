import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), odd = 0, r = 0;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = nextInt();
			if (arr[i] % 2 == 1) odd++;
		}
		if (odd % 2 == 1) odd--;
		Arrays.sort(arr);
		for (int i = n - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0) r += arr[i];
			else if (odd > 0) {
				r += arr[i];
				odd--;
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