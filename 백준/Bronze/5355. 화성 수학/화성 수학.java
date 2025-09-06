class Main {
	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(readLine());
		for (int i = 0; i < n; i++) {
			String[] s = readLine().split(" ");
			double a = Double.parseDouble(s[0]);
			for (int j = 1; j < s.length; j++) {
				switch (s[j]) {
					case "@" -> a *= 3;
					case "%" -> a += 5;
					case "#" -> a -= 7;
				}
			}
			System.out.printf("%.2f\n", a);
		}
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}