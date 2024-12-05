package J05035;

public class SinhVien {
  private String stt, ma, hoTen, lop, email, doanhNghiep;

  public SinhVien(String stt, String ma, String hoTen, String lop, String email, String doanhNghiep) {
    this.stt = stt;
    this.ma = ma;
    this.hoTen = hoTen;
    this.lop = lop;
    this.email = email;
    this.doanhNghiep = doanhNghiep;
  }

  public String getMa() {
    return ma;
  }

  public String getDoanhNghiep() {
    return doanhNghiep;
  }

  public String toString() {
    return this.stt + " " + this.ma + " " + this.hoTen + " " + this.lop + " " + this.email + " " + this.doanhNghiep;
  }
}
