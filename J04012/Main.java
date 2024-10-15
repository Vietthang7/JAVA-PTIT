package J04012;

import java.util.*;

class NhanVien {
  private String ten, chucvu;
  private long luongCoBan, soNgayCong;

  public NhanVien(String ten, String chucvu, long luongCoBan, long soNgayCong) {
    this.ten = ten;
    this.chucvu = chucvu;
    this.luongCoBan = luongCoBan;
    this.soNgayCong = soNgayCong;
  }

  public String getChucvu() {
    return chucvu;
  }

  public long getLuongCoBan() {
    return luongCoBan;
  }

  public long getSoNgayCong() {
    return soNgayCong;
  }

  public long PhuCap() {
    String cv = getChucvu();
    if (cv.equals("GD")) {
      return 250000;
    }
    if (cv.equals("PGD")) {
      return 200000;
    }
    if (cv.equals("TP")) {
      return 180000;
    }
    return 150000;
  }

  public long TienLuong() {
    return this.luongCoBan * this.soNgayCong;
  }

  public long TienThuong() {
    long TienLuong = TienLuong();
    long day = getSoNgayCong();
    if (day >= 25) {
      return (long)(TienLuong *  20 / 100);
    }
    if (day < 25 && day >= 22) {
      return (long)(TienLuong * 10 / 100);
    }
    return 0;
  }

  public long ThuNhap() {
    return TienLuong() + TienThuong() + PhuCap();
  }

  public String toString() {
    return "NV01 " + ten + " " + TienLuong() + " " + TienThuong() + " " + PhuCap() + " " + ThuNhap();
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ten = sc.nextLine();
    long luongCB = sc.nextLong();
    long day = sc.nextLong();
    sc.nextLine();
    String chucvu = sc.nextLine();
    System.out.println(new NhanVien(ten, chucvu, luongCB, day));
  }
}
