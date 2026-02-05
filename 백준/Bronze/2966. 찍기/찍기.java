public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		int[] arr = {1, 2, 3};
		int[] arr2 = {2, 1, 2, 3};
		int[] arr3 = {3, 3, 1, 1, 2, 2};
		int[] res = new int[3];
		for (int i = 0; i < n; i++) {
			int c = System.in.read() - 64;
			res[0] += arr[i % 3] == c ? 1 : 0;
			res[1] += arr2[i % 4] == c ? 1 : 0;
			res[2] += arr3[i % 6] == c ? 1 : 0;
		}
		int r = Math.max(res[0], Math.max(res[1], res[2]));
		System.out.println(r);
		if (res[0] == r) System.out.println("Adrian");
		if (res[1] == r) System.out.println("Bruno");
		if (res[2] == r) System.out.println("Goran");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}