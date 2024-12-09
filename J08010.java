import java.util.*;

public class J08010 {
  public static boolean check(String s) {
    StringBuilder sb = new StringBuilder(s);
    sb.reverse();
    return s.compareTo(sb.toString()) == 0;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();
    HashMap<String, Integer> mp = new HashMap<>();
    int max_len = -100000;
    while ((sc.hasNext())) {
      String s = sc.next();
      if (check(s)) {
        max_len = Math.max(max_len, s.length());
        if (mp.containsKey(s)) {
          mp.put(s, mp.get(s) + 1);
        } else {
          arr.add(s);
          mp.put(s, 1);
        }
      }
    }
    for (String x : arr) {
      if (x.length() == max_len) {
        System.out.println(x + " " + mp.get(x));
      }
    }
  }
}
