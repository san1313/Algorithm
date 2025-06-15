public class Main {
	static int[] nums = new int[10];
	public static void main(String[] args) throws Exception {
		int t = nextInt();
		int[] arr = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < t; i++) {
			int cnt = 0;
			for (int j = 0; j < 10; j++) nums[j] = nextInt();
			for (int j = 1; j < 13; j++) {
				if (check(j)) {
					for (int k = 1; k <= arr[j]; k++) {
						if (check(k)) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	static boolean check(int n) {
		int a = n % 10, b = n / 10;
		if (n > 9) {
			return nums[a] == 0 && nums[b] == 0;
		}else {
			return nums[a] == 0;
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}

}