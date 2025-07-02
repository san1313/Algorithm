public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, r = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		for (int i = 1; i <= n; i++) for (int j = i; i * j <= n; j++) r++;
		System.out.println(r);
	}
}