public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0, c;
		while (System.in.read() > 13);
		while ((c = System.in.read()) != -1) if (c > 13) r++;
		System.out.println(r);
	}
}
