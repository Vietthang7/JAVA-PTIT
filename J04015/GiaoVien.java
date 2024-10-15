package J04015;

import java.util.*;

public class GiaoVien {
  private String chucvu, ten;
  private int luongCB;

  public GiaoVien(String chucvu, String ten, int luongCB) {
    this.chucvu = chucvu;
    this.ten = ten;
    this.luongCB = luongCB;
  }

  public int getBacLuong() {
    return Integer.parseInt(this.chucvu.substring(2));
  }

  public String getChucVu() {
    return this.chucvu.substring(0, 2);
  }

  public int PhuCap() {
    String cv = getChucVu();
    if (cv.equals("HT")) {
      return 2000000;
    }
    if (cv.equals("HP")) {
      return 900000;
    }
    return 500000;
  }

  public int ThuNhap() {
    return this.luongCB * getBacLuong() + PhuCap();
  }

  public String toString() {
    return chucvu + " " + ten + " " + getChucVu() + " " + PhuCap() + " " + ThuNhap();
  }
}
