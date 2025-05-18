import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0;
		int[] a = new int[n], b = new int[n];
		for (int i = 0; i < n; i++) a[i] = nextInt();
		for (int i = 0; i < n; i++) b[i] = nextInt();
		for (int i = n - 1; i > 0; i--) {
			if (Arrays.equals(a, b)) {
				r = 1;
				break;
			}
			int max = 0, idx = -1;
			for (int j = 0; j <= i; j++) {
				if (max < a[j]) {
					max = a[j];
					idx = j;
				}
			}
			if (idx != i) {
				a[idx] = a[i];
				a[i] = max;
			}
		}
		System.out.print(Arrays.equals(a, b) ? 1 : r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}