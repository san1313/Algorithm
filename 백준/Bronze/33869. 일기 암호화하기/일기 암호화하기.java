public class Main {
	public static void main(String[] args) throws Exception {
		int c, b = 0, cur = 0, C = 0;
		char[] arr = new char[26];
		while ((c = System.in.read()) > 13) {
			int r = 1 << c - 65;
			if ((b & r) == 0) {
				arr[cur++] = (char) c;
				b |= r;
			}
		}
		while (cur < 26) {
			if ((b & 1 << C) == 0) arr[cur++] = (char) (C + 65);
			C++;
		}
		while ((c = System.in.read()) > 13) System.out.print(arr[c - 65]);
	}
}