class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int M = nextInt(); // 미션 수
			int[][] arr = new int[M][3];
			for (int j = 0; j < M; j++) {
				arr[j][0] = nextInt();
				arr[j][1] = nextInt();
				arr[j][2] = nextInt();
			}
			int k = nextInt(), d = nextInt(), a = nextInt();
			long total = 0;
			for (int j = 0; j < M; j++) {
				long v = (long) k * arr[j][0] - (long) d * arr[j][1] + (long) a * arr[j][2];
				if (v > 0) total += v;
			}
			System.out.println(total);
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}