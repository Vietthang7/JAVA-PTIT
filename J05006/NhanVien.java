package J05006;

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

  public String toString() {
    return this.ma + " " + this.ten + " " + this.sex + " " + this.ngaySinh + " " + this.address + " " + this.maSoThue
        + " " + this.hopDong;
  }
}
