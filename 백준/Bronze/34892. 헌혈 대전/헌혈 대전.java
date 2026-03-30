public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[9];
		int r = -1, x = 0, y = 0, z = 0;
		for (int i = 0; i < 9; i++) arr[i] = nextInt();
		for (int i = 0; i <= arr[0]; i++) {
			for (int j = 0; j <= arr[0] - i; j++) {
				if (arr[1] * i + arr[2] * j + arr[3] * (arr[0] - i - j) == arr[4] && arr[5] * i + arr[6] * j + arr[7] * (arr[0] - i - j) == arr[8]) {
					r++;
					x = i;
					y = j;
					z = (arr[0] - i - j);
				}
			}
		}
		if (r == 0) {
			System.out.println(0);
			System.out.println(x + " " + y + " " + z);
		} else if (r == -1) System.out.println(2);
		else System.out.println(1);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}