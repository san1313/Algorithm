public class Main {
	public static void main(String[] args) throws Exception {
		int c = System.in.read();
		System.out.print(c == 70 ? "Foundation" : c == 67 ? "Claves" : c == 86 ? "Veritas" : "Exploration");
	}
}