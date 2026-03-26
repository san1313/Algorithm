public class Main {
	public static void main(String[] args) throws Exception {
		int[] a = new int[20];
		int r = 0, c;
		for (int i = 0; i < 20; i++) {
			int n = 0;
			while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
			a[i] = n;
		}
		for (int i = 0; i < 10; i++) r += Integer.compare(a[i], a[i + 10]);
		System.out.println(r > 0 ? "A" : r < 0 ? "B" : "D");
	}
}