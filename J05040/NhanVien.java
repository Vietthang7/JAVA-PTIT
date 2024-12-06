package J05040;

public class NhanVien {
  private String ma, ten, chucVu;
  private int luong, ngayCong;

  public NhanVien(String ma, String ten, int luong, int ngayCong, String chucVu) {
    this.ma = ma;
    this.ten = ten;
    this.luong = luong;
    this.ngayCong = ngayCong;
    this.chucVu = chucVu;
  }

  public int luongThang() {
    return this.luong * this.ngayCong;
  }

  public int thuong() {
    if (this.ngayCong >= 25) {
      return (int) (luongThang() * 0.2);
    } else if (this.ngayCong >= 22) {
      return (int) (luongThang() * 0.1);
    }
    return 0;
  }

  public int PhuCap() {
    if (this.chucVu.compareTo("GD") == 0) {
      return 250000;
    } else if (this.chucVu.compareTo("PGD") == 0) {
      return 200000;
    } else if (this.chucVu.compareTo("TP") == 0) {
      return 180000;
    }
    return 150000;
  }

  public int tongLuong() {
    return luongThang() + thuong() + PhuCap();
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + luongThang() + " " + thuong() + " " + PhuCap() + " " + tongLuong();
  }
}
