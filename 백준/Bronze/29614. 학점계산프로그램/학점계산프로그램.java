public class Main {
	public static void main(String[] args) throws Exception {
		double r = 0;
		String[] arr = readLine().split("(?=[ABCDF]\\+?)");
		for (String s : arr) {
			r += switch (s){
				case "A+" -> 4.5;
				case "A" -> 4;
				case "B+" -> 3.5;
				case "B" -> 3;
				case "C+" -> 2.5;
				case "C" -> 2;
				case "D+" -> 1.5;
				case "D" -> 1;
				default -> 0;
			};
		}
		System.out.println(r / arr.length);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}