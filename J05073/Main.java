package J05073;

import java.util.*;

class DonHang {
  private String maDH;
  private long giaBan, soLuong;
  private double tien, thue, vanChuyen, tongTien;

  public DonHang(String maDH, long giaBan, long soLuong) {
    this.maDH = maDH;
    this.giaBan = giaBan;
    this.soLuong = soLuong;
  }

  public void tinhTong() {
    this.tien = this.giaBan * this.soLuong;
    this.thue = 0.0;
    this.vanChuyen = 0.0;
    if (this.maDH.startsWith("T")) {
      this.thue += this.tien * 29.0 / 100.0;
      this.vanChuyen += this.tien * 4.0 / 100.0;
    } else if (this.maDH.startsWith("C")) {
      this.thue += this.tien * 10.0 / 100.0;
      this.vanChuyen += this.tien * 3.0 / 100.0;
    } else if (this.maDH.startsWith("D")) {
      this.thue += this.tien * 8.0 / 100.0;
      this.vanChuyen += this.tien * 2.5 / 100.0;
    } else {
      this.thue += this.tien * 2.0 / 100.0;
      this.vanChuyen += this.tien * 0.5 / 100.0;
    }
    if (this.maDH.endsWith("C")) {
      this.thue -= 5.0 / 100.0 * this.thue;
    }
    this.tongTien = (this.tien + this.thue + this.vanChuyen) * 120 / 100;
    this.tongTien /= this.soLuong;
  }

  public String toString() {
    tinhTong();
    return this.maDH + " " + String.format("%.2f", this.tongTien);
  }
}

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int t = sc.nextInt();
  sc.nextLine();
  while (t-- > 0) {
  String []x = (sc.nextLine().trim().split("\\s+"));
  DonHang dh = new DonHang(x[0], Long.parseLong(x[1]), Long.parseLong(x[2]));
  System.out.println(dh);
  }
  }
}
