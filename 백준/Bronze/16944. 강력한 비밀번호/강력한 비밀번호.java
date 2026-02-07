public class Main {
	public static void main(String[] args) throws Exception {
		int c, n = 0, cnt = 0;
		while ((c = System.in.read()) > 47) n = n * 10 + c - 48;
		byte[] arr = new byte[n];
		System.in.read(arr);
		if (!hasNumber(arr)) cnt++;
		if (!hasLowerCase(arr)) cnt++;
		if (!hasUpperCase(arr)) cnt++;
		if (!hasSpecial(arr)) cnt++;
		System.out.print(n + cnt < 6 ? 6 - n : cnt);
	}

	static boolean hasNumber(byte[] arr) {
		for (byte b : arr)
			if (b >= 48 && b <= 57) return true;
		return false;
	}

	static boolean hasLowerCase(byte[] arr) {
		for (byte b : arr)
			if (b >= 97 && b <= 122) return true;
		return false;
	}

	static boolean hasUpperCase(byte[] arr) {
		for (byte b : arr)
			if (b >= 65 && b <= 90) return true;
		return false;
	}

	static boolean hasSpecial(byte[] arr) {
		String s = "!@#$%^&*()-+";
		for (byte b : arr) {
			if(s.indexOf(b) > -1) return true;
		}
		return false;
	}
}