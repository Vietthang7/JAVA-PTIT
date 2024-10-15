import java.util.*;

public class J03024 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      boolean ok = true;
      int evenCount = 0;
      int oldCount = 0;
      for (int i = 0; i < s.length(); i++) {
        if (!Character.isDigit(s.charAt(i))) {
          ok = false;
          break;
        } else {
          int x = Character.getNumericValue(s.charAt(i));
          if (x % 2 == 0) {
            evenCount++;
          } else {
            oldCount++;
          }
        }
      }
      if (!ok) {
        System.out.println("INVALID");
      } else {
        if ((s.length() % 2 == 0 && evenCount > oldCount) || (s.length() % 2 == 1 && evenCount < oldCount)) {
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
      }
    }
  }
}
