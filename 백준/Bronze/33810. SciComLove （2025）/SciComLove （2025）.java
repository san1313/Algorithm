public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0, i = 0;
		String s = "SciComLove";
		while (i < 10) r += s.charAt(i++) == System.in.read() ? 0 : 1;
		System.out.println(r);
	}
}