public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {'C', 'A', 'M', 'B', 'R', 'I', 'D', 'G', 'E'};
		byte[] buf = new byte[100];
		int len = 0, c;
		a: while ((c = System.in.read()) > 13) {
			for (int i : arr)
				if (c == i) continue a;
			buf[len++] = (byte) c;
		}
		System.out.println(new String(buf, 0, len));
	}
}