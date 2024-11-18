import java.util.*;

public class J03032 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      ArrayList<String> arr = new ArrayList<>();
      String[] a = s.split(("\\s+"));
      for (String x : a) {
        StringBuilder sb = new StringBuilder(x);
        arr.add(sb.reverse().toString());
      }
      for (String x : arr) {
      System.out.print(x + " ");
      }
      System.out.println();
    }
  }
}
