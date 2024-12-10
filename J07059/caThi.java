package J07059;

public class caThi {
  private String ma, ngay, gioThi, phongThi;

  public caThi(String ma, String ngay, String gioThi, String phongThi) {
    this.ma = ma;
    this.ngay = ngay;
    this.gioThi = gioThi;
    this.phongThi = phongThi;
  }

  public String getMa() {
    return ma;
  }

  public String getGioThi() {
    return gioThi;
  }

  public String ngayThi() {
    String[] x = this.ngay.split("/");
    StringBuilder sb = new StringBuilder("");
    sb.append(x[2]);
    sb.append(x[1]);
    sb.append(x[0]);
    return sb.toString();
  }

  public String toString() {
    return this.ma + " " + this.ngay + " " + this.gioThi + " " + this.phongThi;
  }
}
