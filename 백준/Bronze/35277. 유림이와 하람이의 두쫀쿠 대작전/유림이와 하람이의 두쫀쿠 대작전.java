public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		System.out.print(n / 2000);
	}
}