import java.security.KeyStore.Entry;
import java.util.*;

public class J03010 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> map = new HashMap<>();
    int t = sc.nextInt();
    sc.nextLine();
    while (t-- > 0) {
      String s = sc.nextLine();
      String[] s1 = s.trim().split("\\s+");
      String email = "";
      email += s1[s1.length - 1].toLowerCase();
      for (int i = 0; i < s1.length - 1; i++) {
        email += s1[i].toLowerCase().charAt(0);
      }
      if (map.containsKey(email)) {
        map.put(email, map.get(email) + 1);
        System.out.println(email + map.get(email) + "@ptit.edu.vn");
      } else {
        System.out.println(email + "@ptit.edu.vn");
        map.put(email, 1);
      }
    }
  }
}
