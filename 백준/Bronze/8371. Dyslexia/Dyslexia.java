public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, r = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = System.in.read();
		System.in.read();
		for (int i = 0; i < n; i++) r += arr[i] != System.in.read() ? 1 : 0;
		System.out.print(r);
	}
}