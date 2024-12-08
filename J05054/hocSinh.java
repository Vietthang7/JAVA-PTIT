package J05054;

public class hocSinh {
  private String ma, ten;
  private double diem, xepHang;

  public hocSinh(String ma, String ten, double diem) {
    this.ma = ma;
    this.ten = ten;
    this.diem = diem;
  }

  public String getMa() {
    return ma;
  }

  public double getDiem() {
    return diem;
  }

  public void setXepHang(double xepHang) {
    this.xepHang = xepHang;
  }

  public double getXepHang() {
    return xepHang;
  }

  public String xepLoai() {
    if (this.diem >= 9) {
      return "Gioi";
    } else if (this.diem >= 7) {
      return "Kha";
    } else if (this.diem >= 5) {
      return "Trung Binh";
    } else {
      return "Yeu";
    }
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + String.format("%.1f", diem) + " " + xepLoai() + " "
        + String.format("%.0f", xepHang);
  }
}
