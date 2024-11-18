import java.util.*;

public class J08015 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      long n = sc.nextLong();
      long m = sc.nextLong();
      long[] a = new long[(int) n];
      for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
      }
      HashMap<Long, Long> mp = new HashMap<>();
      long count = 0;
      for (long value : a) {
        long complete = m - value;
        if (mp.containsKey(complete)) {
          count += mp.get(complete);
        }
        mp.put(value, mp.getOrDefault(value, 0L) + 1);
      }
      System.out.println(count);
    }
  }
}
