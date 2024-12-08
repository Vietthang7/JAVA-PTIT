package J05051;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<khachHang> kh = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      sc.nextLine();
      kh.add(new khachHang("KH" + String.format("%02d", i + 1), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
    }
    Collections.sort(kh, new Comparator<khachHang>() {
      public int compare(khachHang t, khachHang t1) {
        if (t.tongTien() <= t1.tongTien()) {
          return 1;
        } else {
          return -1;
        }
      }
    });
    for (khachHang x : kh) {
      System.out.println(x);
    }
  }
}
