import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		int r = 0, b = 0;
		int[] arr = new int[8], s = {10, 8, 6, 5, 4, 3, 2, 1};
		for (int i = 0; i < 8; i++) {
			arr[i] = (nextInt() * 60000 + nextInt() * 1000 + nextInt()) * 100 + System.in.read();
			System.in.read();
		}
		Arrays.sort(arr);
		for (int i = 0; i < 8; i++) {
			if (arr[i] % 100 == 66) b += s[i];
			else r += s[i];
		}
		System.out.println(r > b ? "Red" : "Blue");
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
		return r;
	}
}