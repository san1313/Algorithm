import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt() - 1;
		LocalDateTime d = LocalDateTime.of(2014, 4, 2, 0, 0, 0);
		System.out.println(d.plusDays(n).toLocalDate());
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}