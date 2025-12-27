public class Main {
	public static void main(String[] args) throws Exception {
		int a = 0, b = 0, c, n = 0, r = 19022146;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		while (n-- > 0) {
			if ((c = System.in.read()) < 91) a |= 1 << (c - 'A');
			else b |= 1 << (c - 'a');
		}
		System.out.print((r & a) == r && (r & b) == r ? "YeS" : (r & a) == r ? "YES" : (r & b) == r ? "yes" : "NO!");
	}
}