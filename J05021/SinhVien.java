package J05021;

public class SinhVien {
  private String ma, ten, lop, email;

  public SinhVien(String ma, String ten, String lop, String email) {
    this.ma = ma;
    this.ten = ten;
    this.lop = lop;
    this.email = email;
  }

  public String getMa() {
    return ma;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
  }
}
