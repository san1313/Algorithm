public class Main {
	public static void main(String[] args) throws Exception {
		String a = readLine(), b = readLine(), c = readLine(), d = "Fizz", e = "Buzz", f = "FizzBuzz";
		int r = 0;
		if (!c.equals(d) && !c.equals(e) && !c.equals(f)) r = Integer.parseInt(c) + 1;
		else if (!b.equals(d) && !b.equals(e) && !b.equals(f)) r = Integer.parseInt(b) + 2;
		else if (!a.equals(d) && !a.equals(e) && !a.equals(f)) r = Integer.parseInt(a) + 3;
		System.out.println(r % 3 == 0 && r % 5 == 0 ? f : r % 5 == 0 ? e : r % 3 == 0 ? d : r);
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1 << 16];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}