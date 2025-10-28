class Main {
	public static void main(String[] args) throws Exception {
		String[] s = readLine().split(" ");
		int idx1 = 0, idx2 = 0, l1 = s[0].length(), l2 = s[1].length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < l1; i++) {
			int idx = s[1].indexOf(s[0].charAt(i));
			if (idx != -1) {
				idx1 = i;
				idx2 = idx;
				break;
			}
		}
		for (int i = 0; i < l2; i++) {
			if (i == idx2) sb.append(s[0]);
			else {
				for (int j = 0; j < l1; j++) {
					sb.append(j == idx1 ? s[1].charAt(i) : ".");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}


	static String readLine() throws Exception {
		byte[] buf = new byte[100];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}