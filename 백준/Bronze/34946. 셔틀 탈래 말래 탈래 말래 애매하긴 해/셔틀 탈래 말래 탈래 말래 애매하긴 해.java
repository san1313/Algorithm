public class Main {
  public static void main(String[] args) throws Exception {
    int a = nextInt() + nextInt(), b = nextInt(), c = nextInt();
    System.out.println(a > c && b > c ? "T.T" : a > c ? "Walk" : b > c ? "Shuttle" : "~.~");
  }

  static int nextInt() throws Exception {
    int c, r = 0;
    while ((c = System.in.read()) > 47 && c < 58) r = r * 10 + c - 48;
    return r;
  }
}