public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, r = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		byte[] arr = new byte[n];
		System.in.read(arr);
		String s = "!@#$%^&*()-+";
		for (byte b : arr) {
			if (b >= 48 && b <= 57) r |= 1;
			if (b >= 97 && b <= 122) r |= 2;
			if (b >= 65 && b <= 90) r |= 4;
			if (s.indexOf(b) > -1) r |= 8;
		}
		r = 4 - Integer.bitCount(r);
		System.out.print(n + r < 6 ? 6 - n : r);
	}
}