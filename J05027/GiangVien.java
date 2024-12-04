package J05027;

public class GiangVien {
  private String ma, ten, nganh;

  public GiangVien(String ma, String ten, String nganh) {
    this.ma = ma;
    this.ten = ten;
    this.nganh = nganh;
  }

  public String getTen() {
    return ten;
  }

  public String nganh() {
    String res = this.nganh.toUpperCase();
    String[] a = res.split("\\s+");
    String result = "";
    for (String x : a) {
      result += x.charAt(0);
    }
    return result;
  }

  public String toString() {
    return this.ma + " " + this.ten + " " + nganh();
  }

}
