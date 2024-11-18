package J06003;

public class SinhVien {
  private String ma, ten, sdt, stt;

  public SinhVien(String ma, String ten, String sdt, String stt) {
    this.ma = ma;
    this.ten = ten;
    this.sdt = sdt;
    this.stt = stt;
  }

  public void chuanHoa() {
    String[] a = this.ten.trim().split("\\s+");
    String name = "";
    for (String x : a) {
      name += Character.toUpperCase(x.charAt(0));
      for (int i = 1; i < x.length(); i++) {
        name += Character.toLowerCase(x.charAt(i));
      }
      name += " ";
    }
    ten = name.trim();
  }

  public String getStt() {
    return stt;
  }

  public String toString() {
    chuanHoa();
    return this.ma + " " + this.ten + " " + this.sdt;
  }
}
