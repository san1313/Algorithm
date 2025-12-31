public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, cnt = 0, changed = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		int[] arr = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			arr[i] = System.in.read();
			cnt += arr[i] == 'w' ? 1 : 0;
		}
		for (int i = 0; i < n; i++) {
			int a = System.in.read();
			cnt -= a == 'w' ? 1 : 0;
			if (arr[i] != a) changed = 1;
		}
		System.out.print(changed == 0 && cnt == 0 ? "Good" : changed == 1 && cnt == 0 ? "Its fine" : cnt > 0 ? "Oryang" : "Manners maketh man");
	}
}