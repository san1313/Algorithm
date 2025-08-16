import java.util.Arrays;

class Main {
	public static void main(String[] args) throws Exception {
		String[][] s = new String[3][3];
		int[] arr = new int[3];
		for (int i = 0; i < 3; i++) s[i] = readLine().split(" ");
		for (int i = 0; i < 3; i++) arr[i] = Integer.parseInt(s[i][1].substring(2));
		Arrays.sort(arr);
		System.out.println(arr[0] * 10000 + arr[1] * 100 + arr[2]);
		Arrays.sort(s, (a, b) -> Integer.parseInt(b[0]) - Integer.parseInt(a[0]));
		for (int i = 0; i < 3; i++) System.out.print(s[i][2].charAt(0));
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}