package J06002;

public class HoaDon {
  private String ma, ten;
  private long giamGia, tongTien;

  public HoaDon(String ma, String ten, long giamGia, long tongTien) {
    this.ma = ma;
    this.ten = ten;
    this.giamGia = giamGia;
    this.tongTien = tongTien;
  }

  public long getTongTien() {
    return tongTien;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + this.giamGia + " " + this.tongTien;
  }
}
