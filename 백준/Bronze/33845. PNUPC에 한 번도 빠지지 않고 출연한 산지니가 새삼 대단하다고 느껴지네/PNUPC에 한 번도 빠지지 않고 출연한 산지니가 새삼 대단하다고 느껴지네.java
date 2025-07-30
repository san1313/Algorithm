public class Main {
	public static void main(String[] args) throws Exception {
		boolean[] arr = new boolean[26];
		int c;
		while ((c = System.in.read()) > 13) arr[c - 97] = true;
		StringBuilder sb = new StringBuilder();
		while ((c = System.in.read()) > 13) if (!arr[c - 97]) sb.append((char) c);
		System.out.println(sb);
	}
}