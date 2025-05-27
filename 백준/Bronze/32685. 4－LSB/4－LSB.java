public class Main {
	public static void main(String[] args) throws Exception {
		String r = "";
		for (int i = 0; i < 3; i++) {
			String s = Integer.toBinaryString(nextInt());
			r += "%4s".formatted(s.substring(Math.max(0, s.length() - 4))).replace(" ", "0");
		}
		System.out.printf("%04d", Integer.parseInt(r, 2));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}