import java.io.IOException;

public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = new int[2];
		for (int i = 0; i < 4; i++) {
			int a = read();
			arr[i % 2] += arr[i % 2] == 0 ? a : -a;
			arr[i % 2] = Math.abs(arr[i % 2]);
		}
		System.out.printf("%d %d\n", Math.min(arr[0], arr[1]), Math.max(arr[0], arr[1]));
	}

	static int read() throws IOException {
		int c;
		while ((c = System.in.read()) < 48) ;
		return c;
	}
}