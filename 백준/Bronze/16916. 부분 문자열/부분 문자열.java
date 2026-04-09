import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String p = br.readLine();
		long pHash = 0;
		long sHash = 0;
		long factor = 1;
		if (s.length() < p.length()) {
			System.out.println(0);
			return;
		}
		for (int i = p.length() - 1; i >= 0; i--) {
			sHash = (sHash + s.charAt(i) * factor) % 1000000007;
			pHash = (pHash + p.charAt(i) * factor) % 1000000007;
			if (i > 0) factor = (factor * 256) % 1000000007;
		}
		for (int i = 0; i < s.length() - p.length() + 1; i++) {
			if (i > 0) {
				sHash = (256 * (sHash - s.charAt(i - 1) * factor) + s.charAt(i + p.length() - 1)) % 1000000007;
			}
			if (sHash < 0) sHash += 1000000007;
			if (sHash == pHash) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
}