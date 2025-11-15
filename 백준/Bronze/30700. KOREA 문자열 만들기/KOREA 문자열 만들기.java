public class Main {
	public static void main(String[] args) throws Exception {
		int[] arr = {'K', 'O', 'R', 'E', 'A'};
		int cur = 0, c;
		while ((c = System.in.read()) > 13)
			if(c == arr[cur % 5]) cur++;
		System.out.print(cur);
	}
}