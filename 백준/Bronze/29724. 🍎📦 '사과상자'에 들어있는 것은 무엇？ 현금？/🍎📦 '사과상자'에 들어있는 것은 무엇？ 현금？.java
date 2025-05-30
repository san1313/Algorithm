import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), a = 0, b = 0;
		for (int i = 0; i < n; i++) {
			String[] s = br.readLine().split(" ");
			if (s[0].equals("A")) {
				int c = (Integer.parseInt(s[1]) / 12) * (Integer.parseInt(s[2]) / 12) * (Integer.parseInt(s[3]) / 12);
				a += 1000 + c * 500;
				b += c * 4000;
			} else {
				a += 6000;
			}
		}
		System.out.println(a + "\n" + b);
	}
}