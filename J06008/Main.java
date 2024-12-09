package J06008;

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
      gv.add(new GiangVien(x[0], res));
    }
    int q = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= q; i++) {
      String[] x = sc.nextLine().trim().split("\\s+");
      String maGV = x[0];
      String maMH = x[1];
      double gioChuan = Double.parseDouble(x[2]);
      for (GiangVien h : gv) {
        if (h.getMaGV().compareTo(maGV) == 0) {
          h.setTongGio(h.getTongGio() + gioChuan);
          for (MonHoc vt : mh) {
            if (vt.getMaMH().compareTo(maMH) == 0) {
              StringBuilder sb = new StringBuilder("");
              sb.append(vt.getTenMH());
              sb.append(" ");
              sb.append(x[2]);
              h.dsMon.add(sb.toString());
              break;
            }
          }
          break;
        }
      }
    }
    String keyword = sc.nextLine();
    for (GiangVien k : gv) {
      if (k.getMaGV().compareTo(keyword) == 0) {
        System.out.println("Giang vien: " + k.getTenGV());
        for (String vt : k.dsMon) {
          System.out.println(vt);
        }
        System.out.println("Tong: " + String.format("%.2f", k.getTongGio()));
        return;
      }
    }
  }
}
