import java.util.*;

public class J08012 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 1) {
      System.out.println("Yes");
      return;
    }
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i < n; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      map.put(u, map.getOrDefault(u, 0) + 1);
      map.put(v, map.getOrDefault(v, 0) + 1);
    }
    int canhCount = 0;
    int canhCenter = 0;
    for (int bac : map.values()) {
      if (bac == n - 1) {
        ++canhCenter;
      }
      if (bac >= 1) {
        ++canhCount;
      }
    }
    if (canhCenter == 1 && canhCount == n) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
