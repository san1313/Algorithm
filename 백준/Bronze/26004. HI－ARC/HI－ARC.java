public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] arr = new int[6];
		for (int i = 0; i < n; i++) {
			int c = System.in.read();
			arr[c == 'H' ? 0 : c == 'I' ? 1 : c == 'A' ? 2 : c == 'R' ? 3 : c == 'C' ? 4 : 5]++;
		}
		System.out.println(Math.min(arr[0], Math.min(arr[1], Math.min(arr[2], Math.min(arr[3], arr[4])))));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}