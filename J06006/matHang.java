package J06006;

public class matHang {
  private String maMH, tenMH, donVi;
  private long giaMua, giaBan;

  public matHang(String maMH, String tenMH, String donVi, long giaMua, long giaBan) {
    this.maMH = maMH;
    this.tenMH = tenMH;
    this.donVi = donVi;
    this.giaMua = giaMua;
    this.giaBan = giaBan;
  }

  public String getMaMH() {
    return maMH;
  }

  public String getTenMH() {
    return tenMH;
  }

  public long getGiaMua() {
    return giaMua;
  }

  public long getGiaBan() {
    return giaBan;
  }

}
