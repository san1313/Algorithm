public class Main {
	public static void main(String[] args) throws Exception {
		String[][] arr = new String[10][10];
		for (int i = 0; i < 10; i++) arr[i] = readLine();
		int r = 0;
		for (int i = 0; i < 10; i++) {
			String b = arr[i][i];
			boolean flagX = true, flagY = true;
			for (int x = 0; x < 10; x++) {
				if (!arr[i][x].equals(b)) {
					flagX = false;
					break;
				}
			}
			for (int y = 0; y < 10; y++) {
				if (!arr[y][i].equals(b)) {
					flagY = false;
					break;
				}
			}
			if (flagX || flagY) {
				r = 1;
				break;
			}
		}
		System.out.println(r);
	}

	static String[] readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len).split(" ");
	}
}