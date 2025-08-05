public class Main {
	public static void main(String[] args) throws Exception {
		int c, m = 0;
		int[] arr = new int[26];
		while (System.in.read() > 13);
		while ((c = System.in.read()) > 13) {
			if (c == 32 || c == 44 || c == 46) continue;
			arr[c - 97]++;
		}
		for (int i = 0; i < 26; i++) if (arr[i] > m) m = arr[i];
		System.out.println(m);
	}
}