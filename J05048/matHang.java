package J05048;

public class matHang {
  private String ma;
  private long nhap;

  public matHang(String ma, long nhap) {
    this.ma = ma;
    this.nhap = nhap;
  }

  public long xuat() {
    if (this.ma.charAt(0) == 'A') {
      return Math.round(0.6 * this.nhap);
    } else {
      return Math.round(0.7 * this.nhap);
    }
  }

  public long donGia() {
    if (this.ma.charAt(this.ma.length() - 1) == 'Y') {
      return 110000;
    } else {
      return 135000;
    }
  }

  public long tien() {
    return donGia() * xuat();
  }

  public long Thue() {
    char dau = this.ma.charAt(0);
    char cuoi = this.ma.charAt(this.ma.length() - 1);
    if (dau == 'A' && cuoi == 'Y') {
      return Math.round(0.08 * tien());
    } else if (dau == 'A' && cuoi == 'N') {
      return Math.round(0.11 * this.tien());
    } else if (dau == 'B' && cuoi == 'Y') {
      return Math.round(0.17 * tien());
    } else {
      return Math.round(0.22 * this.tien());
    }
  }

  public String toString() {
    return this.ma + " " + this.nhap + " " + xuat() + " " + donGia() + " " + tien() + " " + Thue();
  }

}
