package J06001;

public class SanPham {
  private String ma, ten;
  private long giaLoai1, giaLoai2;

  public SanPham(String ma, String ten, long giaLoai1, long giaLoai2) {
    this.ma = ma;
    this.ten = ten;
    this.giaLoai1 = giaLoai1;
    this.giaLoai2 = giaLoai2;
  }

  public String getMa() {
    return ma;
  }

  public String getTen() {
    return ten;
  }

  public long getGiaLoai1() {
    return giaLoai1;
  }

  public long getGiaLoai2() {
    return giaLoai2;
  }

}
