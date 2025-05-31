public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = 0, r = 0;
		for (int i = 2; i <= n; i++) {
			int res = calcDigits(calcRadix(n, i));
			if (m < res) {
				m = res;
				r = i;
			}
		}
		System.out.println(m + " " + r);
	}

	static String calcRadix(int num, int radix) {
		StringBuilder sb = new StringBuilder();
		while (num > 0) {
			sb.append((char) (num % radix + 48));
			num /= radix;
		}
		return sb.reverse().toString();
	}

	static int calcDigits(String s) {
		int r = 0;
		for (char c : s.toCharArray()) r += c - 48;
		return r;
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}