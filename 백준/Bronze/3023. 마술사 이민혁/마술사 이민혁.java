public class Main {
	public static void main(String[] args) throws Exception {
		int R = nextInt();
		int C = nextInt();
		char[][] arr = new char[R][C];
		for (int i = 0; i < R; i++) {
			String s = readLine();
			for (int j = 0; j < C; j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int A = nextInt();
		int B = nextInt();
		int r = 2 * R;
		int c = 2 * C;
		char[][] res = new char[r][c];

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				res[i][j] = arr[i][j];
				res[i][c - 1 - j] = arr[i][j];
			}
		}

		for (int i = 0; i < R; i++) {
			for (int j = 0; j < c; j++) {
				res[r - 1 - i][j] = res[i][j];
			}
		}

		int er = A - 1;
		int ec = B - 1;
		res[er][ec] = (res[er][ec] == '#') ? '.' : '#';

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				sb.append(res[i][j]);
			}
			sb.append("\n");
		}
		System.out.print(sb);

	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}