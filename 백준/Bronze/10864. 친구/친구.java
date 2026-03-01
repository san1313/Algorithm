public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[nextInt() + 1];
		int m = nextInt() * 2;
		while (m-- > 0) arr[nextInt()]++;
		for (int i = 1; i < arr.length; i++) System.out.println(arr[i]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}