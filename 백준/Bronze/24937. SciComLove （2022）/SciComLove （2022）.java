public class Main {
	public static void main(String[] args) throws Exception {
		char[] a = {'S', 'c', 'i', 'C', 'o', 'm', 'L', 'o', 'v', 'e'};
		int n = nextInt();
		for (int i = n; i < n + 10; i++) System.out.print(a[i % 10]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}