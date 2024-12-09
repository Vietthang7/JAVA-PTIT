package J06005;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<KhachHang> kh = new ArrayList<>();
    int n = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= n; i++) {
      kh.add(
          new KhachHang("KH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
    }
    int m = Integer.parseInt(sc.nextLine());
    ArrayList<MatHang> mh = new ArrayList<>();
    for (int i = 1; i <= m; i++) {
      mh.add(new MatHang("MH" + String.format("%03d", i), sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()),
          Long.parseLong(sc.nextLine())));
    }
    int k = Integer.parseInt(sc.nextLine());
    ArrayList<HoaDon> hd = new ArrayList<>();
    for (int i = 1; i <= k; i++) {
      String[] x = sc.nextLine().split("\\s+");
      hd.add(new HoaDon("HD" + String.format("%03d", i), x[0].trim(), x[1].trim(), Long.parseLong(x[2]), kh, mh));
    }
    for (HoaDon x : hd) {
      System.out.println(x);
    }

  }
}
