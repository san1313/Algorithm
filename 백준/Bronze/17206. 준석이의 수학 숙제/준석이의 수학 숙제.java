public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[80001];
		for (int i = 1; i <= 80000; i++) {
			arr[i] = arr[i - 1] + (i % 3 == 0 || i % 7 == 0 ? i : 0);
		}
		for (int i = 0; i < t; i++) sb.append(arr[nextInt()]).append("\n");
		System.out.println(sb);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}