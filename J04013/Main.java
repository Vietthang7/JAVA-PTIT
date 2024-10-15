package J04013;

import java.util.*;

class ThiSinh {
  private String ma, ten;
  double d1, d2, d3;

  public ThiSinh(String ma, String ten, double d1, double d2, double d3) {
    this.ma = ma;
    this.ten = ten;
    this.d1 = d1;
    this.d2 = d2;
    this.d3 = d3;
  }

  public String getDiemUuTien() {
    return this.ma.substring(2, 3);
  }

  public double DiemUuTien() {
    String kv = getDiemUuTien();
    if (kv.equals("2")) {
      return 1;
    }
    if (kv.equals("1")) {
      return 0.5;
    }
    return 2.5;
  }

  public double TongDiem() {
    return this.d1 * 2 + this.d2 + this.d3;
  }

  public double TongDiemDo() {
    return this.d1 * 2 + this.d2 + this.d3 + DiemUuTien();
  }

  public String toString() {
    String trangThai;
    if (TongDiemDo() >= 24.0) {
      trangThai = "TRUNG TUYEN";
    } else {
      trangThai = "TRUOT";
    }
    if (DiemUuTien() == 1.0) {
      if (TongDiem() == (int) TongDiem()) {
        return ma + " " + ten + " " + 1 + " " + (int) TongDiem() + " " + trangThai;
      } else {
        return ma + " " + ten + " " + 1 + " " + String.format("%.1f", TongDiem()) + " " + trangThai;
      }
    } else {
      if (TongDiem() == (int) TongDiem()) {
        return ma + " " + ten + " " + String.format("%.1f", DiemUuTien()) + " " + (int) TongDiem() + " " + trangThai;
      } else {
        return ma + " " + ten + " " + String.format("%.1f", DiemUuTien()) + " " + String.format("%.1f", TongDiem())
            + " " + trangThai;
      }
    }
  }

}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ma = sc.nextLine();
    String ten = sc.nextLine();
    double d1 = sc.nextDouble();
    double d2 = sc.nextDouble();
    double d3 = sc.nextDouble();
    System.out.println(new ThiSinh(ma, ten, d1, d2, d3));

  }
}
