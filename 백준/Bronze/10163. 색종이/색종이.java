public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[][] arr = new int[1001][1001];
		for (int i = 1; i <= n; i++) {
			int x = nextInt(), y = nextInt(), w = nextInt(), h = nextInt();
			for (int j = x; j < x + w; j++) {
				for (int k = y; k < y + h; k++) {
					arr[j][k] = i;
				}
			}
		}
		for (int i = 1; i <= n; i++) {
			int r = 0;
			for (int j = 0; j < 1001; j++) {
				for (int k = 0; k < 1001; k++) {
					if (arr[j][k] == i) r++;
				}
			}
			System.out.println(r);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
