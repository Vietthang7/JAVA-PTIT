package J05036;

public class matHang {
  private String ma, ten, donVi;
  private Integer dongiaNhap, soLuong;

  public matHang(String ma, String ten, String donVi, Integer dongiaNhap, Integer soLuong) {
    this.ma = ma;
    this.ten = ten;
    this.donVi = donVi;
    this.dongiaNhap = dongiaNhap;
    this.soLuong = soLuong;
  }

  public int phiVanChuyen() {
    return (int) Math.round((this.dongiaNhap * this.soLuong) * 0.05);
  }

  public int thanhTien() {
    return this.dongiaNhap * this.soLuong + phiVanChuyen();
  }

  public int giaBan() {
    return (int) Math.round((thanhTien() + 0.02 * thanhTien()));
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.donVi + " " + this.phiVanChuyen() + " " + this.thanhTien() + " " + this.giaBan();
  }
}
