public class Main {
	public static void main(String[] args) throws Exception {
		int t = nextInt(), r;
		int[] arr = new int[t];
		for (int i = 0; i < t; i++) arr[i] = nextInt();
		if (arr[1] - arr[0] == arr[2] - arr[1]) {
			r = arr[t - 1] + arr[1] - arr[0];
		} else {
			r = arr[t - 1] * (arr[1] / arr[0]);
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
