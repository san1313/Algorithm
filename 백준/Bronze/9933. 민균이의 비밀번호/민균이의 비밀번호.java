import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws Exception {
		Map<String, Integer> map = new HashMap<>();
		int n = nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String s = readLine();
			sb.append(s).reverse();
			if (map.get(s) != null || s.contentEquals(sb)) {
				System.out.println(sb.length() + " " + sb.charAt(sb.length() / 2));
				break;
			}
			map.put(sb.toString(), 1);
			sb.setLength(0);
		}
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
