import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) throws Exception {
		while(true) {
			int s = 0, M = 0, m = 10;
			for (int i = 0; i < 6; i++) {
				int n = nextInt();
				M = Math.max(M, n);
				m = Math.min(m, n);
				s += n;
			}
			if (s == 0) break;
			System.out.println(new DecimalFormat().format((s - M - m) / 4.0));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}