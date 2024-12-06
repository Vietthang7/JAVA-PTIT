package J05046;

import java.util.*;


public class Main {
  public static String id(String s) {
    String res = "";
    String[] a = s.split("\\s+");
    for (int i = 0; i < a.length - 1; i++) {
      res += Character.toUpperCase(a[i].charAt(0));
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<MatHang> arr = new ArrayList<>();
    Map<String, Integer> mp = new HashMap<>();
    int t = sc.nextInt();
    for (int i = 1; i <= t; i++) {
      sc.nextLine();
      String s = sc.nextLine();
      int so;
      String tmp = id(s);
      if (mp.containsKey(tmp)) {
        so = mp.get(tmp) + 1;
      } else {
        so = 1;
      }
      mp.put(tmp, so);
      arr.add(new MatHang(tmp + String.format("%02d", so), s, sc.nextInt(), sc.nextInt()));
    }
    for (MatHang x : arr) {
      System.out.println(x);
    }

  }
}
