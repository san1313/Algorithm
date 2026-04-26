public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', '.'};
		int[] input = new int[16];
		int r = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) input[i * 4 + j] = System.in.read();
			System.in.read();
		}
		for (int i = 0; i < 16; i++) {
			int c = input[i];
			if (c == '.') continue;
			int idx = indexOf(arr, c);
			r += Math.abs(i / 4 - idx / 4) + Math.abs(i % 4 - idx % 4);
		}
		System.out.println(r);
	}

	public static int indexOf(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) if (arr[i] == value) return i;
		return -1;
	}
}