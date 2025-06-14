public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[5];
		int r = 4;
		for (int i = 0; i < 5; i++) arr[i] = nextInt();
		while (true) {
			int cnt = 0;
			for (int i = 0; i < 5; i++) {
				cnt += r % arr[i] == 0 ? 1 : 0;
			}
			if (cnt > 2) break;
			r++;
		}
		System.out.println(r);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

}