import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
	public static void main(String[] args) throws Exception {
		int d = nextInt(), m = nextInt();
		System.out.println(LocalDate.of(2009, m, d).format(DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH)));
	}

	static int nextInt() throws Exception {
		int c, r = 0;
		while ((c = System.in.read()) > 47) r = r * 10 + c - 48;
		return r;
	}
}