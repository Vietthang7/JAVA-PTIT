package J05018;

public class BangDiem {
  private String ma, ten;
  private double diem1, diem2, diem3, diem4, diem5, diem6, diem7, diem8, diem9, diem10;

  public BangDiem(String ma, String ten, double diem1, double diem2, double diem3, double diem4, double diem5,
      double diem6, double diem7, double diem8, double diem9, double diem10) {
    this.ma = ma;
    this.ten = ten;
    this.diem1 = diem1;
    this.diem2 = diem2;
    this.diem3 = diem3;
    this.diem4 = diem4;
    this.diem5 = diem5;
    this.diem6 = diem6;
    this.diem7 = diem7;
    this.diem8 = diem8;
    this.diem9 = diem9;
    this.diem10 = diem10;
  }

  public String getMa() {
    return ma;
  }

  public double diemTB() {
    double res = (this.diem1 * 2 + this.diem2 * 2 + this.diem3 + this.diem4 + this.diem5 + this.diem6 + this.diem7
        + this.diem8 + this.diem9 + this.diem10) / 12.0;
    return (double) Math.round(res * 10) / 10;
  }

  public String HocLuc() {
    String res;
    double tb = diemTB();
    if (tb >= 9.0) {
      res = "XUAT SAC";
    } else if (tb >= 8.0) {
      res = "GIOI";
    } else if (tb >= 7.0) {
      res = "KHA";
    } else if (tb >= 5.0) {
      res = "TB";
    } else
      res = "YEU";
    return res;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + String.format("%.1f", diemTB()) + " " + HocLuc();
  }

}
