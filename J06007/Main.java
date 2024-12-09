package J06007;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<MonHoc> mh = new ArrayList<>();
    int t = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= t; i++) {
      String[] x = sc.nextLine().trim().split("\\s+");
      String res = "";
      for (int k = 1; k < x.length; k++) {
        res += x[k] + " ";
      }
      res.trim();
      mh.add(new MonHoc(x[0], res));
    }
    ArrayList<GiangVien> gv = new ArrayList<>();
    int m = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= m; i++) {
      String[] x = sc.nextLine().trim().split("\\s+");
      String res = "";
      for (int k = 1; k < x.length; k++) {
        res += x[k] + " ";
      }
      res.trim();
      gv.add(new GiangVien(x[0], res, mh));
    }
    int q = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= q; i++) {
      String[] x = sc.nextLine().trim().split("\\s+");
      double gioChuan = Double.parseDouble(x[2]);
      String maGV = x[0];
      for (GiangVien h : gv) {
        if (h.getMaGV().compareTo(maGV) == 0) {
          h.setGioChuan(h.getGioChuan() + gioChuan);
          break;
        }
      }
    }
    for (GiangVien x : gv) {
      System.out.println(x);
    }
  }
}
