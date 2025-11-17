public class Main {
	public static void main(String[] args) throws Exception {
		String s;
		while (!(s = readLine()).equals("end"))
			System.out.println(s.equals("animal") ? "Panthera tigris" :  s.equals("flower") ? "Forsythia koreana" : "Pinus densiflora");
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}