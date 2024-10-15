import java.util.*;

public class J03026 {
  public static int check(String s, String t) {
    if (s.equals(t)) {
      return -1;
    } else {
      int k = Math.max(s.length(), t.length());
      return k;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      String a = sc.next();
      String b = sc.next();
      System.out.println(check(a, b));
    }
  }
}
