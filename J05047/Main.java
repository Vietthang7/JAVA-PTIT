package J05047;

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
      String ten = sc.nextLine();
      String tmp = id(ten);
      int so;
      if (mp.containsKey(tmp)) {
        so = mp.get(tmp) + 1;
      } else {
        so = 1;
      }
      mp.put(tmp, so);
      arr.add(new MatHang(tmp + String.format("%02d", so), ten, sc.nextInt(), sc.nextInt()));
    }
    Collections.sort(arr, new Comparator<MatHang>() {
      public int compare(MatHang t, MatHang t1) {
        return t1.chietKhau() - t.chietKhau();
      }
    });
    for (MatHang x : arr) {
      System.out.println(x);
    }
  }
}
