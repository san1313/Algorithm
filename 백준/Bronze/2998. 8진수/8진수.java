import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println(new BigInteger(readLine(), 2).toString(8));
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[100];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}
}