package J05007;

public class NhanVien {
  private String ma, ten, sex, ngaySinh, address, maSoThue, hopDong;

  public NhanVien(String ma, String ten, String sex, String ngaySinh, String address, String maSoThue, String hopDong) {
    this.ma = ma;
    this.ten = ten;
    this.sex = sex;
    this.ngaySinh = ngaySinh;
    this.address = address;
    this.maSoThue = maSoThue;
    this.hopDong = hopDong;
  }

  public NhanVien() {

  }

  public String getTuoi() {
    String[] x = this.ngaySinh.split("/");
    StringBuilder sb = new StringBuilder();
    sb.append(x[2]);
    sb.append(x[1]);
    sb.append(x[0]);
    return sb.toString();
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.sex + " " + this.ngaySinh + " " + this.address + " " + this.maSoThue
        + " " + this.hopDong;
  }
}
