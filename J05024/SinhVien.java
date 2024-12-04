package J05024;

public class SinhVien {
  private String ma, ten, lop, email;

  public SinhVien() {
  }

  public SinhVien(String ma, String ten, String lop, String email) {
    this.ma = ma;
    this.ten = ten;
    this.lop = lop;
    this.email = email;
  }

  public String getNganh() {
    String s = "";
    if (this.ma.contains("DCKT")) {
      s = "Ke toan";
    }
    if (this.ma.contains("DCVT")) {
      s = "Vien thong";
    }
    if (this.ma.contains("DCDT")) {
      s = "Dien tu";
    }
    if (this.ma.contains("DCCN") && this.lop.charAt(0) != 'E') {
      s = "Cong nghe thong tin";
    }
    if (this.ma.contains("DCAT") && this.lop.charAt(0) != 'E') {
      s = "An toan thong tin";
    }
    return s;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.lop + " " + this.email;
  }
}
