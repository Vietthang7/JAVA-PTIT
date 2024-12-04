package J05028;

public class doanhNghiep {
  private String maDN, tenDN;
  private int soLuong;

  public doanhNghiep() {
  }

  public doanhNghiep(String maDN, String tenDN, int soLuong) {
      this.maDN = maDN;
      this.tenDN = tenDN;
      this.soLuong = soLuong;
  }

  public String getMaDN() {
      return maDN;
  }

  public int getSoLuong() {
      return soLuong;
  }

  public String toString() {
      return this.maDN + " " + this.tenDN + " " + this.soLuong;
  }
}
