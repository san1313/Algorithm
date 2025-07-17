public class Main {
	public static void main(String[] args) throws Exception {
		String s = readLine();
		char last = s.charAt(s.length() - 1);
		System.out.println(switch (last) {
			case 'n', 's', 'a', 'e', 'i', 'o', 'u' -> func(s, 2);
			default -> func(s, 1);
		});
	}

	static int func(String s, int idx) {
		int len = s.length(), cnt = 0;
		for (int i = len - 1; i >= 0; i--) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				cnt++;
			}
			if (cnt == idx) return i + 1;
		}
		return -1;
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[100];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}