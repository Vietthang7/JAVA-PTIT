package J05009;

public class ThuKhoa {
  private String ma, ten, ngaySinh;
  double diem1, diem2, diem3;

  public ThuKhoa(String ma, String ten, String ngaySinh, double diem1, double diem2, double diem3) {
    this.ma = ma;
    this.ten = ten;
    this.ngaySinh = ngaySinh;
    this.diem1 = diem1;
    this.diem2 = diem2;
    this.diem3 = diem3;
  }

  public Double tongDiem() {
    return this.diem1 + this.diem2 + this.diem3;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.ngaySinh + " " + String.format("%.1f", tongDiem());
  }
}
