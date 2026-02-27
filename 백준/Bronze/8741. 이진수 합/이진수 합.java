import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		BigInteger two = BigInteger.valueOf(2);
		BigInteger pow2k = two.pow(n);
		BigInteger sum = pow2k.subtract(BigInteger.ONE).multiply(two.pow(n - 1));
		System.out.println(sum.toString(2));
	}
}