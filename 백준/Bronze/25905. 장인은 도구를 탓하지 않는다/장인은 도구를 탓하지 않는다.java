import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		double[] a = new double[10];
		double r = 1;
		for (int i = 0; i < 10; i++) a[i] = nextDouble();
		Arrays.sort(a);
		for (int i = 1; i < 10; i++) r *= a[i];
		System.out.println(r / 362880 * 1e9);
	}

	static double nextDouble() throws Exception {
		double c, r = 0, div = 1;
		while ((c = System.in.read()) < 33);
		boolean neg = (c == 45);
		if (neg) c = System.in.read();
		do r = r * 10 + c - 48;
		while ((c = System.in.read()) > 47);
		if (c == 46) while ((c = System.in.read()) > 47) r += (c - 48) / (div *= 10);
		return neg ? -r : r;
	}
}