public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0, c;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				c = System.in.read();
				if (i % 2 == j % 2 && c == 'F') r++;
			}
			System.in.read();
		}
		System.out.print(r);
	}
}