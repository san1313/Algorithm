public class Main {
	public static void main(String[] args) throws Exception {
		String[] arr = readLine().split(" ");
		int a = Integer.parseInt(arr[0]), b = Integer.parseInt(arr[2]), c = Integer.parseInt(arr[4]);
		int r1 = calc(calc(a, b, arr[1]), c, arr[3]);
		int r2 = calc(a, calc(b, c, arr[3]), arr[1]);
		System.out.println(Math.min(r1, r2) + "\n" + Math.max(r1, r2));
	}

	static int calc(int a, int b, String op) {
		return switch (op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			case "/" -> a / b;
			default -> 0;
		};
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}
