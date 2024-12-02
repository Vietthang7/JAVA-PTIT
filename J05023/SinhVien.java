package J05023;

public class SinhVien {
  private String ma, ten, lop, email;

  public SinhVien(String ma, String ten, String lop, String email) {
    this.ma = ma;
    this.ten = ten;
    this.lop = lop;
    this.email = email;
  }

  public String getLop() {
    return lop;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
  }
}
