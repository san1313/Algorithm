import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), a = 0, b = 0;
		int[] arr = new int[3];
		Arrays.fill(arr, n);
		for (int i = 0; i < 3 * n; i++) arr[nextInt() - 1]--;
		for (int i = 0; i < 3; i++) {
			if (arr[i] == 1) a = i + 1;
			if (arr[i] == -1) b = i + 1;
		}
		System.out.println(a + "\n" + b);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}