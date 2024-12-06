package J05037;

public class matHang {
  private String ma, ten, donVi;
  private Integer donGiaNhap, soLuong;

  public matHang(String ma, String ten, String donVi, Integer donGiaNhap, Integer soLuong) {
    this.ma = ma;
    this.ten = ten;
    this.donVi = donVi;
    this.donGiaNhap = donGiaNhap;
    this.soLuong = soLuong;
  }

  public int phiVanChuyen() {
    return (int) Math.round((this.donGiaNhap * this.soLuong) * 0.05);
  }

  public int thanhTien() {
    return this.donGiaNhap * this.soLuong + phiVanChuyen();
  }

  public int giaBan() {
    return (int) Math.ceil((1.02 * thanhTien() / this.soLuong) / 100) * 100;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.donVi + " " + this.phiVanChuyen() + " " + this.thanhTien() + " "
        + this.giaBan();
  }
}
