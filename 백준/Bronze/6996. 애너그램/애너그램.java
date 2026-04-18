import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int[] a = new int[26], b = new int[26];
			boolean not = false;
			String[] s = br.readLine().split(" ");
			if (s[0].length() != s[1].length()) not = true;
			if (!not) {
				for (int j = 0; j < s[0].length(); j++) {
					a[s[0].charAt(j) - 'a']++;
					b[s[1].charAt(j) - 'a']++;
				}
				for (int j = 0; j < 26; j++) {
					if (a[j] != b[j]) {
						not = true;
						break;
					}
				}
			}
			System.out.printf("%s & %s are %sanagrams.\n", s[0], s[1], not ? "NOT " : "");
		}
	}
}