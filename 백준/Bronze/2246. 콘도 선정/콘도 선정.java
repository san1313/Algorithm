import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), r = 0, m = Integer.MAX_VALUE;
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = nextInt();
			arr[i][1] = nextInt();
		}
		Arrays.sort(arr, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
		for (int i = 0; i < n; i++) {
			if (i < n - 1 && arr[i][0] == arr[i + 1][0]) continue;
			if (arr[i][1] < m) {
				r++;
				m = arr[i][1];
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