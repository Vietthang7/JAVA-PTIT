package J06001;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    ArrayList<SanPham> arr = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      arr.add(new SanPham(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
    }
    int m = Integer.parseInt(sc.nextLine());
    for (int i = 1; i <= m; i++) {
      String[] hd = sc.nextLine().trim().split("\\s+");
      String maSp = hd[0].substring(0, hd[0].length() - 1);
      String loaiSp = hd[0].substring(hd[0].length() - 1);
      long soLuong = Long.parseLong(hd[1]);
      for (SanPham x : arr) {
        if (x.getMa().compareTo(maSp) == 0) {
          long giamGia = 0;
          long thanhTien = 0;
          if (loaiSp.compareTo("1") == 0) {
            thanhTien = soLuong * x.getGiaLoai1();
          } else {
            thanhTien = soLuong * x.getGiaLoai2();
          }
          if (soLuong >= 150) {
            giamGia += Math.round(0.5 * thanhTien);
          } else if (soLuong >= 100) {
            giamGia += Math.round(0.3 * thanhTien);
          } else if (soLuong >= 50) {
            giamGia += Math.round(0.15 * thanhTien);
          }
          long tongTien = thanhTien - giamGia;
          System.out
              .println(hd[0] + "-" + String.format("%03d", i) + " " + x.getTen() + " " + giamGia + " " + tongTien);
        }
      }
    }
  }
}
