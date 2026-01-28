public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0;
		for (int i = 0; i < 5; i++) r += Math.pow(System.in.read() - 48, 5);
		System.out.print(r);
	}
}