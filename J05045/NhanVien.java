package J05045;

public class NhanVien {
  private String ma, ten, chucVu;
  private int luongCB, ngayCong;

  public NhanVien(String ma, String ten, String chucVu, int luongCB, int ngayCong) {
    this.ma = ma;
    this.ten = ten;
    this.chucVu = chucVu;
    this.luongCB = luongCB;
    this.ngayCong = ngayCong;
  }
  
  public String getMa() {
    return ma;
  }

  public int phuCap() {
    if (this.chucVu.compareTo("GD") == 0) {
      return 500;
    } else if (this.chucVu.compareTo("PGD") == 0) {
      return 400;
    } else if (this.chucVu.compareTo("TP") == 0) {
      return 300;
    } else if (this.chucVu.compareTo("KT") == 0) {
      return 250;
    }
    return 100;
  }

  public int luongThang() {
    return this.luongCB * this.ngayCong;
  }

  public int tongLuong() {
    return luongThang() + phuCap();
  }

  public int tamUng() {
    double tamUngThuc = (tongLuong() * 2.0 / 3);
    if (tamUngThuc < 25000) {
      return (int) (Math.round(tamUngThuc / 1000) * 1000);
    }
    return 25000;
  }

  public String getChucVu() {
    return chucVu;
  }

  public int conLai() {
    return tongLuong() - tamUng();
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + phuCap() + " " + luongThang() + " " + tamUng() + " " + conLai();
  }

}
