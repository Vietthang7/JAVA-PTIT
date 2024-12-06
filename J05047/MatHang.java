package J05047;

public class MatHang {
  private String ma, ten;
  private int soLuong, donGia;

  public MatHang(String ma, String ten, int soLuong, int donGia) {
    this.ma = ma;
    this.ten = ten;
    this.soLuong = soLuong;
    this.donGia = donGia;
  }

  public double phanTram() {
    if (this.soLuong > 10) {
      return 0.05;
    } else if (this.soLuong >= 8) {
      return 0.02;
    } else if (this.soLuong >= 5) {
      return 0.01;
    }
    return 0;
  }

  public int chietKhau() {
    return (int) (this.soLuong * this.donGia * phanTram());
  }

  public int hoaDon() {
    return (int) this.soLuong * this.donGia - chietKhau();
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + chietKhau() + " " + hoaDon();
  }

}
