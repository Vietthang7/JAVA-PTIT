package J05053;

public class donHang {
  private String ten, ma;
  private double donGia, soLuong;

  public donHang(String ten, String ma, double donGia, double soLuong) {
    this.ten = ten;
    this.ma = ma;
    this.donGia = donGia;
    this.soLuong = soLuong;
  }

  public double giamGia() {
    String res = this.ma.substring(this.ma.length() - 1);
    if (res.compareTo("1") == 0) {
      return 0.5 * this.donGia * this.soLuong;
    } else {
      return 0.3 * this.donGia * this.soLuong;
    }
  }

  public String stt() {
    return this.ma.substring(1, 4);
  }

  public double thanhTien() {
    return this.soLuong * this.donGia - giamGia();
  }

  public String toString() {
    return this.ten + " " + this.ma + " " + stt() + " " + String.format("%.0f", giamGia()) + " "
        + String.format("%.0f", thanhTien());
  }
}
