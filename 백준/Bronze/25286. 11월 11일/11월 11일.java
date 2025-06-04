import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
	public static void main(String[] args) throws Exception {
		int n = nextInt();
		for (int i = 0; i < n; i++) {
			int a = nextInt(), b = nextInt();
			GregorianCalendar c = new GregorianCalendar(a, b - 1, 1);
			c.add(GregorianCalendar.DAY_OF_MONTH, -1);
			System.out.printf("%d %d %d\n", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH));
		}
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}