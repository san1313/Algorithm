public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {'K', 'O', 'R', 'E', 'A'};
		int cur = 0, c, r = 0;
		while ((c = System.in.read()) > 13) {
			if(c == arr[cur]) {
				cur = (cur + 1) % 5;
				r++;
			}
		}
		System.out.print(r);
	}
}