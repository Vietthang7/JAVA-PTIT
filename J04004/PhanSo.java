package J04004;

public class PhanSo {
  private long a, b;

  public PhanSo() {

  }

  public PhanSo(long a, long b) {
    this.a = a;
    this.b = b;
  }

  public long gcd(long a, long b) {
    if (b == 0) {
      return a;
    } else {
      return gcd(b, a % b);
    }
  }

  public PhanSo add (PhanSo x) {
    PhanSo res = new PhanSo();
    res.b = this.b * x.b;
    res.a = this.b * x.a + this.a * x.b;
    return res;
  }
  public void rutGon(){
    long gcd = gcd(this.a,this.b);
    this.a /= gcd;
    this.b /= gcd;
  }
  public String toString(){
    rutGon();
    return this.a + "/" + this.b;
  }

}
