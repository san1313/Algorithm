public class Main {
	public static void main(String[] args) throws Exception {
		int c, k = 0;
		while ((c = System.in.read()) > 13) System.out.print((char) (c ^ (k == 0 ? k = c ^ 'C' : k)));
	}
}