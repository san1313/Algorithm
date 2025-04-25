public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt(), total = 0;
		float res = 0;
		for (int i = 0; i < t; i++) {
			String[] s = readLine().split(" ");
			int credit = Integer.parseInt(s[1]);
			String score = s[2];
			float r = 0;
			if (score.charAt(0) != 'F') {
				r += switch (score.charAt(0)) {
					case 'A' -> 4;
					case 'B' -> 3;
					case 'C' -> 2;
					case 'D' -> 1;
					default -> 0;
				};
				r += switch (score.charAt(1)) {
					case '+' -> 0.3f;
					case '-' -> -0.3f;
					default -> 0;
				};
			}
			res += r * credit;
			total += credit;
		}
		System.out.printf("%.2f",res / total);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 20];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}
