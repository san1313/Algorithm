import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static String transform(int num) {
		if (num == 1) return "1";
		if (num == 2) return "5";
		if (num == 5) return "2";
		if (num == 8) return "8";
		return "?";
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String W = st.nextToken();
		int N = Integer.parseInt(st.nextToken());

		int[][] arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		if (W.equals("U") || W.equals("D")) {
			for (int i = 0; i < N / 2; i++) {
				int[] tmp = arr[i];
				arr[i] = arr[N - 1 - i];
				arr[N - 1 - i] = tmp;
			}
		} else if (W.equals("L") || W.equals("R")) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N / 2; j++) {
					int tmp = arr[i][j];
					arr[i][j] = arr[i][N - 1 - j];
					arr[i][N - 1 - j] = tmp;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(transform(arr[i][j]));
				if (j < N - 1) sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
	}
}