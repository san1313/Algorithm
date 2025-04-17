import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt(), m = nextInt();
		int[] arr = new int[m + 1];
		for (int i = 0; i < n; i++) arr[nextInt()]++;
		Arrays.sort(arr);
		System.out.println(arr[m]);
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}
