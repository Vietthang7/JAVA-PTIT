package J06006;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = Integer.parseInt(sc.nextLine());
    ArrayList<KhachHang> kh = new ArrayList<>();
    for (int i = 1; i <= t; i++) {
      kh.add(
          new KhachHang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    int k = Integer.parseInt(sc.nextLine());
    ArrayList<matHang> mh = new ArrayList<>();
    for (int i = 1; i <= k; i++) {
      mh.add(new matHang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
          Long.parseLong(sc.nextLine())));
    }
    int m = Integer.parseInt(sc.nextLine());
    ArrayList<HoaDon> hd = new ArrayList<>();
    for (int i = 1; i <= m; i++) {
      String[] x = sc.nextLine().trim().split("\\s+");
      hd.add(new HoaDon("HD" + String.format("%03d", i), x[0].trim(), x[1].trim(), Long.parseLong(x[2]), kh, mh));
    }
    Collections.sort(hd, new Comparator<HoaDon>() {
      public int compare(HoaDon t, HoaDon t1) {
        if (t.getLoiNhuan() != t1.getLoiNhuan()) {
          if (t.getLoiNhuan() <= t1.getLoiNhuan()) {
            return 1;
          } else {
            return -1;
          }
        } else {
          return t.getMaHD().compareTo(t1.getMaHD());
        }
      }
    });
    for (HoaDon x : hd) {
      System.out.println(x);
    }
  }
}
