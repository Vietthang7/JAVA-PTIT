package J05042;

public class SinhVien {
  private String ten;
  private int accepted, submit;

  public SinhVien(String ten, int accepted, int submit) {
    this.ten = ten;
    this.accepted = accepted;
    this.submit = submit;
  }

  public String getTen() {
    return ten;
  }

  public int getAccepted() {
    return accepted;
  }

  public int getSubmit() {
    return submit;
  }

  public String toString() {
    return this.ten + " " + this.accepted + " " + this.submit;
  }
}
