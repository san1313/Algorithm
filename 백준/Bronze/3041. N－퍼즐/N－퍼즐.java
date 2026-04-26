public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int c = System.in.read() - 'A';
				if (c == '.'-'A') continue;
				r += Math.abs(i - c / 4) + Math.abs(j - c % 4);
			}
			System.in.read();
		}
		System.out.println(r);
	}
}