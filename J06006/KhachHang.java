package J06006;

public class KhachHang {
  private String maKH, tenKH, sex, ngaySinh, diaChi;

  public KhachHang(String maKH, String tenKH, String sex, String ngaySinh, String diaChi) {
    this.maKH = maKH;
    this.tenKH = tenKH;
    this.sex = sex;
    this.ngaySinh = ngaySinh;
    this.diaChi = diaChi;
  }

  public String getMaKH() {
    return maKH;
  }

  public String getTenKH() {
    return tenKH;
  }

  public String getDiaChi() {
    return diaChi;
  }

}
