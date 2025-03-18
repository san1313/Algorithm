public class Main {
	public static void main(String[] args) throws Exception {
		char[] arr = {'A', 'a', 'B', 'b', 'D', 'd', 'e', 'g', 'O', 'o', 'P', 'p', 'Q', 'q', 'R', '@'};
		int c, r = 0;
		while ((c = System.in.read()) > 13) {
			for (char ch : arr)
				if (c == ch) {
					if (c == 'B') r += 2;
					else r++;
				}
		}
		System.out.println(r);
	}
}