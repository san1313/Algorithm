public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, cur = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		int[] arr = new int[n], r = new int[2];
		for (int i = 0; i < n; i++) {
			arr[i] = System.in.read();
			r[arr[i] == 's' ? 0 : 1]++;
		}
		while (r[0] != r[1]) r[arr[cur++] == 's' ? 0 : 1]--;
		System.out.print(new String(arr, cur, n - cur));
	}
}