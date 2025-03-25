public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[][] arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = nextInt();
			arr[i][1] = nextInt();
		}
		int r = 0;
		for (int i = 0; i < n; i++) {
			int x1 = arr[i][0];
			int y1 = arr[i][1];
			int x2 = arr[(i + 1) % n][0];
			int y2 = arr[(i + 1) % n][1];
			r += Math.abs(x2 - x1) + Math.abs(y2 - y1);
		}
		System.out.println(r);

	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}