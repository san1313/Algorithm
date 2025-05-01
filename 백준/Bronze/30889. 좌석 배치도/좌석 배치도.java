public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[][] arr = new int[10][20];
		for (int i = 0; i < n; i++) {
			int y = System.in.read() - 'A';
			int x = nextInt() - 1;
			arr[y][x] = 1;
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				System.out.print(arr[i][j] == 1 ? "o" : ".");
			}
			System.out.println();
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}