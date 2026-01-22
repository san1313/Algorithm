public class Main {
	public static void main(String[] args) throws Exception {
		int c, r = 1;
		while ((c = System.in.read()) > 13) {
			r = switch (c) {
				case 65 -> r == 1 ? 2 : r == 2 ? 1 : 3;
				case 66 -> r == 2 ? 3 : r == 3 ? 2 : 1;
				case 67 -> r == 1 ? 3 : r == 3 ? 1 : 2;
				default -> 0;
			};
		}
		System.out.print(r);
	}
}