public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10];
		long n = nextLong() * nextLong() * nextLong();
		while (n > 0) {
			arr[(int)(n % 10)]++;
			n /= 10;
		}
		for (int i = 0; i < 10; i++) System.out.println(arr[i]);
	}

	static long nextLong() throws Exception {
		long c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}