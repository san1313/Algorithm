import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		int c, t = 0;
		while ((c = System.in.read()) > 47) t = t * 10 + c - 48;
		for (int i = 1; i <= t; i++) System.out.printf("Case %d: %s\n", i, mod(readLine().split(" ")));
	}

	static String readLine() throws Exception {
		byte[] buf = new byte[1000010];
		int len = 0, c;
		while ((c = System.in.read()) > 13) buf[len++] = (byte) c;
		return new String(buf, 0, len);
	}

	static BigInteger mod(String[] s) {
		BigInteger r = BigInteger.ZERO;
		BigInteger mod = new BigInteger(s[1]);
		int l = s[0].length();
		for (int i = 0; i < l; i++)
			r = r.multiply(BigInteger.TEN).add(BigInteger.valueOf(s[0].charAt(i) - 48)).mod(mod);
		return r;
	}
}